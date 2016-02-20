<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Valdoc</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Volo, a fully featured, responsive, HTML5, Bootstrap Custom Theme.">
<meta name="author" content="THBS">
<!-- The fav icon -->
<link rel="shortcut icon"
	href="<c:url value="/resources/image/favicon.ico" />" />

<!-- The styles -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/assets/bootstrap/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/assets/font-awesome/css/font-awesome.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/assets/css/volostyles.css" />" />

<style>
body {
	background: rgba(0, 0, 0, 0.7) none repeat scroll 0 0;
}
</style>
<script src="<c:url value="resources/assets/js/jquery-2.1.4.min.js" />"></script>
</head>
<body>
	<div class="volo-container">
		<div class="row" style="padding-top: 15%;">
			<div class="well col-xs-11 col-sm-7 col-md-5 center login-box"
				style="background-color: #FFF3C4;">
				<div class="row">
					<div class="box-header well" style="border-radius: 0px;">
						<h2>Invalid Resource</h2>
					</div>
					<div class="box-content">
						<h2>
							<i class="fa fa-exclamation-triangle fa-3x"></i> <span
								style="margin-right: 20px;">You are Not Authorized to access this resource! </span>
						</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
