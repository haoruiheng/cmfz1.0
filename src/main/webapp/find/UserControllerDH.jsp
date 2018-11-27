<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		var course_id;//功课id
		//页面加载后
		$(function(){
			//表单 查所有
			$("#datagridUserController").datagrid({
				url:"${pageContext.request.contextPath}/courseController/selectCourseOne.do?userId="+userId,
				fitColumns:true,//适应网络宽度 配合 列里面的width
				//删/改超链接  变成-按钮  
				onLoadSuccess:function(date){//数据加载完 执行  参数是远程加载的数据
					//$.parser.parse('#cc');  解析参数指定的所有子对象
					//$("a[name=optBtn]").paretn();//通过标签属性值选择器  拿到操作.paretn()方法拿到父
					$.parser.parse($("a[name=optBtn]").parent());
				}
			});
			//初始化-功课记录-对话框
			$("#CounterDH").dialog({
				//设置大小
				width: 400,    
   				height:200,
   				resizable:true, //设置大小可变
   				title:"课程记录",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/find/counterAll.jsp",
   				cache:false//清除缓存
   				
			});
		});
		//操作的  修改/删除功能
		function myFormatter(value, row, idx){
			return "<a  class='l-btn' href='javascript:void(0)' onclick='counters("+row.course_id+")'>功课记录</a>";
 		}
 		//功课记录-功能
 		function counters(id){
 			console.log(userId);
 			console.log(id);
 			//id赋值 全局变量
 			course_id=id;
 			//打开对话框
			$("#CounterDH").dialog("open");
 		}
		</script>
			<table class="table" id="datagridUserController" singleSelect="true">
				<thead>
				<tr class="table_header">
					<th data-options="field:'course_title',width:2">
						课程名称
					</th>
					<th data-options="field:'course_marking',width:1">
						课程类型
					</th>
					<th data-options="field:'x',formatter:myFormatter">
						操作
					</th>
				</tr>
				</thead>
			</table>
 			<!-- 功课记录-对话框 -->
			<div id="CounterDH"></div>
