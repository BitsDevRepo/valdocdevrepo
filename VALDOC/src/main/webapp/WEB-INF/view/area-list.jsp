<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc /Area</h2>
</div>
<div
	style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add New Area
	</a> </span>
</div>
<div class="box-content">
	<table id="areaTable"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">



			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area Name</label> <input type="text" class="form-control" placeholder="Enter Your Area Name"
					id="areaName" value="" title="Area name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Additional Details</label> <input type="text" class="form-control" placeholder="Enter AdditionalDetails"
					id="additionalDetails" value="" title="Additional Details">
					<input type="hidden" id="pid" value="1">
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


<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + "/area/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#areaTable').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});

	});

	function drawTable(data) {
		var thead = "<thead><tr><th class='id'>Id</th><th class='name'>Area Name</th><th class='email'>Additional Details</th><th class='createdDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#areaTable").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='user_"+rowData.id+"'/>")
		$("#areaTable").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='id_"+rowData.id+"'>" + rowData.areaId + "</td>"));
		row.append($("<td class='name_"+rowData.id+"' >" + rowData.areaName
				+ "</td>"));
		row.append($("<td class='type_"+rowData.id+"'>" + rowData.additionalDetails
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.createdDate
				+ "</td>"));
		row
				.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
						+ rowData.areaId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.areaId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.areaId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.areaId
						+ "' onClick='deleteMe(this);'><i class='fa fa-remove'></i></a></span></td>"));

	}

	function cancelAdd() {

		$('.box-content').removeClass('hide');
		$('.addUser-content').addClass('hide');
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

		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.addUser-content').removeClass('hide');

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/area' + "/" + 'create';
		var areas = {};
		var plant = {};
		
		var areaName = $('#areaName').val();
		var additionalDetails = $('#additionalDetails').val();
		var pid=$('#pid').val();
		//alert("New Values : "+areaName+"  : "+additionalDetails +"  : "+pid);
		plant["plantId"]=pid;
		areas["plant"]=plant;
		areas["areaName"] = areaName;
		areas["additionalDetails"] = additionalDetails;
		callAjaxPostJSON(urlMapping, "POST", "", areas);
	}

	function updateMe(elem) {

		//	var elemSelected = $(elem).attr('id');
		//	alert("updatekMe id : " + elemSelected);
		//	var rowNum = elemSelected.split('_')[1];
		//	var id = elemSelected.split('_')[2];
		//	var gname = elemSelected.split('_')[3];
		//	var rpmMapId = elemSelected.split('_')[4];

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/area' + "/" + 'update';
		var areas = {};
		
		users["id"] = 1;
		users["name"] = "fjfj";
		users["email"] = "Aryans";
		users["password"] = "Aryans";

		role["id"] = 1;
		role["userType"] = "abc";
		permission["id"] = 1;
		permission["name"] = "xyz";
		users["userRole"] = role;
		role["permission"] = permission;
		callAjaxPostJSON(urlMapping, "POST", "", areas);

	}

	function deleteMe(elem) {
		var elemSelected = $(elem).attr('id');
		
		var rowNum = elemSelected.split('_')[1];
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/area' + "/" + 'delete';
		var areas = {};
		areas["areaId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", areas);
	}
</script>