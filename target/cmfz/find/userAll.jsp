<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		var userId;
		//页面加载后
		$(function(){
			//表单 查所有
			$("#datagridUser").datagrid({
				url:"${pageContext.request.contextPath}/userController/selectUser.do",
				fitColumns:true,//适应网络宽度 配合 列里面的width
				pagination:true,//打开分页工具
				pageSize:5,
				pageList:[5,10,15,20],
				view: detailview, 
					detailFormatter: function(rowIndex, rowData){ 
					return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='${pageContext.request.contextPath}/opus/"+rowData.user_photo+"'  style='height:50px;'></td>"+  
					"<td style='border:0'>" + 
					"<p>用户姓名:" + rowData.user_nickname + "</p>" + 
					"</td>" + 
					"</tr></table>"; 
					} ,
				//删/改超链接  变成-按钮  
				onLoadSuccess:function(date){//数据加载完 执行  参数是远程加载的数据
					//$.parser.parse('#cc');  解析参数指定的所有子对象
					//$("a[name=optBtn]").paretn();//通过标签属性值选择器  拿到操作.paretn()方法拿到父
					$.parser.parse($("a[name=optBtn]").parent());
				}
			});
			//初始化-用户课程-对话框
			$("#UserControllerDH").dialog({
				//设置大小
				width: 800,    
   				height:400,
   				resizable:true, //设置大小可变
   				title:"用户课程",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/find/UserControllerDH.jsp",
   				cache:false//清除缓存
   				
			});
		
		});
		//用户状态
		function myuser_status(value, row, idx){
			if(row.user_status==1){
				return "可用";
			}else{
				return "禁用";
			}
		}
		//操作的  修改/删除功能
		function myFormatter(value, row, idx){
			return "<a  class='l-btn' href='javascript:void(0)' onclick='updateUser("+row.user_id+","+row.user_status+")'>修改状态</a>&nbsp;&nbsp;<a  class='l-btn' href='javascript:void(0)' onclick='selectone("+row.user_id+")'>用户功课</a>";
 		}
 		//上师姓名
		function guru(value, row, idx){
			return row.user_guruId.guru_name;
 		}
 		//查询功课-功能
 		function selectone(id){
 			//id赋值 全局变量
 			console.log(id);
 			userId=id;
 			//打开对话框
			$("#UserControllerDH").dialog("open");
 		}
		//修改状态-功能
		function updateUser(user_id,user_status){
			$.messager.confirm(
				"系统提示",
				"您确定要修改状态吗？",
				function(r){    
		    		if (r){ 
		    			/* $.post("${pageContext.request.contextPath}/Jspperson/deleteJspperson.do",
						//传参
						"id="+id, */
						$.get("${pageContext.request.contextPath}/userController/updateUserStatus.do?user_id="+user_id+"&"+"status="+user_status,
						function(obj){
						$.messager.show({
								title:"系统提示",
								msg:"修改成功",
						});
						$("#datagridUser").datagrid("reload");//自动更新表单数据
						},
						"text");
		    		}
				});
				
		};
		</script>
			<table class="table" id="datagridUser" singleSelect="true"> 
				<thead>
				<tr class="table_header">
 					<!-- <th data-options="field:'xx',width:1,checkbox:false"></th> -->
					
					<th data-options="field:'user_uid',width:1">
						用户账号
					</th>
					<th data-options="field:'user_password',width:1" readOnly=false>
						用户密码
					</th>
					<th data-options="field:'user_farmington',width:1">
						用户法名
					</th>
					<th data-options="field:'user_nickname',width:1">
						用户姓名
					</th>
					<th data-options="field:'user_location',width:1">
						用户地址
					</th>
					<th data-options="field:'user_phone',width:1">
						用户电话
					</th>
					<th data-options="field:'xx',formatter:guru">
						上师姓名
					</th>
					<!-- <th data-options="field:'user_status',width:0">
						用户状态
					</th> -->
					<th data-options="field:'user',formatter:myuser_status">
						用户状态
					</th>
					<th data-options="field:'xxx',formatter:myFormatter">
						操作
					</th>
				</tr>
				</thead>
			</table>
			<!-- 用户课程-对话框 -->
			<div id="UserControllerDH"></div>

