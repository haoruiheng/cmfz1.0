<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		//用户模块--页面加载后  
		$(function(){
			//表单 查所有
			$("#datagridCourse").datagrid({
				url:"${pageContext.request.contextPath}/courseController/selectCourse.do?marking=1",
				fitColumns:true,//适应网络宽度 配合 列里面的width
				pagination:true,//打开分页工具
				pageSize:10,
				pageList:[5,10,15,20],
			});
		});
		</script>
			<table class="table" id="datagridCourse" singleSelect="true">
				<thead>
				<tr class="table_header">
					<th data-options="field:'course_title',width:1">
						课程名称
					</th>
				</tr>
				</thead>
			</table>
