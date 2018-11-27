<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		var chapter_id;//专辑id
		//默认功课--页面加载后
		$(function(){
			//表单 查所有
			$("#datagridCourseS").datagrid({
				url:"${pageContext.request.contextPath}/courseController/selectCourse.do?marking=0",
				fitColumns:true,//适应网络宽度 配合 列里面的width
				toolbar:"#CourseS",//引入工具栏
				pagination:true,//打开分页工具
				pageSize:10,
				pageList:[5,10,15,20],
				//删/改超链接  变成-按钮  
				onLoadSuccess:function(date){//数据加载完 执行  参数是远程加载的数据
					console.log(date);
					//$.parser.parse('#cc');  解析参数指定的所有子对象
					//$("a[name=optBtn]").paretn();//通过标签属性值选择器  拿到操作.paretn()方法拿到父
					$.parser.parse($("a[name=optBtn]").parent());
				}
			});
		//初始化添加按钮
			$("#CourseSAdd").linkbutton({
				//注册事件  打开窗口
				onClick:function(){
					$("#CourseSDH").dialog("open");
				},
			});
			//初始化-添加对话框
			$("#CourseSDH").dialog({
				//设置大小
				width: 400,    
   				height: 200,
   				resizable:true, //设置大小可变
   				title:"添加专辑",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/add/AddBanner.jsp",
   				cache:false//清除缓存
   				
			});
			
		});
		//操作的  
		function myFormatter(value, row, idx){
			//console.log(row);
			return "<a  class='l-btn' href='javascript:void(0)' onclick='deleteCourse("+row.course_id+")'>删除</a>";
 		}
 		//删除-功能
		function deleteCourse(id){
			$.messager.confirm(
				"系统提示",
				"您确定要删除吗？",
				function(r){    
		    		if (r){ 
		    			/* $.post("${pageContext.request.contextPath}/Jspperson/deleteJspperson.do",
						//传参
						"id="+id, */
						$.get("${pageContext.request.contextPath}/courseController/deleteCoures.do?coures_id="+id,
						function(obj){
						$.messager.show({
								title:"系统提示",
								msg:"删除成功",
						});
						$("#datagridCourseS").datagrid("reload");//自动更新表单数据
						},
						"text");
		    		}
				});
				
			};
		</script>
			<table class="table" id="datagridCourseS" singleSelect="true">
				<thead>
				<tr class="table_header">
 					<!-- <th data-options="field:'xx',width:1,checkbox:false"></th> -->
					
					<th data-options="field:'course_title',width:1">
						课程名称
					</th>
					<th data-options="field:'xxx',formatter:myFormatter">
						操作
					</th>
				</tr>
				</thead>
			</table>
			<!-- 定义工具栏   -->
			<div id="CourseS">
				<!--   添加按钮 -->
				<a id="CourseSAdd">添加功课</a>	
			</div>
 			<!-- 添加-对话框 -->
			<div id="CourseSDH"></div>