<%@  page isELIgnored="false" pageEncoding="utf-8" %>
<script type="text/javascript">
$(function(){
		//初始化选项卡
		$("#tabs1").tabs({
			fit:true,
		});
	});
</script>

<!-- 创建选项卡 -->
<div id="tabs1">
		<div data-options="title:'首页' ">
	 		<img src="${pageContext.request.contextPath}/main/image/shouye.jpg" border="0" />
	 	</div>
</div>