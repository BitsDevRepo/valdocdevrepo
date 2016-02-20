<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc/Equipment/Filter</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add New Applicable Test Equipment
	</a> </span>
</div>
<div class="box-content">
	<table id="exampleApplicable"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Name</label> <input type="text" class="form-control"
					id="testName" value="" title="Test Name" placeholder="e.g. F1">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Periodicity</label> <input type="text" class="form-control" placeholder="e.g. 10.5 (In Feet)"  
					id="periodicity" value="" title="Periodicity" >
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Location</label> <input type="text" class="form-control" placeholder="e.g. 20.25 (In Feet)"
					id="location" value="" title="Location" >
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>No Of Cycle</label> <input type="number" class="form-control" 
					id="noOfCycle" value="" title="No Of Cycle" >
			</div>
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Id</label> <select type="number" class="form-control" 
					id="equipmentId" title=" Equipment ID for the Filter">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
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


<div class="editUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Edit Aplicable Test Id</label> <input type="text" class="form-control"
					id="editAplicableTestId" value="" title="Edit Aplicable Test Id" disabled>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Name</label> <input type="text" class="form-control"
					id="editTestName" value="" title="Test Name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Periodicity</label> <input type="text" class="form-control"  
					id="editPeriodicity" value="" title="Periodicity" >
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Location</label> <input type="text" class="form-control"
					id="editOcation" value="" title="Location" >
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Edit No Of Cycle</label> <input type="text" class="form-control"
					id="editNoOfCycle" value="" title="No Of Cycle" >
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Id</label> <select type="number" class="form-control" 
					id="editEquipmentId" title=" Equipment ID for the Filter">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					</select>
			</div>
			
		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editEquipment();">Save</button>
		<div>&nbsp;</div>
	</div>
</div>
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + '/equipment' + "/" + 'applicabletestequipment' + "/" + 'data';
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#exampleApplicable').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});

	});
	
	function drawTable(data) {
		var thead = "<thead><tr><th class='aplicableTestId'>Id</th><th class='testName'>Test Name</th><th class='equipmentId'>Equipment Id</th><th class='periodicity'>Periodicity</th><th class='location'>Location</th><th class='noOfCycle'>No Of Cycle</th><th class='creationDate'>Creation Date</th><th class='op'>Operation</th></tr></thead>";
		$("#exampleApplicable").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='applicableTestEquipment_"+rowData.aplicableTestId+"'/>")
		$("#exampleApplicable").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it
		row.append($("<td  class='aplicableTestId_"+rowData.aplicableTestId+"'>" + rowData.aplicableTestId + "</td>"));
		row.append($("<td class='testName_"+rowData.aplicableTestId+"' >" + rowData.testName
				+ "</td>"));
		row.append($("<td class='equipmentId_"+rowData.aplicableTestId+"'>" + rowData.equipmentId
				+ "</td>"));

		

		row.append($("<td class='periodicity_"+rowData.aplicableTestId+"'>" + rowData.periodicity
				+ "</td>"));

		row.append($("<td class='ocation_"+rowData.aplicableTestId+"'>" + rowData.ocation
				+ "</td>"));

		row.append($("<td class='noOfCycle_"+rowData.aplicableTestId+"'>" + rowData.noOfCycle
				+ "</td>"));
		
		row.append($("<td class='creationDate_"+rowData.aplicableTestId+"'>" + rowData.creationDate
				+ "</td>"));

		row.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
						+ rowData.aplicableTestId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.aplicableTestId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.aplicableTestId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.aplicableTestId
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

	function isValidEmailAddress(value) {
		var pattern = new RegExp(
				/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);
		return pattern.test(value);
	}

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
		var errorCount=0;
		var urlPerfix = fetchBackendUrl("config");		
		var urlMapping = urlPerfix + '/equipment' + "/" + 'applicabletestequipment' + "/" + 'create';
		var applicableTests = {};
		
		var testName = $('#testName').val();		
		var equipmentId = $('#equipmentId').val();		
		var periodicity = $('#periodicity').val();
		var ocation = $('#location').val();		
		var noOfCycle = $('#noOfCycle').val();
		
		if (validate("testName", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("periodicity", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("location", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("noOfCycle", "STRING")) {
		} else {
			errorCount++;
		}
		
		if(errorCount<1)
		{
			errorCount=0;
			applicableTests["testName"] = testName;	
			applicableTests["equipmentId"] = equipmentId;
			applicableTests["periodicity"] = periodicity;
			applicableTests["ocation"] = ocation;
			applicableTests["noOfCycle"] = noOfCycle;
			
			callAjaxPostJSON(urlMapping, "POST", "", applicableTests);
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
		
		var aplicableTestId = $('.aplicableTestId_' + id).text();
		var testName = $('.testName_' + id).text();		
		var equipmentId = $('.equipmentId_' + id).text();		
		var periodicity = $('.periodicity_' + id).text();
		var ocation = $('.ocation_' + id).text();	
		var noOfCycle = $('.noOfCycle_' + id).text();
		
		$('#editAplicableTestId').val(aplicableTestId) ;		
		$('#editTestName').val(testName);		
		$('#editEquipmentId').val(equipmentId);		
		$('#editPeriodicity').val(periodicity);
		$('#editOcation').val(ocation);		
		$('#editNoOfCycle').val(noOfCycle);		
	}
	
	function cancelEdit() {
		$('.box-content').removeClass('hide');
		$('.editUser-content').addClass('hide');
		$('.add-user-container').show();
		
	}

	function deleteMe(elem) {
	try{
			var elemSelected = $(elem).attr('id');
			var rowNum = elemSelected.split('_')[1];
			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/equipment' + "/" + 'applicabletestequipment' + "/" + 'delete';
			var applicableTests = {};
			applicableTests["aplicableTestId"] = parseInt(rowNum);
			callAjaxPostJSON(urlMapping, "POST", "", applicableTests);
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
	function editEquipment(){
	
		errorCount=0;
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/equipment' + "/" + 'applicabletestequipment' + "/" + 'update';
		var applicableTests = {};
		var aplicableTestId = $('#editAplicableTestId').val();
		var testName = $('#editTestName').val();		
		var equipmentId = $('#editEquipmentId').val();		
		var periodicity = $('#editPeriodicity').val();
		var ocation = $('#editOcation').val();	
		var noOfCycle = $('#editNoOfCycle').val();
		
		
		if (validate("editAplicableTestId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editTestName", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editEquipmentId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editPeriodicity", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editOcation", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editNoOfCycle", "STRING")) {
		} else {
			errorCount++;
		}
		
		if(errorCount<1){
			try{
			errorCount=0;
			applicableTests["aplicableTestId"] = aplicableTestId;	
			applicableTests["testName"] = testName;	
			applicableTests["equipmentId"] = equipmentId;
			applicableTests["periodicity"] = periodicity;
			applicableTests["ocation"] = ocation;
			applicableTests["noOfCycle"] = noOfCycle;
			callAjaxPostJSON(urlMapping, "POST", "", applicableTests);
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