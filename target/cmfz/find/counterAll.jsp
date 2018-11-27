<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		//页面加载后   计数器模块
		$(function(){
			//表单 查所有
			$("#datagridUserCounter").datagrid({
				url:"${pageContext.request.contextPath}/counterController/selectUidCid.do?user_id="+userId+"&course_id="+course_id,
				fitColumns:true,//适应网络宽度 配合 列里面的width
			});
		});
		</script>
			<table class="table" id="datagridUserCounter" singleSelect="true">
				<thead>
				<tr class="table_header">
					<th data-options="field:'counter_title',width:0">
						计数器名称
					</th>
					<th data-options="field:'counter_count',width:0">
						击打次数
					</th>
					<th data-options="field:'counter_createTime',width:10">
						创建时间
					</th>
				</tr>
				</thead>
			</table>
 			
