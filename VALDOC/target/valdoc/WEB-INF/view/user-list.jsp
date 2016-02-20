<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.panel-body {
	background-color: #10ED52;
	color: #fff;
}

.panel-primary>.panel-heading {
	color: #fff;
	background-color: #008000;
	border-color: #008000;
}

.panel-primary>.panel-heading+.panel-collapse>.panel-body {
	border-top-color: #337ab7;
}

.panel-primary>.panel-heading .badge {
	color: #337ab7;
	background-color: #fff;
}
</style>


<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / Users</h2>
</div>
<div
	style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user-plus "></i> Add New User
	</a> </span>
</div>
<div class="box-content">
	<table id="example"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">



			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Name</label> <input type="text" class="form-control"
					id="addName" value="" title="User Name" placeholder="Enter User Name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Email</label> <input type="email" class="form-control"
					id="addEmail" value="" title="User Email" placeholder="Enter Email">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Password</label> <input type="text" class="form-control"
					id="addPassword" value="" title="User Password" placeholder="Enter Password. e.g. Test123">
			</div>


			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Role</label> <select class="form-control" id="addUserRole">
					<option value="2">CLIENT ADMIN</option>
					<option value="2">CLIENT USER</option>
					<option value="4">VENDOR ADMIN</option>
					<option value="5">VENDOR USER</option>
				</select>
			</div>

		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelAdd();">Cancel</button>
		<button type="submit" class="btn btn-primary addBtn"
			onClick="saveMe()">Save</button>
		<div>&nbsp;</div>
	</div>
	<p style="margin-left: 40px;">**Password Note: at least one number,
		one lowercase and one uppercase letter at least six characters</p>
</div>


<div class="editUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding ">
				<label>Id</label> <input type="text" class="form-control" disabled
					id="editId" value="" title="User Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Name</label> <input type="text" class="form-control"
					id="editName" value="" title="User name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Email</label> <input type="email" class="form-control"
					id="editEmail" value="" title="User Email">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Password</label> <input type="password" class="form-control"
					id="editPassword" value="" title="User Password">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Role</label> <select class="form-control" id="editUserRole">
					<option value="2" class="RT_2">CLIENT ADMIN</option>
					<option value="3" class="RT_3">CLIENT USER</option>
					<option value="4" class="RT_4">VENDOR ADMIN</option>
					<option value="5" class="RT_5">VENDOR USER</option>
				</select>
			</div>



			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding hide">
				<label>Contact</label> <input type="text" class="form-control"
					id="editContact" value="" title="Last Updated ">
			</div>



		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editUser();">Save</button>
		<div>&nbsp;</div>
	</div>
	<p style="margin-left: 40px;">**Password Note: at least one number,
		one lowercase and one uppercase letter at least six characters</p>

