<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / Equipment</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add New Equipment
	</a> </span>
</div>
<div class="box-content">
	<table id="exampleEquipment"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Number</label> <input type="text" class="form-control"
					id="equipmentNo" value="" title="Equipment No" placeholder="e.g. QCDGC01">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Name</label> <input type="text" class="form-control" placeholder="e.g. Dynamic Garment Cubical"  
					id="equipmentName" value="" title="Equipment Name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Occupancy State</label> <input type="text" class="form-control" placeholder="e.g. IDLE"
					id="occupancyState" value="" title="Occupancy State">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Velocity</label> <input type="number" class="form-control" placeholder="e.g. 0.4 (In fPm)"
					id="velocity" value="" title="Velocity In fPm">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Reference</label> <input type="text" class="form-control" placeholder="e.g. ISO 14644(ISO Clause)"
					id="testReference" value="" title="Test Reference">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter Quantity</label> <input type="number" class="form-control" placeholder="e.g. 10"
					id="filterQuantity" value="" title="Filter Quantity">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Load</label> <input type="number" class="form-control" placeholder="e.g. 10.5 (In kW)"
					id="equipmentLoad" value="" title="Equipment Load in kW">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Id</label> <select type="number" class="form-control" placeholder="e.g. 1"
					id="roomId" title="Room Id of the Equipment">
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
				<label>Equipment Id</label> <input type="text" class="form-control"
					id="editEquipmentId" value="" disabled title="Equipment Id">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Number</label> <input type="text" class="form-control"
					id="editEquipmentNumber" value="" title="Equipment Number" placeholder="e.g. QCDGC01">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Name</label> <input type="text" class="form-control"
					id="editEquipmentName" value="" title="Equipment Name">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Occupancy State</label> <input type="text" class="form-control" placeholder="e.g. IDLE"
					id="editOccupancyState" value="" title="Occupancy State">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Velocity</label> <input type="number" class="form-control" placeholder="e.g. 0.4 (In fPm)"
					id="editVelocity" value="" title="Velocity In fPm">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Refrence</label> <input type="text" class="form-control" placeholder="e.g. ISO 14644(ISO Clause)"
					id="editTestReference" value="" title="Test Reference">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter Quantity</label> <input type="number" class="form-control" placeholder="e.g. 10"
					id="editFilterQuantity" value="" title="Filter Quantity">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Equipment Load</label> <input type="number" class="form-control" placeholder="e.g. 10.5 (In kW)"
					id="editEquipmentLoad" value="" title="Equipment Load in kW">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Id</label> <select type="number" class="form-control" placeholder="e.g. 1"
					id="editRoomId" value="" title="Room Id of the Equipment">
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
		urlPerfix = urlPerfix + "/equipment/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#exampleEquipment').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});

	});

	function drawTable(data) {
		var thead = "<thead><tr><th class='equipmentId'>Id</th><th class='equipmentName'>Equipment Name</th><th class='equipmentNo'>Equipment Number</th><th class='velocity'>Velocity ( In fPm)</th><th class='occupancyState'>Occupancy State</th><th class='testReference'>Test Reference</th><th class='filterQuantity'>Filter Quantity</th><th class='equipmentLoad'>Equipment Load (in kW)</th><th class='creationDate'>Creation Date</th><th class='roomId'>Room Id</th><th class='op'>Operation</th></tr></thead>";
		$("#exampleEquipment").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='equipment_"+rowData.equipmentId+"'/>")
		$("#exampleEquipment").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it
		row.append($("<td  class='equipmentId_"+rowData.equipmentId+"'>" + rowData.equipmentId + "</td>"));
		row.append($("<td class='equipmentName_"+rowData.equipmentId+"' >" + rowData.equipmentName
				+ "</td>"));
		row.append($("<td class='equipmentNo_"+rowData.equipmentId+"'>" + rowData.equipmentNo
				+ "</td>"));

		row.append($("<td class='velocity_"+rowData.equipmentId+"'>" + rowData.velocity
				+ "</td>"));

		row.append($("<td class='occupancyState_"+rowData.equipmentId+"'>" + rowData.occupancyState
				+ "</td>"));

		row.append($("<td class='testReference_"+rowData.equipmentId+"'>" + rowData.testReference
				+ "</td>"));

		row.append($("<td class='filterQuantity_"+rowData.equipmentId+"'>" + rowData.filterQuantity
				+ "</td>"));

		row.append($("<td class='equipmentLoad_"+rowData.equipmentId+"'>" + rowData.equipmentLoad
				+ "</td>"));

		row.append($("<td class='creationDate_"+rowData.equipmentId+"'>" + rowData.creationDate
				+ "</td>"));
				
		row.append($("<td class='roomId_"+rowData.equipmentId+"'>" + rowData.roomId
				+ "</td>"));

		row.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
						+ rowData.equipmentId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.equipmentId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.equipmentId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.equipmentId
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
		var urlMapping = urlPerfix + '/equipment' + "/" + 'create';
		var equipments = {};
		
		var equipmentName = $('#equipmentName').val();		
		var equipmentNo = $('#equipmentNo').val();		
		var velocity = $('#velocity').val();
		var occupancyState = $('#occupancyState').val();		
		var testReference = $('#testReference').val();
		var filterQuantity = $('#filterQuantity').val();
		var equipmentLoad = $('#equipmentLoad').val();
		var roomId = $('#roomId').val();
		if (validate("equipmentName", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("equipmentNo", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("equipmentName", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("occupancyState", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("testReference", "STRING")) {
		} else {
			errorCount++;
		}
		/*
		if (validate("velocity", "FLOAT")) {
		} else {
			errorCount++;
		}
		if (validate("equipmentLoad", "FLOAT")) {
		} else {
			errorCount++;
		}
		if (validate("filterQuantity", "INTEGER")) {
		} else {
			errorCount++;
		}
		*/
		
		if(errorCount<1)
		{
			equipments["roomId"] = roomId;	
			equipments["occupancyState"] = occupancyState;
			equipments["velocity"] = velocity;
			equipments["filterQuantity"] = filterQuantity;
			equipments["equipmentLoad"] = equipmentLoad;
			equipments["equipmentName"] = equipmentName;
			equipments["testReference"] = testReference;
			equipments["equipmentNo"] = equipmentNo;	
			
			callAjaxPostJSON(urlMapping, "POST", "", equipments);
			$.growl({
				title : "Status",
				message : "Successfully Added!"
			});
			setInterval('refreshPage()', 500);
		}
	}

	function updateMe(elem) {

		//	var elemSelected = $(elem).attr('id');
		//	alert("updatekMe id : " + elemSelected);
		//	var rowNum = elemSelected.split('_')[1];
		//	var id = elemSelected.split('_')[2];
		//	var gname = elemSelected.split('_')[3];
		//	var rpmMapId = elemSelected.split('_')[4];		
		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.editUser-content').removeClass('hide');
		
		
		var elemSelected = $(elem).attr('id');
		var id = elemSelected.split('_')[1];
		
		var equipmentId = $('.equipmentId_' + id).text();
		var equipmentName = $('.equipmentName_'+ id).text();		
		var equipmentNo = $('.equipmentNo_'+ id).text();		
		var velocity = $('.velocity_'+ id).text();
		var occupancyState = $('.occupancyState_'+ id).text();		
		var testReference = $('.testReference_'+ id).text();
		var filterQuantity = $('.filterQuantity_'+ id).text();
		var equipmentLoad = $('.equipmentLoad_'+ id).text();
		var roomId = $('.roomId_'+ id).text();
		
		$('#editEquipmentId').val(equipmentId) ;		
		$('#editEquipmentName').val(equipmentName);		
		$('#editEquipmentNumber').val(equipmentNo);		
		$('#editVelocity').val(velocity);
		$('#editOccupancyState').val(occupancyState);		
		$('#editTestReference').val(testReference);
		$('#editFilterQuantity').val(filterQuantity);
		$('#editEquipmentLoad').val(equipmentLoad);
		$('#editRoomId').val(roomId);
		
	}
	
	function cancelEdit() {

		$('.box-content').removeClass('hide');
		$('.editUser-content').addClass('hide');
		$('.add-user-container').show();
	}

	function deleteMe(elem) {
		var elemSelected = $(elem).attr('equipmentId');
		alert("equipmentId = "+equipmentId);
		var rowNum = elemSelected.split('_')[1];
		alert("Row number"+rowNum);
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/equipment' + "/" + 'delete';
		var equipments = {};
		equipments["equipmentId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", equipments);
		$.growl({
				title : "Status",
				message : "Successfully Deleted!"
			});
			setInterval('refreshPage()', 500);
	}
	function editEquipment(){
	
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/equipment' + "/" + 'update';
		var equipments = {};
		var equipmentId = $('#editEquipmentId').val();	
		alert(equipmentId);		
		var equipmentName = $('#editEquipmentName').val();		
		var equipmentNo = $('#editEquipmentNumber').val();		
		var velocity = $('#editVelocity').val();
		var occupancyState = $('#editOccupancyState').val();		
		var testReference = $('#editTestReference').val();
		var filterQuantity = $('#editFilterQuantity').val();
		var equipmentLoad = $('#editEquipmentLoad').val();
		var roomId = $('#editRoomId').val();
		if (validate("editEquipmentName", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editEquipmentNumber", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editOccupancyState", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editTestReference", "STRING")) {
		} else {
			errorCount++;
		}
		/*
		if (validate("velocity", "FLOAT")) {
		} else {
			errorCount++;
		}
		if (validate("equipmentLoad", "FLOAT")) {
		} else {
			errorCount++;
		}
		if (validate("filterQuantity", "INTEGER")) {
		} else {
			errorCount++;
		}
		*/
		if(errorCount<1){
			try{
			equipments["equipmentId"] = equipmentId.trim();
			equipments["roomId"] = roomId;	
			equipments["occupancyState"] = occupancyState;
			equipments["velocity"] = velocity;
			equipments["filterQuantity"] = filterQuantity;
			equipments["equipmentLoad"] = equipmentLoad;
			equipments["equipmentName"] = equipmentName;
			equipments["testReference"] = testReference;
			equipments["equipmentNo"] = equipmentNo;
			
			callAjaxPostJSON(urlMapping, "POST", "", equipments);
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