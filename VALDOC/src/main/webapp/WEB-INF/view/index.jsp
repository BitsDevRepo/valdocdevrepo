<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<script
	src="<c:url value="/resources/assets/jquery/jquery-2.1.4.min.js" />"></script>
</head>

<body>
	<div class="volo-container">
		<div class="row" style="padding-top: 15%;">
			<div class="well col-xs-11 col-sm-7 col-md-5 center login-box"
				style="text-align: center; font-size: 30px; color: steelblue;">
				VALDOC
				<div class="alert alert-error usernamePasswordNotValid"
					style="padding: 0px; color: steelblue; font-weight: bold; font-size: 14px;">User credential
					Not Valid.Please Try Again.</div>
				<c:url var="formActionUrl" value="/home" />
				<form:form class="form-horizontal" action="${formActionUrl}"
					modelAttribute="form" method="post" id="volo-login-form">
					<fieldset>
						<div class="input-group input-group-lg">
							<span class="input-group-addon"><i class="fa fa-user"></i></span>
							<input type="email" class="form-control uEmail" name="email"
								placeholder="User Email" required>
						</div>
						</br>
						<div class="clearfix"></div>

						<div class="input-group input-group-lg">
							<span class="input-group-addon"><i class="fa fa-key"></i></span>
							<input type="password" class="form-control uPassword"
								name="password" placeholder="User Password" required>
						</div>

						<div class="clearfix"></div>

						<p class="center col-md-5">
							<button type="submit" class="btn btn-primary">Login</button>
						</p>
					</fieldset>
				</form:form>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">
	$(document).ready(function() {
		$(".usernamePasswordNotValid").hide();

		$('.uId').click(function() {
			$(".usernamePasswordNotValid").hide();
		});

		var uNandPassNotvalid = "${uNameNotValid}";		

		if (uNandPassNotvalid == 'false') {
			$(".usernamePasswordNotValid").show();
		}

	});
</script>

</html>
