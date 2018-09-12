<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="js/ext/css/ext-all.css" />
	<link rel="stylesheet" type="text/css" id="skincsslink" />
	<script type="text/javascript" src="<%=basePath%>js/ext/ext-base.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/ext/ext-all.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/ext/extlangzhCN.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery/jquery-1.4.2.min.js"></script>
	<script type="text/javascript">
		var store, colModel, dataGridUser;
		Ext.onReady(function(){
			store = new Ext.data.Store({
				reader: new Ext.data.JsonReader({
					root: 'rows',
					totalProperty: 'total',
					idProperty: 'id',
					remoteSort: true,
					fields: [
						'id', 'name', 'realName', 'email', 'mobile', 'tel', 'address', 'qq', 'msn'
					]
				}),
				//url: '<%=basePath%>user/userList.do',
				proxy: new Ext.data.HttpProxy({
				　　url:'<%=basePath%>user/userList.do',
				　　method:'GET'
				}),
				remoteSort:true
			});
			store.on('load', function(store){
				
				dataGridUser.getSelectionModel().selectFirstRow();
			});
			store.load({params:{start:0, limit:20}});

			colModel = new Ext.grid.ColumnModel([
				new Ext.grid.RowNumberer(),
				{id:'id',dataIndex:'id',header:'ID',hidden:true},
				{dataIndex:'name',header:'用户名',width:30,sortable:true},
				{dataIndex:'realName',header:'真实姓名',width:90,sortable:true},
				{dataIndex:'email',header:'Email',width:90,sortable:true},
				{dataIndex:'mobile',header:'手机',width:70,align:'center',sortable:true/*,renderer:renderRoom*/},
				{dataIndex:'tel',header:'电话',width:60,sortable:true},
				{dataIndex:'address',header:'地址',width:50,sortable:true},
				{dataIndex:'qq',header:'QQ',width:40,sortable:true},
				{dataIndex:'msn',header:'MSN',width:66,sortable:true}
			]);
				
			dataGridUser = new Ext.grid.GridPanel({
				width: 1100,
				height: 600,
				renderTo: 'dataGridUser',
				store: store,
				trackMouseOver:false,
				disableSelection:true,
				loadMask: true,
				cm: colModel,
				sm: new Ext.grid.RowSelectionModel({  
					singleSelect: true  
				}),
				enableColumnMove:false,//禁止拖放列   
				enableColumnResize:false,//精致改变列的宽度   
				stripeRows:true,//表格显示斑马线效果
				viewConfig: {
					forceFit:true, //平均分配  
					autoSizeColumn:true //根据内容填充列的大小
				},
				bbar: new Ext.PagingToolbar({
					pageSize: 20,
					store: store,
					displayInfo: true,
					displayMsg: '第 {0} 到 {1} 条记录,共 {2} 记录',
					emptyMsg: "没有记录",
					prevText: "上一页", 
					nextText: "下一页", 
					refreshText: "刷新", 
					lastText: "最后页", 
					firstText: "第一页"
				}),
				listeners: {
					'rowdblclick': function(grid, rowIndex, e) {
						var selectionModel = grid.getSelectionModel();    
						var record = selectionModel.getSelected();
						//window.parent.dataGrid_dbClick("key", record.data.roomId);
					}
				}
			});
		});
	</script>
  </head>
  
  <body>
    <div id="dataGridUser" style="width: 500px;"></div>
  </body>
</html>
