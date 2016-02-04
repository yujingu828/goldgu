<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>Metronic | Admin Dashboard Template</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport"/>
<meta content="" name="description"/>
<meta content="" name="author"/>
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="<%=basePath%>metronic/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/global/plugins/simple-line-icons/simple-line-icons.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css"/>
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
<link href="<%=basePath%>metronic/global/plugins/morris/morris.css" rel="stylesheet" type="text/css">
<!-- END PAGE LEVEL PLUGIN STYLES -->
<!-- BEGIN PAGE STYLES -->
<link href="<%=basePath%>metronic/admin/pages/css/tasks.css" rel="stylesheet" type="text/css"/>
<!-- END PAGE STYLES -->
<!-- BEGIN THEME STYLES -->
<!-- DOC: To use 'rounded corners' style just load 'components-rounded.css' stylesheet instead of 'components.css' in the below style tag -->
<link href="<%=basePath%>metronic/global/css/components-rounded.css" id="style_components" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/global/css/plugins.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/admin/layout6/css/layout.css" rel="stylesheet" type="text/css"/>
<link href="<%=basePath%>metronic/admin/layout6/css/custom.css" rel="stylesheet" type="text/css"/>
<!-- END THEME STYLES -->
<link rel="shortcut icon" href="favicon.ico"/>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-quick-sidebar-over-content">
	<!-- BEGIN MAIN LAYOUT -->
	<!-- PAGE CONTENT BEGIN -->
    <div class="container-fluid">
    	<div class="page-content page-content-popup">
    		<!-- BEGIN PAGE CONTENT FIXED -->
			<div class="page-content-fixed-header">
				<ul class="page-breadcrumb">
					<li>ESB管理系统</li>
				</ul>
			</div>
			<jsp:include page="public/menu.jsp"/>
			<div class="page-fixed-main-content">
				<div class="row">
	    			<div class="col-md-12">
	    				<!-- BEGIN Portlet PORTLET-->
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="actions">
									<a href="#" class="btn btn-circle btn-default btn-sm">
									<i class="fa fa-pencil"></i> 查询 </a>
									<a href="#" class="btn btn-circle btn-default btn-sm">
									<i class="fa fa-pencil"></i> 编辑 </a>
									<a href="#" class="btn btn-circle btn-default btn-sm">
									<i class="fa fa-plus"></i> 新增 </a>
									<a class="btn btn-circle btn-icon-only btn-default fullscreen" href="#">
									</a>
								</div>
							</div>
							<div class="portlet-body">
    							<div id="columnLine" class="columnLine"></div>
							</div>
						</div>
						<!-- END PORTLET-->
	    			</div>
	    		</div>
			<!-- END QUICK SIDEBAR -->
    	</div>
    </div>
	<!-- PAGE CONTENT END -->
    <!-- END MAIN LAYOUT -->
    <a href="#index" class="go2top"><i class="icon-arrow-up"></i></a>

<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<!-- BEGIN CORE PLUGINS -->
<!--[if lt IE 9]>
<script src="<%=basePath%>metronic/global/plugins/respond.min.js"></script>
<script src="<%=basePath%>metronic/global/plugins/excanvas.min.js"></script> 
<![endif]-->
<script src="<%=basePath%>metronic/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="<%=basePath%>metronic/global/plugins/amcharts/amcharts/amcharts.js" type="text/javascript" ></script>
<script src="<%=basePath%>metronic/global/plugins/amcharts/amcharts/serial.js" type="text/javascript" ></script>
<script src="<%=basePath%>metronic/global/plugins/amcharts/amcharts/pie.js" type="text/javascript" ></script>
<script src="<%=basePath%>metronic/global/plugins/amcharts/amcharts/themes/light.js" type="text/javascript" ></script>
<script src="<%=basePath%>metronic/global/plugins/morris/morris.min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/morris/raphael-min.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/global/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="<%=basePath%>metronic/global/scripts/metronic.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/admin/layout6/scripts/layout.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/admin/layout6/scripts/quick-sidebar.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/admin/layout6/scripts/index.js" type="text/javascript"></script>
<script src="<%=basePath%>metronic/admin/pages/scripts/tasks.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
jQuery(document).ready(function() {    
   	Metronic.init(); // init metronic core componets
   	Layout.init(); // init layout
    Index.init(); // init index page
    QuickSidebar.init(); // init quick sidebar
    Tasks.initDashboardWidget(); // init tash dashboard widget
});
</script>
<!-- END JAVASCRIPTS -->
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  ga('create', 'UA-37564768-1', 'keenthemes.com');
  ga('send', 'pageview');
</script>
</body>

<!-- END BODY -->
</html>