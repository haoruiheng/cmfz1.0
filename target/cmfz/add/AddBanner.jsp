<%@ page isELIgnored="false" pageEncoding="utf-8" %>

	
<script type="text/javascript">
$(function(){

	//名称- 初始化
	$("#banner_title").textbox({
		required:true
		
	});
	//路径- 初始化
	$("#banner_imgPath").textbox({
		required:true
		
	});
	//状态- 初始化
	$("#banner_status").textbox({
		required:true
		
	});
	// 初始化 表单中的 提交按钮
	$("#keepBanner").linkbutton({
		iconCls:"icon-ok",//引入图片
		onClick:function(){//注册事件
			$("#BannerForm").form("submit",{
				url:"${pageContext.request.contextPath}/bannerControll/addBanner.do",
				onSubmit:function(){//表单验证
					return $("#BannerForm").form("validate");
				},
				success:function(){//成功后的回调
					$("#bannerDH").dialog("close"),//关闭窗口
					$.messager.show({
					title:"系统提示",
					msg:"添加成功",
					});
					$("#datagridBanner").datagrid("load");//自动更新表单数据
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
<h3>添加-轮播图</h3>
<form id="BannerForm" method="post" >
	<!-- 文本框-标签 -->
	轮播图名称：<input id="banner_title" name="banner_title"><br>
	轮播图路径：<input id="banner_imgPath" name="banner_imgPath"><br>
	轮播图状态：<input id="banner_status" name="banner_status"><br>
	<br>
	<a id="keepBanner">提交</a> 
	<a id="resettingBanner">重置</a> 
</form>