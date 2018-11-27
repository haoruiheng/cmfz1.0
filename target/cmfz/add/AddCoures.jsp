<%@ page isELIgnored="false" pageEncoding="utf-8" %>

	
<script type="text/javascript">
$(function(){

	//名称- 初始化
	$("#course_title").textbox({
		required:true
		
	});
	//类型- 初始化
	$("#course_marking").textbox({
		required:true
		
	});
	
	// 初始化 表单中的 提交按钮
	$("#keepCourse").linkbutton({
		iconCls:"icon-ok",//引入图片
		onClick:function(){//注册事件
			$("#CourseForm").form("submit",{
				url:"${pageContext.request.contextPath}/bannerControll/addBanner.do",
				onSubmit:function(){//表单验证
					return $("#CourseForm").form("validate");
				},
				success:function(){//成功后的回调
					$("#CourseSDH").dialog("close"),//关闭窗口
					$.messager.show({
					title:"系统提示",
					msg:"添加成功",
					});
					$("#datagridCourseS").datagrid("load");//自动更新表单数据
				}
			});
		}
	});
	
	// 初始化 表单中的 重置按钮
	$("#resettingCourse").linkbutton({
		iconCls:"icon-reload",//引入图片
		onClick:function(){//注册事件
			$("#CourseForm").form("reset");//清除数据
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
<h3>添加-功课</h3>
<form id="CourseForm" method="post" >
	<!-- 文本框-标签 -->
	功课名称：<input id="course_title" name="course_title"><br>
	功课类型：<input id="course_marking" name="course_marking"><br>
	<br>
	<a id="keepCourse">提交</a> 
	<a id="resettingCourse">重置</a> 
</form>