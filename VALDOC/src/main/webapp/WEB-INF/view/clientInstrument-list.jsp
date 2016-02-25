<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / Client Instrument</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add Client Instrument Details
	</a> </span>
</div>
<div class="box-content">
	<table id="roomFilter"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Used</label>  <input type="text" class="form-control" placeholder="e.g. AV/AC"
					id="testId" value="" title="Test Used">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Instrument Sr. No</label>   <input type="text" class="form-control" placeholder="e.g. Q591062"
					id="serialNo" value="" title="Instrument Sr. No">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Instrument Used</label>  <input type="text" class="form-control" placeholder="e.g. Hot Wire Anemometer"
					id="cInstrumentName" value="" title="Instrument Used">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Make</label>  <input type="text" class="form-control" placeholder="e.g. LUTRON"
					id="make" value="" title="Efficiency">
			</div>			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Model</label>  <input type="text" class="form-control" placeholder="e.g. AM-4204"
					id="model" value="" title="Model">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Calibrated on</label>  <input type="date" class="form-control"
					id="lastCalibrationDate" value="" title="Calibrated on">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Calibration Due on</label> <input type="date" class="form-control"
					id="calibrationDueDate" value="" title="Calibration Due on">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Current Location</label> <input type="text" class="form-control"
					id="currentLocation" value="" title="Current Location" placeholder="e.g. Bangalore">
			</div>
		</div>	
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Instrument Id</label> <input type="text" class="form-control" placeholder="e.g. CEPL/INST/001"
					id="instrumentId" value="" title="Instrument Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Status</label> <input type="text" class="form-control" placeholder="e.g. valid"
					id="status" value="" title="Status">
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
<!--  For Edit  -->
<div class="editUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>ID</label>  <input type="text" class="form-control" disabled="disabled"
					id="editcInstrumentId" value="" title="Filter Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Used</label>  <input type="text" class="form-control" placeholder="e.g. AV/AC"
					id="edittestId" value="" title="Test Used">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Instrument Sr. No</label>   <input type="text" class="form-control" placeholder="e.g. Q591062"
					id="editserialNo" value="" title="Instrument Sr. No">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Instrument Used</label>  <input type="text" class="form-control" placeholder="e.g. Hot Wire Anemometer"
					id="editcInstrumentName" value="" title="Instrument Used">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Make</label>  <input type="text" class="form-control" placeholder="e.g. LUTRON"
					id="editmake" value="" title="Efficiency">
			</div>			
						
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Model</label>  <input type="text" class="form-control" placeholder="e.g. AM-4204"
					id="editmodel" value="" title="Model">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Calibrated on</label>  <input type="date" class="form-control"
					id="editlastCalibrationDate" value="" title="Calibrated on">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Calibration Due on</label> <input type="date" class="form-control"
					id="editcalibrationDueDate" value="" title="Calibration Due on">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Current Location</label> <input type="text" class="form-control"
					id="editcurrentLocation" value="" title="Current Location" placeholder="e.g. Bangalore">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Instrument Id</label> <input type="text" class="form-control" placeholder="e.g. CEPL/INST/001"
					id="editinstrumentId" value="" title="Instrument Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Status</label> <input type="text" class="form-control" placeholder="e.g. valid"
					id="editstatus" value="" title="Status">
			</div>
		</div>
	</div>
		<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editClientInstrument();">Save</button>
		<div>&nbsp;</div>
	</div>
</div>    
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + "/clientInstrument/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#clientInstrument').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});
	});
	
	function drawTable(data) {
		var thead = "<thead><tr><th class='returnAirCFM'>Sl</th><th class='returnAirCFM'>Test Used</th><th class='returnAirCFM'>Instrument Sr. No</th><th class='returnAirCFM'>Instrument Used</th><th class='returnAirCFM'>Make</th><th class='returnAirCFM'>Model</th><th class='returnAirCFM'>Calibrated on</th><th class='returnAirCFM'>Calibration Due on</th><th class='exhaustAirCFM'>Current Location</th><th class='exhaustAirCFM'>Instrument Id</th><th class='bleedFilterType'>Status</th><th class='createdDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#roomFilter").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}
