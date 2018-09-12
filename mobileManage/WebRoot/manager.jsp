<%@ page language="java" import="java.util.*;" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>后台管理中心</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="js/ext/css/ext-all.css" />
		<link rel="stylesheet" type="text/css" id="skincsslink" />
		<script type="text/javascript" src="js/ext/ext-base.js"></script>
		<script type="text/javascript" src="js/ext/ext-all.js"></script>
		<script type="text/javascript" src="js/ext/extlangzhCN.js"></script>
		<script type="text/javascript" src="js/ext/TabCloseMenu.js"></script>
		<script type="text/javascript" src="js/jquery/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="js/manager.js"></script>
		
		<style type="text/css">
			.settings {
	        	background-image:url(images/icon/cog.png);
		    }
		    .nav {
		        background-image:url(images/icon/user_suit.png);
		    }
		</style>
		<script type="text/javascript">
			$(document).ready(function(){
				$("#seltheme").change(function(){
					var url="js/ext/css/xtheme-" + $(this).children("option:selected").val() + ".css";
					document.getElementById('skincsslink').href=url;
				});
			});
		</script>
	</head>

	<body>
		<div id="west">
		</div>
		<div id="north">
			<div  style="width: 400px; float: left;">
				<img src="images/logo.png" style="padding-left: 10px;">
			</div>
			<div style="float: right; height: 100%; text-align: center;">
				<div id="ptheme" style="margin-top: 30px; margin-right: 10px;">
				<FORM id="ftheme" method="post">
					<LABEL style="font-weight: bold;">主题: </LABEL>
			      <select id="seltheme" name="seltheme" onChange="">
				      <option value="galdaka">galdaka</option>
				      <option value="black">black</option>
				      <option value="darkgray">darkgray</option>
				      <option value="gray">gray</option>
				      <option value="olive">olive</option>
				      <option value="purple">purple</option>
				      <option value="slate">slate</option>
			      </select>
				</FORM>
			</div>
			</div>
			
		</div>
		<div id="center">
			<h1 align="center">后台首页</h1>
		</div>
		<div id="props-panel" style="width: 200px; height: 200px; overflow: hidden;">
		</div>
	</body>
</html>
