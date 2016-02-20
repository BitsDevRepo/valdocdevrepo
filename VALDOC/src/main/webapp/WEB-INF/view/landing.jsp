<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Volo, a fully featured, responsive, HTML5, Bootstrap Custom Theme.">
<meta name="author" content="THBS">
<!-- The fav icon -->
<!-- The styles -->
<link rel="stylesheet"
	href="<c:url value="/resources/assets/bootstrap/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/assets/font-awesome/css/font-awesome.css" />" />

<link rel="stylesheet"
	href="<c:url value="/resources/assets/datatable/css/dataTables.bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="/resources/assets/datatable/css/responsive.bootstrap.min.css" />" />



<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/assets/media/css/jquery.dataTables.css" />" />


<link rel="stylesheet"
	href="<c:url value="/resources/assets/css/valdoc-styles.css" />" />


<style>
body {
	font: 12px Arial;
}

.nopadding {
	margin-bottom: 20px;
}

.nav>li>a {
	padding: 7px 15px;
}

.tab {
	margin-bottom: 15px;
	margin-right: 5px;
}
</style>

<!-- Scripts-->


<!-- jQuery -->
<script
	src="<c:url value="/resources/assets/jquery/jquery-2.1.4.min.js" />"></script>

<!-- bootstrap -->

<script
	src="<c:url value="/resources/assets/bootstrap/js/bootstrap.min.js" /> "></script>

<!-- datatables -->
<script
	src="<c:url value="/resources/assets/datatable/js/jquery.dataTables.min.js" />  "></script>
<script
	src="<c:url value="/resources/assets/datatable/js/dataTables.bootstrap.min.js" />  "></script>
<script
	src="<c:url value="/resources/assets/datatable/js/dataTables.responsive.min.js" />  "></script>

<script src="resources/assets/jquery/jquery.popconfirm.js"></script>
<script src="resources/assets/jquery/jquery.growl.js"></script>
<script src="<c:url value="/resources/assets/js/app.js" /> "></script>



</head>
<body>

	<c:set var="userType" scope="application"
		value="${user.userRole.userType}" />
	<c:set var="roleType" scope="application"
		value="${user.userRole.roleType}" />
	<c:set var="permission" scope="application"
		value="${user.userRole.permission.name}" />


	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="navbar-inner">
			<button type="button" class="navbar-toggle pull-left animated flip">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/"> <img alt=""
				src="<c:url value="/resources/image/valdoc-logo.png"/>" class="hidden-xs img-1" /> </a>			
			<div class="btn-group pull-right">
				<button class="btn btn-default dropdown-toggle"
					data-toggle="dropdown">
					<i class="fa fa-user"></i><span class="hidden-sm hidden-xs">&nbsp;&nbsp;${user.name}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<!-- li><a href="#" disabled><i class="fa fa-user-secret"></i>&nbsp;&nbsp;Profile</a></li-->
					<!-- li class="divider"></li-->
					<li><a href="<c:url value='/logout'/>"><i
							class="fa fa-sign-out"></i>&nbsp;&nbsp;Logout</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="volo-container" style="margin-top: 30px;">
		<div class="row">
			<div class="col-sm-2 col-lg-2" style="padding: 0px 5px;">
				<div class="sidebar-nav">
					<div class="nav-canvas">
						<div class="nav-sm nav nav-stacked"></div>
						<ul class="nav nav-pills nav-stacked main-menu"
							style="padding-bottom: 10px;">
							<li class="tab nav-header"
								style="color: #F2910C; font-size: 2rem; padding: 0px;"><span>VALDOC</span></li>

							<c:choose>
								<c:when test="${userType=='SUPER'}">
									<li class="tab active"><a class="ajax-link"
										onclick="switchTab('user')"><i class="fa fa-group"></i><span>&nbsp;&nbsp;Manage
												User</span></a></li>

								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>
							<c:choose>
								<c:when test="${userType=='SUPER'}">

									<li class="tab "><a class="ajax-link"
										onclick="switchTab('role')"><i class="fa fa-yelp"></i><span>&nbsp;&nbsp;Manage
												Role</span></a></li>

								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>

							<li class="tab "><a class="ajax-link"
								onclick="switchTab('equipment')"><i class="fa fa-wrench"></i><span>&nbsp;&nbsp;Manage
										Equipment</span></a></li>
							
							<li class="tab "><a class="ajax-link"
								onclick="switchTab('equipment/filter')"><i class="fa fa-wrench"></i><span>&nbsp;&nbsp;Manage
										Filter</span></a></li>
							
							<li class="tab "><a class="ajax-link"
								onclick="switchTab('equipment/applicabletestequipment')"><i class="fa fa-wrench"></i><span>&nbsp;&nbsp;Applicable
										Test Equipment</span></a></li>

							<li class="tab "><a class="ajax-link"
								onclick="switchTab('room')"><i class="fa fa-home"></i><span>&nbsp;&nbsp;Manage
										Room</span></a></li>
							<li class="tab "><a class="ajax-link"
								onclick="switchTab('ahu')"><i class="fa fa-television"></i><span>&nbsp;&nbsp;Manage
									AHU</span></a></li>
									
							<li class="tab "><a class="ajax-link"
								onclick="switchTab('area')"><i class="fa fa-television"></i><span>&nbsp;&nbsp;Manage
									Area</span></a></li>
						</ul>
					</div>

				</div>
			</div>
			<!--/span-->
			<!-- left menu ends -->
			<div id="content" class="col-lg-10 col-sm-10">
				<div class="row">
					<div class="box col-md-12">
						<div class="box-inner"></div>
					</div>
				</div>
			</div>

			<!-- content ends -->
		</div>
		<!--/#content.col-md-0-->
	</div>
	<!--/fluid-row-->
	<hr>

	<script>
		var url = "";

		$(document).ready(function() {

			$(this).addClass("active");
			var container = "box-inner";
			url = fetchBackendUrl("config");
			if (url != "ERROR") {
				var newurl = url + "/user/view";
				callAjax(newurl, container, "GET");
			}

		});

		function cancelMe() {
			$('.box-content').removeClass('hide');
			$('.edit-content').addClass('hide');
			resetAll();
		}

		function resetAll() {
			$('.form-control').val();
		}

		function switchTab(tabClicked) {
			var container = "box-inner";
			var newurl = "";
			if (tabClicked == "") {
				if (url != "ERROR") {
					newurl = url + "/" + "underconstruction";
				}
			} else {
				if (url != "ERROR") {
					newurl = url + "/" + tabClicked + "/view";
				}
			}
			callAjax(newurl, container, "GET");

		}

		$(".nav-pills > .tab").click(function() {
			buttonSelected = $(this).text();
			$(this).addClass("active").siblings().removeClass("active");
		});

		$("body,html,document").animate({
			scrollTop : 0
		}, 500);
	</script>

</body>
</html>