</div>
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + "/user/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#example').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});

		$(".popconfirm").popConfirm({
			title : "Are you sure?",
			content : "",
			placement : "right",
			container : false
		});

	});

	function refreshPage() {
		location.reload();
	}

	function drawTable(data) {
		var thead = "<thead><tr><th class='id'>Id</th><th class='name'>Name</th><th class='email'>Email</th><th class='password'>Password</th><th class='createdDate'>Created Date</th><th class='lastUpdated'>Last Updated</th><th class='roleId'>Role Id</th><th class='usertype'>User Type</th><th class='roleType'>Role Type</th><th class='permissionId'>Permission Id</th><th class='permissionName'>Permission Name</th><th class='op'>Operation</th></tr></thead>";
		$("#example").append(thead);
		for ( var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='user_"+rowData.id+"'/>")
		$("#example").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		row.append($("<td  class='id_"+rowData.id+"'>" + rowData.id + "</td>"));
		row.append($("<td class='name_"+rowData.id+"' >" + rowData.name
				+ "</td>"));
		row.append($("<td class='email_"+rowData.id+"'>" + rowData.email
				+ "</td>"));

		row.append($("<span class='hide password_"+rowData.id+"'>"
				+ rowData.password + "</span>"));

		row.append($("<td class='hiddenpassword_"+rowData.id+"'>"
				+ "**********" + "</td>"));

		row.append($("<td class='createdDate_"+rowData.id+"'>"
				+ rowData.createdDate + "</td>"));

		row.append($("<td class='lastUpdated_"+rowData.id+"'>"
				+ rowData.lastUpdated + "</td>"));

		row.append($("<td class='roleId_"+rowData.id+"'>" + rowData.userRole.id
				+ "</td>"));

		row.append($("<td class='roleUserType_"+rowData.id+"'>"
				+ rowData.userRole.userType + "</td>"));
		row.append($("<td class='roleRoleType_"+rowData.id+"'>"
				+ rowData.userRole.roleType + "</td>"));
		row.append($("<td class='permId_"+rowData.id+"'>"
				+ rowData.userRole.permission.id + "</td>"));

		row.append($("<td class='permName_"+rowData.id+"'>"
				+ rowData.userRole.permission.name + "</td>"));

		row
				.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
						+ rowData.id
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.id
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><button id='delBtn_"
						+ rowData.id
						+ "'  class='btn btn-danger popconfirm  tdBtnDelete_"
						+ rowData.id
						+ "' onClick='deleteMe(this);'><i class='fa fa-remove'></i></button></span></td>"));

	}

	function cancelAdd() {

		$('.box-content').removeClass('hide');
		$('.addUser-content').addClass('hide');
		$('.add-user-container').show();
	}

	function cancelEdit() {

		$('.box-content').removeClass('hide');
		$('.editUser-content').addClass('hide');
		$('.add-user-container').show();
	}

	$('.cancelMe').click(function() {
		$('.add-user-container').show();
		$('.box-content').removeClass('hide');

	});

	var container = "box-inner";
	var errorCount = 0;

	var urlPerfix = fetchBackendUrl("config");
	if (urlPerfix == "ERROR") {
		urlPerfix = "";
	}

	$('.addUserBtn').click(function() {
		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.addUser-content').removeClass('hide');

	});

	function saveMe() {
		errorCount = 0;
		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.addUser-content').removeClass('hide');

		if (validate("addName", "STRING")) {
		} else {
			errorCount++;
		}

		if (validate("addEmail", "EMAIL")) {
			$('#addEmail').next().remove();
		} else {
			errorCount++;
		}

		if (validate("addPassword", "PASSWORD")) {
		} else {
			errorCount++;
		}

		if (errorCount < 1) {
			errorCount = 0;

			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/user' + "/" + 'create';
			var users = {};
			var role = {};
			var permission = {};

			var name = $('#addName').val();
			var email = $('#addEmail').val();
			var password = $('#addPassword').val();
			var userRole = $('#addUserRole').find(":selected").val();

			users["name"] = name;
			users["email"] = email;
			users["password"] = password;
			role["id"] = userRole;
			users["userRole"] = role;
			callAjaxPostJSON(urlMapping, "POST", "", users);
			$.growl({
				title : "Status",
				message : "Successfully Added!"
			});
			setInterval('refreshPage()', 500);

		}
	}

	function updateMe(elem) {
		
		var elemSelected = $(elem).attr('id');
		var id = elemSelected.split('_')[1];
		if (id != "1") {

			$('.add-user-container').hide();
			$('.box-content').addClass('hide');
			$('.editUser-content').removeClass('hide');

			var name = $('.name_' + id).text();
			var email = $('.email_' + id).text();
			var active = $('.active_' + id).text();
			var deleted = $('.deleted_' + id).text();
			var roleId = $('.roleId_' + id).text();
			var password = $('.password_' + id).text();

			$('#editId').val(id);
			$('#editName').val(name);
			$('#editEmail').val(email);
			//$('#editPassword').val(password);

			$('.D_' + deleted).attr('selected', 'true');
			$('.A_' + active).attr('selected', 'true');

			$('.RT_' + roleId).attr('selected', 'true');

		} else {
			$.growl({
				title : "Status",
				message : "Sorry! This User Cannot be Updated."
			});

		}

	}

	function editUser() {

		errorCount = 0;
		if (validate("editName", "STRING")) {
		} else {
			errorCount++;
		}

		if (validate("editEmail", "EMAIL")) {
			$('#addEmail').next().remove();
		} else {
			errorCount++;
		}

		if (validate("editPassword", "PASSWORD")) {
		} else {
			errorCount++;
		}

		if (errorCount < 1) {
			errorCount = 0;

			var id = $('#editId').val();

			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/user' + "/" + 'update';
			var users = {};
			var role = {};

			users["id"] = id;
			users["name"] = $('#editName').val();
			users["email"] = $('#editEmail').val();
			users["password"] = $('#editPassword').val();

			var act = $('#editIsActive').find(":selected").val();
			var del = $('#editIsDeleted').find(":selected").val();

			users["isActive"] = eval(act);
			users["isDeleted"] = eval(del);

			role["id"] = $('#editUserRole').find(":selected").val();

			users["userRole"] = role;
			callAjaxPostJSON(urlMapping, "POST", "", users);

			$.growl({
				title : "Status",
				message : "Successfully updated!"
			});
			setInterval('refreshPage()', 500);

		}
	}

	function deleteMe(elem) {
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		if (rowNum != "1") {
			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/user' + "/" + 'delete';
			var users = {};
			users["id"] = parseInt(rowNum);
			callAjaxPostJSON(urlMapping, "POST", "", users);
			$.growl({
				title : "Status",
				message : "Successfully Deleted!"
			});
			setInterval('refreshPage()', 500);

		} else {
			$.growl({
				title : "Status",
				message : "Sorry! This User Cannot be Deleted."
			});
		}

	}
</script>