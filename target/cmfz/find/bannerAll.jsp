<%@page contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		//页面加载后
		$(function(){
			//表单 查所有
			$("#datagridBanner").datagrid({
				url:"${pageContext.request.contextPath}/bannerControll/findBanner.do",
				fitColumns:true,//适应网络宽度 配合 列里面的width
				toolbar:"#banner",//引入工具栏
				view: detailview, 
					detailFormatter: function(rowIndex, rowData){ 
					return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='${pageContext.request.contextPath}/homepage/"+rowData.banner_imgPath+"'  style='height:50px;'></td>"+  
					"<td style='border:0'>" + 
					"<p>名称:" + rowData.banner_title + "</p>" + 
					"<p>时间: " + rowData.banner_createTime + "</p>" + 
					"</td>" + 
					"</tr></table>"; 
					} ,
				//删/改超链接  变成-按钮  
				onLoadSuccess:function(date){//数据加载完 执行  参数是远程加载的数据
					console.log(date);
					//$.parser.parse('#cc');  解析参数指定的所有子对象
					//$("a[name=optBtn]").paretn();//通过标签属性值选择器  拿到操作.paretn()方法拿到父
					$.parser.parse($("a[name=optBtn]").parent());
				}
			});
		//初始化添加按钮
			$("#bannerAdd").linkbutton({
				//注册事件  打开窗口
				onClick:function(){
					$("#bannerDH").dialog("open");
				},
			});
			//初始化-添加对话框
			$("#bannerDH").dialog({
				//设置大小
				width: 400,    
   				height: 200,
   				resizable:true, //设置大小可变
   				title:"添加轮播图",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/add/AddBanner.jsp",
   				cache:false//清除缓存
   				
			});
			
			
		});
		//操作的  修改/删除功能
		function myFormatter(value, row, idx){
			return "<a  class='l-btn' href='javascript:void(0)' onclick='deletep("+row.banner_id+")'>删除</a>";
 		}
		//删除-功能
		function deletep(id){
			$.messager.confirm(
				"系统提示",
				"您确定要删除吗？",
				function(r){    
		    		if (r){ 
		    			/* $.post("${pageContext.request.contextPath}/Jspperson/deleteJspperson.do",
						//传参
						"id="+id, */
						$.get("${pageContext.request.contextPath}/bannerControll/deleteBanner.do?id="+id,
						function(obj){
						$.messager.show({
								title:"系统提示",
								msg:"删除成功",
						});
						$("#datagridBanner").datagrid("reload");//自动更新表单数据
						},
						"text");
		    		}
				});
				
		};
		</script>
			<table class="table" id="datagridBanner" singleSelect="true">
				<thead>
				<tr class="table_header">
 					<!-- <th data-options="field:'xx',width:1,checkbox:false"></th> -->
					
					<th data-options="field:'banner_title',width:1">
						轮播图名
					</th>
					<th data-options="field:'banner_imgPath',width:1">
						轮播图路径
					</th>
					<th data-options="field:'banner_status',width:0">
						轮播图状态
					</th>
					<th data-options="field:'banner_createTime',width:1">
						轮播图创建时间
					</th>
					<th data-options="field:'xxx',formatter:myFormatter">
						操作
					</th>
				</tr>
				</thead>
			</table>
			<!-- 定义工具栏   -->
			<div id="banner">
				<!--   添加按钮 -->
				<a id="bannerAdd">添加轮播图</a>	
			</div>
 			<!-- 添加-对话框 -->
			<div id="bannerDH"></div>

