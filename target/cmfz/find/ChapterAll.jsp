<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		//页面加载后
		$(function(){
			//表单 查所有
			$("#datagridChapter").datagrid({
				url:"${pageContext.request.contextPath}/chapterController/selectIdChapter.do?id="+chapter_id,
				fitColumns:true,//适应网络宽度 配合 列里面的width
				toolbar:"#Chapter",//引入工具栏
				//删/改超链接  变成-按钮  
				onLoadSuccess:function(date){//数据加载完 执行  参数是远程加载的数据
					//$.parser.parse('#cc');  解析参数指定的所有子对象
					//$("a[name=optBtn]").paretn();//通过标签属性值选择器  拿到操作.paretn()方法拿到父
					$.parser.parse($("a[name=optBtn]").parent());
				}
			});
		//初始化添加按钮
			$("#ChapterAdd").linkbutton({
				//注册事件  打开窗口
				onClick:function(){
					$("#ChapterAddDH").dialog("open");
				},
			});
			//初始化-添加对话框
			$("#ChapterAddDH").dialog({
				//设置大小
				width: 400,    
   				height: 200,
   				resizable:true, //设置大小可变
   				title:"添加专辑",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/add/AddChapter.jsp",
   				cache:false//清除缓存
			});
			
			
		});
		//操作的  下载/删除功能
		function myFormatters(value, row, idx){
			return "<a   href='${pageContext.request.contextPath}/chapterController/downloadController.do?fname="+row.chapter_title+"'>下载章节</a>&nbsp<a  class='l-btn' href='javascript:void(0)' onclick='deletep("+row.chapter_id+")'>删除</a>";
 		}
		//删除-功能
		function deletep(chapter_id){
			$.messager.confirm(
				"系统提示",
				"您确定要删除吗？",
				function(r){    
		    		if (r){ 
		    			/* $.post("${pageContext.request.contextPath}/Jspperson/deleteJspperson.do",
						//传参
						"id="+id, */
						$.get("${pageContext.request.contextPath}/chapterController/deleteChapter.do?Chapter_id="+chapter_id,
						function(obj){
						$.messager.show({
								title:"系统提示",
								msg:"删除成功",
						});
						$("#datagridChapter").datagrid("reload");//自动更新表单数据
						},
						"text");
		    		}
				});
				
		};
		</script>
			<table class="table" id="datagridChapter" singleSelect="true">
				<thead>
				<tr class="table_header">
 					<!-- <th data-options="field:'xx',width:1,checkbox:false"></th> -->
					
					<th data-options="field:'chapter_title',width:1">
						章节名称
					</th>
					<th data-options="field:'chapter_size',width:0">
						章节大小
					</th>
					<th data-options="field:'chapter_downloadPath',width:1">
						下载路径
					</th>
					<th data-options="field:'chapter_uploadDate',width:0">
						上传时间
					</th>
					<th data-options="field:'xxx',formatter:myFormatters">
						操作
					</th>
				</tr>
				</thead>
			</table>
			<!-- 定义工具栏   -->
			<div id="Chapter">
				<!--   添加按钮 -->
				<a id="ChapterAdd">添加章节</a>	
			</div>
 			<!-- 添加-对话框 -->
			<div id="ChapterAddDH"></div>
