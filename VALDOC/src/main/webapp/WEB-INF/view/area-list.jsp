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

<div class="editUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Id</label> <input type="text" class="form-control" disabled="disabled"
					id="editareaId" value="" title="Area Id">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area Name</label> <input type="text" class="form-control" placeholder="Enter Your Area Name"
					id="editareaName" value="" title="Area name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Additional Details</label> <input type="text" class="form-control" placeholder="Enter AdditionalDetails"
					id="editadditionalDetails" value="" title="Additional Details">
					<input type="hidden" id="editpid" value="1">
			</div>
		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editArea();">Save</button>
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
		var row = $("<tr class='area_"+rowData.areaId+"'/>")
		$("#areaTable").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='areaId_"+rowData.areaId+"'>" + rowData.areaId + "</td>"));
		row.append($("<td class='areaName_"+rowData.areaId+"' >" + rowData.areaName
				+ "</td>"));
		row.append($("<td class='additionalDetails_"+rowData.areaId+"'>" + rowData.additionalDetails
				+ "</td>"));

		row.append($("<td class='createdDate_"+rowData.areaId+"'>" + rowData.createdDate
				+ "</td>"));
		row
				.append($("<td class='tdBtn_"+rowData.areaId+"'><span><a id='editBtn_"
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
		errorCount=0;

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/area' + "/" + 'create';
		var areas = {};
		var plant = {};
		
		var areaName = $('#areaName').val();
		var additionalDetails = $('#additionalDetails').val();
		var pid=$('#pid').val();
		//alert("New Values : "+areaName+"  : "+additionalDetails +"  : "+pid);
		if (validate("areaName", "STRING")) {
		} else {
			errorCount++;
		}
		
	if(errorCount<1)
		{
			errorCount=0;
		plant["plantId"]=pid;
		areas["plant"]=plant;
		areas["areaName"] = areaName;
		areas["additionalDetails"] = additionalDetails;
		callAjaxPostJSON(urlMapping, "POST", "", areas);
		$.growl({
			title : "Status",
			message : "Successfully Added!"
		});
		setInterval('refreshPage()', 500);
		}
	}

	function updateMe(elem) {
		
		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.editUser-content').removeClass('hide');
		
		
		var elemSelected = $(elem).attr('id');
		var id = elemSelected.split('_')[1];
		
		var areaId = $('.areaId_' + id).text();
		var areaName = $('.areaName_' + id).text();
		var additionalDetails = $('.additionalDetails_' + id).text();
		
		$('#editareaId').val(areaId);
		$('#editareaName').val(areaName);
		$('#editadditionalDetails').val(additionalDetails);

	}

	function deleteMe(elem) {
		try{
			var elemSelected = $(elem).attr('id');
		
			var rowNum = elemSelected.split('_')[1];
			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/area' + "/" + 'delete';
			var areas = {};
			areas["areaId"] = parseInt(rowNum);
			callAjaxPostJSON(urlMapping, "POST", "", areas);
			$.growl({
				title : "Status",
				message : "Successfully Deleted!"
			});
			setInterval('refreshPage()', 500);
			}catch(err){
				$.growl({
				title : "Status",
				message : "Could not delete!"
			});
			setInterval('refreshPage()', 500);
			}
	}
	function cancelEdit() {
		$('.box-content').removeClass('hide');
		$('.editUser-content').addClass('hide');
		$('.add-user-container').show();
		
	}

	function editArea(){
	
		errorCount=0;
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/area' + "/" + 'update';
		
		var areas = {};
		var plant={};
	    
		var pid=$('#editpid').val();
		var areaId= $('#editareaId').val();
		var areaName = $('#editareaName').val();
		var additionalDetails = $('#editadditionalDetails').val();
		
		if (validate("editareaId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editareaName", "STRING")) {
		} else {
			errorCount++;
		}
		
		if(errorCount<1){
			try{		
			errorCount=0;
			plant["plantId"]=pid;
			areas["plant"]=plant;			
			areas["areaId"] = areaId;
			areas["areaName"] = areaName;
			areas["additionalDetails"] = additionalDetails;
			callAjaxPostJSON(urlMapping, "POST", "", areas);
			$.growl({
				title : "Status",
				message : "Successfully updated!"
			});
			setInterval('refreshPage()', 500);
			}catch(err)
			{
				$.growl({
				title : "Status",
				message : "Unsuccessful!"
			});
			setInterval('refreshPage()', 500);
			}
			}
	}
</script>