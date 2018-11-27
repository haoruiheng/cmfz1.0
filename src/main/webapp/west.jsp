<%@ page isELIgnored="false" pageEncoding="utf-8" %>

	<script type="text/javascript">
	$(function(){
		//初始化手风琴
		$.getJSON(
			"${pageContext.request.contextPath}/menuController/findAll.do",
			function(res){
				$.each(res,function(idx,c){//遍历集合  res:集合  c:集合元素
					var tent="";
					$.each(c.parent_idd,function(idx,cc){//遍历集合  res:集合  c:集合元素
						//定义一个变量存二级对象
						var s=JSON.stringify(cc);//把对象转换成JSON字符串
						tent+="<div onclick='addtabs("+s+")' data-options='plain:true' style='width:90%' class='easyui-linkbutton'>"+cc.cmfz_title+"</br>"+"</div>";
					}),
					$("#accordion1").accordion("add",{
						title:c.cmfz_title,
						content:tent
					});
				});
			}
		);
	});
	//定义二级界面 单击事件
		function addtabs(s){
			console.log(s.cmfz_url);
			//获取选项卡
			$("#tabs1").tabs("add",{
				title:s.cmfz_title,//标题
				closable:true,//关闭窗口按钮
				href:"${pageContext.request.contextPath}/find/"+s.cmfz_url+"",//加载界面
			}); 
		}

	</script>

<!-- 功能导航栏 -->
<div id="accordion1" class="easyui-accordion"></div>

