<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		//页面加载后
		$(function(){
			//表单 查所有
			$("#datagridArticle").datagrid({
				url:"${pageContext.request.contextPath}/articleController/selectArticle.do",
				fitColumns:true,//适应网络宽度 配合 列里面的width
				toolbar:"#Article",//引入工具栏
				pagination:true,//打开分页工具
				pageSize:5,
				pageList:[5,10,15,20],
				view: detailview, 
					detailFormatter: function(rowIndex, rowData){ 
					return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='${pageContext.request.contextPath}/opus/"+rowData.article_figurePath+"'  style='height:50px;'></td>"+  
					"<td style='border:0'>" + 
					"<p>内容:" + rowData.article_content + "</p>" + 
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
			$("#ArticleAdd").linkbutton({
				//注册事件  打开窗口
				onClick:function(){
					$("#ArticleDH").dialog("open");
				},
			});
			//初始化-添加对话框
			$("#ArticleDH").dialog({
				//设置大小
				width: 400,    
   				height: 200,
   				resizable:true, //设置大小可变
   				title:"添加上师",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/add/AddBanner.jsp",
   				cache:false//清除缓存
   				
			});
		});
		//操作的  修改/删除功能
		function myFormatter(value, row, idx){
			return "<a  class='l-btn' href='javascript:void(0)' onclick='deletepArticle_id("+row.article_id+")'>删除</a>";
 		}
 		//上师姓名
		function guru(value, row, idx){
			return row.article_guruId.guru_name;
 		}
		//删除-功能
		function deletepArticle_id(id){
			$.messager.confirm(
				"系统提示",
				"您确定要删除吗？",
				function(r){    
		    		if (r){ 
		    			/* $.post("${pageContext.request.contextPath}/Jspperson/deleteJspperson.do",
						//传参
						"id="+id, */
						$.get("${pageContext.request.contextPath}/articleController/deleteArticle.do?article_id="+id,
						function(obj){
						$.messager.show({
								title:"系统提示",
								msg:"删除成功",
						});
						$("#datagridArticle").datagrid("reload");//自动更新表单数据
						},
						"text");
		    		}
				});
				
		};
		</script>
			<table class="table" id="datagridArticle" singleSelect="true">
				<thead>
				<tr class="table_header">
 					<!-- <th data-options="field:'xx',width:1,checkbox:false"></th> -->
					
					<th data-options="field:'article_title',width:1">
						文章标题
					</th>
					<th data-options="field:'article_publishDate',width:1">
						发布时间
					</th>
					<th data-options="field:'article_status',width:1">
						文章状态
					</th>
					<th data-options="field:'xx',formatter:guru">
						上师姓名
					</th>
					<th data-options="field:'xxx',formatter:myFormatter">
						操作
					</th>
				</tr>
				</thead>
			</table>
			<!-- 定义工具栏   -->
			<div id="Article">
				<!--   添加按钮 -->
				<a id="ArticleAdd">添加文章</a>	
			</div>
 			<!-- 添加-对话框 -->
			<div id="ArticleDH"></div>

