<%@ page isELIgnored="false" pageEncoding="utf-8" %>

	
<script type="text/javascript">
$(function(){

	//名称- 初始化
	$("#guru_name").textbox({
		required:true
		
	});
	//路径- 初始化
	$("#guru_profile").textbox({
		required:true
		
	});
	//状态- 初始化
	$("#guru_status").textbox({
		required:true
		
	});
	//简介- 初始化
	$("#guru_brief").textbox({
		required:true
		
	});
	// 初始化 表单中的 提交按钮
	$("#keepGuru").linkbutton({
		iconCls:"icon-ok",//引入图片
		onClick:function(){//注册事件
			$("#GuruForm").form("submit",{
				url:"${pageContext.request.contextPath}/bannerControll/addBanner.do",
				onSubmit:function(){//表单验证
					return $("#GuruForm").form("validate");
				},
				success:function(){//成功后的回调
					$("#GuruDH").dialog("close"),//关闭窗口
					$.messager.show({
					title:"系统提示",
					msg:"添加成功",
					});
					$("#datagridGuru").datagrid("load");//自动更新表单数据
				}
			});
		}
	});
	
	// 初始化 表单中的 重置按钮
	$("#resettingGuru").linkbutton({
		iconCls:"icon-reload",//引入图片
		onClick:function(){//注册事件
			$("#GuruForm").form("reset");//清除数据
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
<h3>添加-上师</h3>
<form id="GuruForm" method="post" >
	<!-- 文本框-标签 -->
	上师名称：<input id="guru_name" name="guru_name"><br>
	头像路径：<input id="guru_profile" name="guru_profile"><br>
	上师状态：<input id="guru_status" name="guru_status"><br>
	上师简介：<input id="guru_brief" name="guru_brief"><br>
	<br>
	<a id="keepGuru">提交</a> 
	<a id="resettingGuru">重置</a> 
</form>