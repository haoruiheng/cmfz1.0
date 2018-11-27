<%@ page isELIgnored="false" pageEncoding="utf-8" %>
<div data-options="region:'north',split:true" style="height:60px;background-color:  #5C160C">
    	<div style="font-size: 24px;color: #FAF7F7;font-family: 楷体;font-weight: 900;width: 500px;float:left;padding-left: 20px;padding-top: 10px" >持名法州后台管理系统</div>
    	<div style="font-size: 16px;color: #FAF7F7;font-family: 楷体;width: 300px;float:right;padding-top:15px">欢迎您:${sessionScope.admin.cmfz_username} &nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/adminController/deleteAd.do" class="easyui-linkbutton" data-options="iconCls:'icon-01'">退出系统</a></div>
</div>   
