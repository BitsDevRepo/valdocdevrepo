function callAjax(url, container, callType) {
	$
			.ajax({
				url : url,
				type : callType,
				crossDomain : true,
				success : function(response) {
					$('.' + container).html(response);
					// $('#example').DataTable();
				},
				error : function(xhr, status, error) {
					var ajaxError = "<div class='box-header well' style='border-radius: 0px;'>"
							+ "<h2>Resource Unavailable</h2>"
							+ "</div> <div class='box-content'>"
							+ "<h2> <i class='fa fa-exclamation-triangle fa-3x'></i>Please contact System Admin! </h2></div> ";
					$('.' + container).html(ajaxError);

				}
			});
}

function callAjaxPostJSON(urlMapping, callType, container, data) {

	$
			.ajax({
				type : callType,
				contentType : "application/json",
				url : urlMapping,
				data : JSON.stringify(data),
				crossDomain : true,
				dataType : 'json',
				timeout : 100000,
				success : function(response) {
					console.log("SUCCESS: ", data);
					if (!data.error)
						location.reload(true);
					// window.location.reload();
				},
				error : function(xhr, status, error) {
					console.log("ERROR: ", error);
					var ajaxError = "<div class='box-header well' style='border-radius: 0px;'>"
							+ "<h2>Resource Unavailable</h2>"
							+ "</div> <div class='box-content'>"
							+ "<h2> <i class='fa fa-exclamation-triangle fa-3x'></i>Please contact System Admin! </h2></div> ";
					$('.' + container).html(ajaxError);
				},
				done : function(e) {
					console.log("DONE");
				}
			});

}

function callAjaxPost(url, container, data) {
	$
			.ajax({
				url : url,
				type : "POST",
				data : data,
				crossDomain : true,
				success : function(response) {
					$('.' + container).html(response);
					$('#example').DataTable();
				},

				error : function(xhr, status, error) {
					var ajaxError = "<div class='box-header well' style='border-radius: 0px;'>"
							+ "<h2>Resource Unavailable</h2>"
							+ "</div> <div class='box-content'>"
							+ "<h2> <i class='fa fa-exclamation-triangle fa-3x'></i>Please contact System Admin! </h2></div> ";
					$('.' + container).html(ajaxError);

				}
			});

}

function fetchBackendUrl(key) {
	var url = "";
	$.ajax({
		type : "GET",
		url : "resources/config/config.json",
		dataType : "json",
		async : false,
		success : function(data) {
			if (typeof data[key] != 'undefined') {
				var temp = data[key];
				var protocol = temp["protocol"];
				var ip = temp["host"];
				var port = temp["port"];
				var resource = temp["resource"];
				url = protocol + "://" + ip + ":" + port + "/" + resource;
			} else {
				url = "ERROR";
			}
		},
		error : function(data) {
			url = "ERROR";
		}
	});
	return url;
}

function hideErrorMessage() {
	$('.alert-danger').addClass('hide');
}

function validate(id, typeCheck) {

	var value = $('#' + id).val();
	if (typeCheck == "FLOAT") {
		if (value == '') {

			$('#' + id).next().remove();
			$('#' + id).after("<span class='alert-danger'>Empty Input.</span>");
			return false;
		} else if (!isNaN(value) && value.toString().indexOf('.') != -1) {
			// hideErrorMessage();
			return true;
		} else {

			$('#' + id).next().remove();
			$('#' + id).after(
					"<span class='alert-danger'>Invalid Input.</span>");
			return false;
		}
	} else if (typeCheck == "INTEGER") {
		if ($.trim(value.length) != 0) {
			if (parseInt(value)) {
				// hideErrorMessage();
				return true;
			} else {

				$('#' + id).next().remove();
				$('#' + id).after(
						"<span class='alert-danger'>Invalid Input.</span>");
				return false;
			}

		} else {

			$('#' + id).next().remove();
			$('#' + id).after("<span class='alert-danger'>Empty Input.</span>");
			return false;
		}

	} else if (typeCheck == "IP") {
		if ($.trim(value.length) == 0) {

			$('#' + id).next().remove();
			$('#' + id).after("<span class='alert-danger'>Empty IP.</span>");
			return false;
		} else {
			return validateIPaddress(value, id);
		}
	} else if (typeCheck == "STRING") {
		if ($.trim(value.length) == 0) {

			$('#' + id).next().remove();
			$('#' + id).after("<span class='alert-danger'>Empty Input.</span>");
			return false;
		} else {
			$('#' + id).next().remove();
			return true;
		}
	} else if (typeCheck == "TINYINT") {
		if ($.trim(value.length) != 0) {
			if (parseInt(value)) {

				var temp = parseInt(value);
				if (temp >= -127 && temp <= 127) {
					return true;
				} else {
					$('#' + id).next().remove();
					$('#' + id).after(
							"<span class='alert-danger'>Invalid Input.</span>");
					return false;
				}

			} else {

				$('#' + id).next().remove();
				$('#' + id).after(
						"<span class='alert-danger'>Invalid Input.</span>");
				return false;
			}

		} else {

			$('#' + id).next().remove();
			$('#' + id).after("<span class='alert-danger'>Empty Input.</span>");
			return false;
		}

	} else if (typeCheck == "EMAIL") {

		if ($.trim(value.length) == 0) {
			$('#' + id).next().remove();
			$('#' + id).after("<span class='alert-danger'>Empty Email.</span>");
			return false;
		} else if (isValidEmailAddress(value)) {
			return isValidEmailAddress(value);
		} else {
			$('#' + id).next().remove();
			$('#' + id).after(
					"<span class='alert-danger'>Invalid Email.</span>");
		}

	} else if (typeCheck == "PASSWORD") {

		if ($.trim(value.length) == 0) {
			$('#' + id).next().remove();
			$('#' + id).after(
					"<span class='alert-danger'>Empty Password.</span>");
			return false;
		} else if (checkPassword(value)) {
			return checkPassword(value);
		} else {
			$('#' + id).next().remove();
			$('#' + id).after(
					"<span class='alert-danger'>Invalid Password.</span>");
		}

	} else {
		return true;
	}

}

function isValidEmailAddress(value) {
	var pattern = new RegExp(
			/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);
	return pattern.test(value);
}

function checkPassword(str) {
	// at least one number, one lowercase and one uppercase letter
	// at least six characters
	var re = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
	return re.test(str);
}

function validateIPaddress(value, id) {
	var ipformat = /^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/;
	if (value.match(ipformat)) {
		// hideErrorMessage();
		return true;
	} else {

		$('#' + id).next().remove();
		$('#' + id).after("<span class='alert-danger'>Invalid IP.</span>");
		errorCount++;
		return false;
	}

}