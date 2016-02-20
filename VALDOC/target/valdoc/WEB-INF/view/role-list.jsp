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
	<h2>Valdoc / Roles</h2>
</div>
<div
	style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-role-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add New Role
	</a> </span>
</div>
<div class="box-content">
	<table id="example"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addRole-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">


			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>User Type</label> <select class="form-control"
					id="addUserType">
					<option value="1">CLIENT</option>
					<option value="2">PARTNER</option>
				</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Role Type</label> <select class="form-control"
					id="addRoleType">
					<option value="1">ADMIN</option>
					<option value="2">USER</option>
				</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Permission</label> <select class="form-control"
					id="addUserRolePermission">
					<option value="1">CREATE</option>
					<option value="2">READ</option>
					<option value="3">UPDATE</option>
					<option value="4">DELETE</option>
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
</div>


<div class="editRole-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">



			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Id</label> <input type="text" class="form-control" disabled
					id="editRoleID" value="" title="User Id">
			</div>


			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>User Type</label> <select class="form-control"
					id="editUserType">
					<option value="1" class="editUserType_CLIENT">CLIENT</option>
					<option value="2" class="editUserType_VENDOR">VENDOR</option>
				</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Role Type</label> <select class="form-control"
					id="editRoleType">
					<option value="1" class="editUserType_ADMIN">ADMIN</option>
					<option value="2" class="editUserType_USER">USER</option>
				</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Permission</label> <select class="form-control"
					id="editUserRolePermission">
					<option value="1" class="editUserRolePermission_CREATE">CREATE</option>
					<option value="2" class="editUserRolePermission_READ">READ</option>
					<option value="3" class="editUserRolePermission_UPDATE">UPDATE</option>
					<option value="4" class="editUserRolePermission_DELETE">DELETE</option>
				</select>
			</div>



		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editRole();">Save</button>
		<div>&nbsp;</div>
	</div>
</div>
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + "/role/data";
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
		var thead = "<thead><tr><th class='id'>Id</th><th class='user-type'>User Type</th><th class='role-type'>Role Type</th><th class='permission'>Permission</th><th class='op'>Operation</th></tr></thead>";
		$("#example").append(thead);
		for ( var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='user_"+rowData.id+"'/>")
		$("#example").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		row.append($("<td  class='id_"+rowData.id+"'>" + rowData.id + "</td>"));
		row.append($("<td class='uType_"+rowData.id+"' >" + rowData.userType
				+ "</td>"));
		row.append($("<td class='rType_"+rowData.id+"'>" + rowData.roleType
				+ "</td>"));
		row.append($("<td class='permission_"+rowData.id+"'>"
				+ rowData.permission.name + "</td>"));

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
		$('.addRole-content').addClass('hide');
		$('.add-role-container').show();
	}

	function cancelEdit() {

		$('.box-content').removeClass('hide');
		$('.editRole-content').addClass('hide');
		$('.add-role-container').show();
	}

	$('.cancelMe').click(function() {
		$('.add-role-container').show();
		$('.box-content').removeClass('hide');

	});

	var container = "box-inner";
	var errorCount = 0;

	var urlPerfix = fetchBackendUrl("config");
	if (urlPerfix == "ERROR") {
		urlPerfix = "";
	}

	$('.addUserBtn').click(function() {
		$('.add-role-container').hide();
		$('.box-content').addClass('hide');
		$('.addRole-content').removeClass('hide');

	});

	function saveMe() {

		$('.add-role-container').hide();
		$('.box-content').addClass('hide');
		$('.addRole-content').removeClass('hide');

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/role' + "/" + 'create';

		var role = {};
		var permission = {};

		var userType = $('#addUserType').find(":selected").text();
		var roleType = $('#addRoleType').find(":selected").text();
		var userRolePermission = $('#addUserRolePermission').find(":selected")
				.val();

		role["userType"] = userType;
		role["roleType"] = roleType;
		permission["id"] = userRolePermission;
		role["permission"] = permission;

		callAjaxPostJSON(urlMapping, "POST", "", role);
		$.growl({
			title : "Status",
			message : "Successfully Added!"
		});
		setInterval('refreshPage()', 500);
	}

	function updateMe(elem) {

		var elemSelected = $(elem).attr('id');
		var id = elemSelected.split('_')[1];
		if (id != "1") {

			$('.add-role-container').hide();
			$('.box-content').addClass('hide');
			$('.editRole-content').removeClass('hide');

			var userType = $('.uType_' + id).text();
			var roleType = $('.rType_' + id).text();
			var userRolePermission = $('.permission_' + id).text();

			$('#editRoleID').val(id);
			$('.editUserType_' + userType).attr('selected', 'true');
			$('.editUserType_' + roleType).attr('selected', 'true');
			
			$('.editUserRolePermission_' + userRolePermission).attr('selected',
					'true');

		} else {
			$.growl({
				title : "Status",
				message : "Sorry! This Role Cannot be Updated."
			});

		}

	}

	function editRole() {

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/role' + "/" + 'update';

		var role = {};
		var permission = {};

		var id = $('#editRoleID').val();
		var userType = $('#editUserType').find(":selected").text();
		var roleType = $('#editRoleType').find(":selected").text();
		var userRolePermission = $('#editUserRolePermission').find(":selected")
				.val();

		role["id"] = id;
		role["userType"] = userType;
		role["roleType"] = roleType;
		permission["id"] = userRolePermission;
		role["permission"] = permission;

		callAjaxPostJSON(urlMapping, "POST", "", role);

		$.growl({
			title : "Status",
			message : "Successfully updated!"
		});
		setInterval('refreshPage()', 500);
	}

	function deleteMe(elem) {
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		if (rowNum != "1") {
			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/role' + "/" + 'delete';

			var roles = {};
			roles["id"] = parseInt(rowNum);
			callAjaxPostJSON(urlMapping, "POST", "", roles);
			$.growl({
				title : "Status",
				message : "Successfully Deleted!"
			});
			setInterval('refreshPage()', 500);

		} else {
			$.growl({
				title : "Status",
				message : "Sorry! This Role Cannot be Deleted."
			});
		}

	}
</script>