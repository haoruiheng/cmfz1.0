<%@page isELIgnored="false" contentType="text/html;charset=utf-8"%>
		<script type="text/javascript">
		var chapter_id;//专辑id
		//页面加载后
		$(function(){
			//表单 查所有
			$("#datagridAlbum").datagrid({
				url:"${pageContext.request.contextPath}/albumController/selectalbum.do",
				fitColumns:true,//适应网络宽度 配合 列里面的width
				toolbar:"#Album",//引入工具栏
				pagination:true,//打开分页工具
				pageSize:5,
				pageList:[5,10,15,20],
				view: detailview, 
					detailFormatter: function(rowIndex, rowData){ 
					return "<table><tr>" + 
					"<td rowspan=2 style='border:0'><img src='${pageContext.request.contextPath}/album/"+rowData.album_cover+"'  style='height:50px;'></td>"+  
					"<td style='border:0'>" + 
					"<p>概要: " + rowData.album_brief + "</p>" + 
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
			$("#AlbumAdd").linkbutton({
				//注册事件  打开窗口
				onClick:function(){
					$("#AlbumDH").dialog("open");
				},
			});
			//初始化-添加对话框
			$("#AlbumDH").dialog({
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
			//初始化-章节详情-对话框
			$("#ChapterDH").dialog({
				//设置大小
				width: 500,    
   				height:250,
   				resizable:true, //设置大小可变
   				title:"章节展示",//设置标题
   				modal:true,//模式化窗口
   				closed:true,//关闭窗口
   				href:"${pageContext.request.contextPath}/find/ChapterAll.jsp",
   				cache:false//清除缓存
   				
			});
			
		});
		//操作的  
		function myFormatter(value, row, idx){
			//console.log(row);
			return "<a  class='l-btn' href='javascript:void(0)' onclick='selectChapter("+row.album_id+")'>章节详情</a>";
 		}
		//章节详情-功能
		function selectChapter(id){
			chapter_id=id;//给全局id赋值
			//注册事件  打开窗口
			$("#ChapterDH").dialog("open");
		};
		</script>
			<table class="table" id="datagridAlbum" singleSelect="true">
				<thead>
				<tr class="table_header">
 					<!-- <th data-options="field:'xx',width:1,checkbox:false"></th> -->
					
					<th data-options="field:'album_title',width:1">
						专辑名称
					</th>
					<th data-options="field:'album_count',width:0">
						集数
					</th>
					<th data-options="field:'album_author',width:1">
						作者
					</th>
					<th data-options="field:'album_broadCast',width:0">
						播音
					</th>
					<th data-options="field:'album_publishDate',width:1">
						出版日期
					</th>
					<th data-options="field:'xxx',formatter:myFormatter">
						操作
					</th>
				</tr>
				</thead>
			</table>
			<!-- 定义工具栏   -->
			<div id="Album">
				<!--   添加按钮 -->
				<a id="AlbumAdd">添加专辑</a>	
			</div>
 			<!-- 添加-对话框 -->
			<div id="AlbumDH"></div>
			<!-- 章节展示-对话框 -->
			<div id="ChapterDH"></div>