//rowData.userRole.userType
	function drawRow(rowData) {
		var row = $("<tr class='clientInstrument_"+rowData.cInstrumentId+"'/>")
		$("#roomFilter").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='cInstrumentId_"+rowData.cInstrumentId+"'>" + rowData.cInstrumentId + "</td>"));
		
		row.append($("<td  class='testId_"+rowData.cInstrumentId+"'>" + rowData.testId + "</td>"));
		
		row.append($("<td  class='serialNo_"+rowData.cInstrumentId+"'>" + rowData.serialNo + "</td>"));

		row.append($("<td class='cInstrumentName_"+rowData.cInstrumentId+"'>" + rowData.cInstrumentName
				+ "</td>"));
		
		row.append($("<td class='make_"+rowData.cInstrumentId+"'>" + rowData.make
				+ "</td>"));

		row.append($("<td class='model_"+rowData.cInstrumentId+"'>" + rowData.model
				+ "</td>"));

		row.append($("<td class='lastCalibrationDate_"+rowData.cInstrumentId+"'>" + rowData.lastCalibrationDate
				+ "</td>"));

		row.append($("<td class='calibrationDueDate_"+rowData.cInstrumentId+"'>" + rowData.calibrationDueDate
				+ "</td>"));
		
		row.append($("<td class='currentLocation_"+rowData.cInstrumentId+"'>" + rowData.currentLocation
				+ "</td>"));

		
		row.append($("<td class='instrumentId_"+rowData.cInstrumentId+"'>" + rowData.instrumentId
				+ "</td>"));

		row.append($("<td class='status_"+rowData.cInstrumentId+"'>" + rowData.status
				+ "</td>"));
		
		row.append($("<td class='creationDate_"+rowData.cInstrumentId+"'>" + rowData.creationDate
				+ "</td>"));
		row.append($("<td class='tdBtn_"+rowData.cInstrumentId+"'><span><a id='editBtn_"
						+ rowData.cInstrumentId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.cInstrumentId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.cInstrumentId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.cInstrumentId
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
		var urlMapping = urlPerfix + '/clientInstrument' + "/" + 'create';
		var cins = {};
		
		var instrumentId = $('#instrumentId').val();		
		var serialNo = $('#serialNo').val();
		var lastCalibrationDate = $('#lastCalibrationDate').val();
		var cInstrumentName = $('#cInstrumentName').val();
		var calibrationDueDate=$('#calibrationDueDate').val();
		var currentLocation=$('#currentLocation').val();
		var status=$('#status').val();
		var testId=$('#testId').val();
		var make=$('#make').val();
		var model=$('#model').val();
		
	//	alert("New Values : "+isSupplyFilter );	
	
    if (validate("instrumentId", "STRING")) {
	} else {
		errorCount++;
	}
	
	if (validate("serialNo", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("lastCalibrationDate", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("cInstrumentName", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("calibrationDueDate", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("currentLocation", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("status", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("testId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("make", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("model", "STRING")) {
	} else {
		errorCount++;
	}

	if(errorCount<1){
		errorCount=0;
		
		cins["instrumentId"] = instrumentId;
		cins["serialNo"] = serialNo;
		cins["cInstrumentName"] = cInstrumentName;
		cins["lastCalibrationDate"] = lastCalibrationDate;
		cins["calibrationDueDate"] = calibrationDueDate;
		cins["currentLocation"] = currentLocation;
		cins["testId"] = testId;
		cins["make"] = make;
		cins["model"] = model;
		cins["status"] = status;
		callAjaxPostJSON(urlMapping, "POST", "", cins);
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
		
		var cInstrumentId = $('.cInstrumentId_' + id).text();
		var instrumentId = $('.instrumentId_' + id).text();
		var serialNo = $('.serialNo_' + id).text();
		var lastCalibrationDate = $('.lastCalibrationDate_' + id).text();
		var cInstrumentName = $('.cInstrumentName_' + id).text();
		var calibrationDueDate=$('.calibrationDueDate_' + id).text();
		var currentLocation=$('.currentLocation_' + id).text();
		var status=$('.status_' + id).text();
		var testId=$('.testId_' + id).text();
		var make=$('.make_' + id).text();
		var model=$('.model_' + id).text();
		
		$('#editcInstrumentId').val(cInstrumentId);
		$('#editinstrumentId').val(instrumentId);
		$('#editserialNo').val(serialNo);
		$('#editcInstrumentName').val(cInstrumentName);
		$('#editmake').val(make);
		$('#editmodel').val(model);
		//$('#editisSupplyFilter').val(isSupplyFilter);
		$('#editlastCalibrationDate').val(lastCalibrationDate);
		$('#editcalibrationDueDate').val(calibrationDueDate);
		$('#editcurrentLocation').val(currentLocation);
		$('#editstatus').val(status);
		$('#edittestId').val(testId);
	}

	function deleteMe(elem) {
		try{
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/clientInstrument' + "/" + 'delete';
		var filters = {};
		filters["cInstrumentId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", filters);
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

function editClientInstrument(){

	errorCount=0;
	var urlPerfix = fetchBackendUrl("config");
	var urlMapping = urlPerfix + '/clientInstrument' + "/" + 'update';
	var cins = {};

	var instrumentId = $('#editinstrumentId').val();		
	var serialNo = $('#editserialNo').val();
	var lastCalibrationDate = $('#editlastCalibrationDate').val();
	var cInstrumentName = $('#editcInstrumentName').val();
	var calibrationDueDate=$('#editcalibrationDueDate').val();
	var currentLocation=$('#editcurrentLocation').val();
	var status=$('#editstatus').val();
	var testId=$('#edittestId').val();
	var make=$('#editmake').val();
	var model=$('#editmodel').val();
	var cInstrumentId = $('#editcInstrumentId').val();
	
    if (validate("editinstrumentId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editcInstrumentId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editserialNo", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editlastCalibrationDate", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editcInstrumentName", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editcalibrationDueDate", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editcurrentLocation", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editstatus", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("edittestId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editmake", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editmodel", "STRING")) {
	} else {
		errorCount++;
	}
	
	if(errorCount<1){
		try{		
		errorCount=0;
		
		cins["cInstrumentId"] = cInstrumentId;		
		cins["instrumentId"] = instrumentId;
		cins["serialNo"] = serialNo;
		cins["cInstrumentName"] = cInstrumentName;
		cins["lastCalibrationDate"] = lastCalibrationDate;
		cins["calibrationDueDate"] = calibrationDueDate;
		cins["currentLocation"] = currentLocation;
		cins["testId"] = testId;
		cins["make"] = make;
		cins["model"] = model;
		cins["status"] = status;
		
		callAjaxPostJSON(urlMapping, "POST", "", cins);
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