<%@ page isELIgnored="false" pageEncoding="utf-8" %>

	
<script type="text/javascript">
$(function(){
	//初始化上传对话框
	$("#BannerForm").form({
    url:"${pageContext.request.contextPath}/chapterController/insertChapter.do?chapter_id="+chapter_id,    
    success:function(data){  //成功后的回调   ?chapter_id="+chapter_id
          	$("#ChapterAddDH").dialog("close"),//关闭窗口
			$.messager.show({
				title:"系统提示",
				msg:"添加成功",
			});
			$("#datagridChapter").datagrid("load");//自动更新表单数据
    }    
});    
	
});
</script>
<form id="BannerForm" method="post"  enctype="multipart/form-data">
	<!-- 文本框-标签 -->
	<input type="file" id="banner_status" name="Chapter"><br><br>
	<input type="submit" value="上传">
</form>