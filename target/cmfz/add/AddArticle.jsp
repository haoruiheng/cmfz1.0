<%@ page isELIgnored="false" pageEncoding="utf-8" %>

	
<script type="text/javascript">
$(function(){

	//名称- 初始化
	$("#article_title").textbox({
		required:true
		
	});
	//内容- 初始化
	$("#article_content").textbox({
		required:true
		
	});
	//插图- 初始化
	$("#article_figurePath").textbox({
		required:true
		
	});
	// 初始化 表单中的 提交按钮
	$("#keepArticle").linkbutton({
		iconCls:"icon-ok",//引入图片
		onClick:function(){//注册事件
			$("#ArticleForm").form("submit",{
				url:"${pageContext.request.contextPath}/articleController/insertArticle.do",
				onSubmit:function(){//表单验证
					return $("#ArticleForm").form("validate");
				},
				success:function(){//成功后的回调
					$("#ArticleDH").dialog("close"),//关闭窗口
					$.messager.show({
					title:"系统提示",
					msg:"添加成功",
					});
					$("#datagridArticle").datagrid("load");//自动更新表单数据
				}
			});
		}
	});
	
	// 初始化 表单中的 重置按钮
	$("#resettingBanner").linkbutton({
		iconCls:"icon-reload",//引入图片
		onClick:function(){//注册事件
			$("#BannerForm").form("reset");//清除数据
		} 
	});
	
	
	
	//自定义 验证规则
	$.extend($.fn.validatebox.defaults.rules, { 
	    //必须是数字
	    minNum:{
	    	//验证规则   
	        validator: function(value){ 
			// isNaN 判断参数是否是数字（true-不是数字,false-是数字）
				return !isNaN(value); 							 
	        }, 
	        message: "必须是数字"  
	    }
	});  
});
</script>
<h3>添加-文章</h3>
<form id="ArticleForm" method="post" >
	<!-- 文本框-标签 -->
	文章名称：<input id="article_title" name="article_title"><br>
	文章内容：<input id="article_content" name="article_content"><br>
	文章插图：<input id="article_figurePath" name="article_figurePath"><br>
	选择上师：<input id="article_guruId" name="article_guruId"><br>
	<br>
	<a id="keepArticle">提交</a> 
	<a id="resettingArticle">重置</a> 
</form>