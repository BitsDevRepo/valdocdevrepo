<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / Room</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add Room Details
	</a> </span>
</div>
<div class="box-content">
	<table id="room"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU No.</label> <select class="form-control" id="ahuNo">
					<option value="1">AHU 01</option>
					<option value="2">AHU 02</option>
					<option value="3">AHU 03</option>
					<option value="4">AHU 04</option>
				</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area Name</label> <select class="form-control" id="areaName">
					<option value="1">Filling Area</option>
					<option value="2">Packing Area</option>
					<option value="3">Warehouse</option>
				</select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Name</label> <input type="text" class="form-control"
					id="roomName" value="" title="Room Name" placeholder="e.g. Recirculation">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room No</label> <input type="text" class="form-control" placeholder="Room No 1"
					id="roomNo" value="" title="Room No">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control" placeholder="e.g. 12"
					id="width" value="" title="Width">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" placeholder="e.g. 12"
					id="length" value="" title="Length">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Height</label> <input type="number" class="form-control" placeholder="e.g. 12"
					id="height" value="" title="Height">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area</label> <input type="number" class="form-control" placeholder="e.g. 144"
					id="area" value="" title="Area">
			</div>
			
		</div>
		
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Volume</label> <input type="number" class="form-control" placeholder="e.g. 1880"
					id="volume" value="" title="Volume">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>ACPH(NLT)</label> <input type="number" class="form-control" placeholder="e.g. 25"
					id="acphNLT" value="" title="ACPH(NLT)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Ref</label> <input type="text" class="form-control" placeholder="e.g. ISO 14644"
					id="testRef" value="" title="Test Ref">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>ISO Clause</label> <input type="text" class="form-control" placeholder="e.g. ISO 8"
					id="isoClause" value="" title="ISO Clause">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>	Occupancy State</label> <input type="text" class="form-control" placeholder="e.g. At Rest"
					id="occupancyState" value="" title="	Occupancy State">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Supply Airflow (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 4"
					id="roomSupplyAirflowCFM" value="" title="Room Supply Airflow (cfm)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU Flow (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 3600"
					id="ahuFlowCFM" value="" title="Ahu Flow (cfm)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Pressure PA</label> <input type="number" class="form-control" placeholder="e.g. 20"
					id="roomPressurePA" value="" title="Room Pressure PA">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 60"
					id="freshAirCFM" value="" title="Fresh Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 60"
					id="bleedAirCFM" value="" title="Bleed Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Exhaust Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 0"
					id="exhaustAirCFM" value="" title="Exhaust Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>	Temperature</label> <input type="number" class="form-control" placeholder="e.g. 22"
					id="temperature" value="" title="Temperature(C)">
			</div>
		</div>
		
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>RH%</label> <input type="number" class="form-control" placeholder="e.g. 55"
					id="rh" value="" title="RH%">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Return Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 560"
					id="returnAirCFM" value="" title="Return Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply Air Grill QTY (Nos)</label> <input type="number" class="form-control" placeholder="e.g. 9"
					id="supplyAirGrillQTY" value="" title="Supply Air Grill QTY (Nos)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>	Return Air Grill QTY (Nos)</label> <input type="number" class="form-control" placeholder="e.g. 2"
					id="returnAirGrillQTY" value="" title="Return Air Grill QTY (Nos)">
			</div>
		</div>
		
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply Air Filter QTY(Nos)</label> <input type="number" class="form-control" placeholder="e.g. 9"
					id="supplyAirFilterQTY" value="" title="Supply Air Filter QTY(Nos)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Return Air Filter QTY(Nos)</label> <input type="number" class="form-control" placeholder="e.g. 2"
					id="returnAirFilterQTY" value="" title="Return Air Filter QTY(Nos)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Remarks</label> <input type="text" class="form-control" placeholder=""
					id="remarks" value="" title="Remarks">
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
		urlPerfix = urlPerfix + "/room/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#room').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});
	});
/*  
	function drawTable1(ahudata) {
		var thead = "<thead><tr><th class='roomId'>Id</th><th class='returnAirCFM'>AHU<th class='op'>Operation</th></tr></thead>";
		$("#ahuroom").append(thead);
		for (var i = 0; i < ahudata.length; i++) {
			drawRow(ahudata[i]);
		}
	}
//rowData.userRole.userType
	function drawRow(rowData1) {
		var row = $("<tr class='user_"+rowData1.id+"'/>")
		$("#ahuroom").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='id_"+rowData1.id+"'>" + rowData1.ahuId + "</td>"));
		
		row.append($("<td class='type_"+rowData1.id+"'>" + rowData1.ahuType
				+ "</td>"));
	}
 */ 



	function drawTable(data) {
		var thead = "<thead><tr><th class='roomId'>Id</th><th class='returnAirCFM'>AHU</th><th class='exhaustAirCFM'>Area</th><th class='returnAirCFM'>Room Name</th><th class='exhaustAirCFM'>Room No</th><th class='bleedFilterType'>Width(Ft)</th><th class='bleedFilterEfficiency'>Length(Ft)</th><th class='bleedAirCFM'>Height(Ft)</th><th class='bleedFilterQty'>Area(Ft2)</th><th class='bleedFilterSize'>Volume(Ft3)</th><th class='freshFilterType'>ACPH (NLT)</th><th class='freshAirCFM'>Test Ref</th><th class='freshFilterQty'>ISO Clause</th><th class='freshFilterSize'>Occupancy State</th><th class='ahuHEPAFilterQty'>Room Supply Airflow (cfm)</th><th class='hepaFilterEfficiency'>AHU Flow (cfm)</th><th class='hepaParticleSize'>Room Pressure (Pa)</th><th class='hepaFilterSpecification'>Fresh Air (cfm) </th><th class='exhaustAirCFM'>Exhaust Air (cfm)</th><th class='bleedFilterType'>Temp (°C)</th><th class='bleedFilterEfficiency'>RH%</th><th class='bleedAirCFM'>Return Air (cfm)</th><th class='bleedFilterQty'>Supply Air Grill Qty (Nos)</th><th class='bleedFilterSize'>Return Air Grill Qty (Nos)</th><th class='freshFilterType'>Supply Air Filter Qty (Nos)</th><th class='freshAirCFM'>Return Air Filter Qty (Nos)</th><th class='freshFilterQty'>Remarks</th><th class='createdDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#room").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}
//rowData.userRole.userType
	function drawRow(rowData) {
		var row = $("<tr class='user_"+rowData.id+"'/>")
		$("#room").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='id_"+rowData.id+"'>" + rowData.roomId + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>" + rowData.ahu.ahuType
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.areaId.areaName
				+ "</td>"));

		
		row.append($("<td class='type_"+rowData.id+"'>" + rowData.roomName
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.roomNo
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.width
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.height
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.length
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.area
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.volume + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.acphNLT + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.testRef + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.isoClause + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.occupancyState + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.roomSupplyAirflowCFM + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.ahuFlowCFM + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.roomPressurePA + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.freshAirCFM + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.bleedAirCFM
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.exhaustAirCFM + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.temperature + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.rh + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.returnAirCFM + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.supplyAirGrillQTY + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.returnAirGrillQTY + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.supplyAirFilterQTY + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.returnAirFilterQTY + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.remarks + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.creationDate + "</td>"));

		row.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
						+ rowData.roomId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.roomId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.roomId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.roomId
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
		var urlMapping = urlPerfix + '/room' + "/" + 'create';
		var rooms = {};
		var ahus = {};
		var areas = {};

		var ahuNo = $('#ahuNo').find(":selected").val();
		var areaName = $('#areaName').find(":selected").val();
		var roomName = $('#roomName').val();
		
		var roomNo = $('#roomNo').val();
		var width = $('#width').val();
		var height = $('#height').val();
		
		var length = $('#length').val();
		var area = $('#area').val();
		var volume = $('#volume').val();
		
		var acphNLT = $('#acphNLT').val();
		var testRef = $('#testRef').val();
		var isoClause = $('#isoClause').val();
		
		var occupancyState = $('#occupancyState').val();
		var roomSupplyAirflowCFM = $('#roomSupplyAirflowCFM').val();
		var ahuFlowCFM = $('#ahuFlowCFM').val();
		
		var roomPressurePA = $('#roomPressurePA').val();
		var freshAirCFM = $('#freshAirCFM').val();
		
		var bleedAirCFM = $('#bleedAirCFM').val();
		
		var exhaustAirCFM = $('#exhaustAirCFM').val();
		var temperature = $('#temperature').val();
		var rh = $('#rh').val();
		
		var returnAirCFM = $('#returnAirCFM').val();
		
		var supplyAirGrillQTY = $('#supplyAirGrillQTY').val();
		
		var returnAirGrillQTY = $('#returnAirGrillQTY').val();
		
		var supplyAirFilterQTY = $('#supplyAirFilterQTY').val();
		
		var returnAirFilterQTY = $('#returnAirFilterQTY').val();
		var remarks = $('#remarks').val();
		
		//alert("New Values : "+ahuNo+"  : "+areaName +"  : "+roomName +"  : "+roomNo);		
		
		
		ahus["ahuId"]=ahuNo;
		areas["areaId"]=areaName
		
		rooms["ahu"] = ahus;
		rooms["areaId"] = areas;
		rooms["roomName"] = roomName;
		rooms["roomNo"] = roomNo;
		rooms["width"] = width;
		rooms["height"] = height;
		rooms["length"] = length;
		rooms["area"] = area;
		rooms["volume"] = volume;
		rooms["isoClause"] = isoClause;
		rooms["testRef"] = testRef;
		rooms["acphNLT"] = acphNLT;
		
		rooms["occupancyState"] = occupancyState;
		rooms["roomSupplyAirflowCFM"] = roomSupplyAirflowCFM;
		rooms["ahuFlowCFM"] = ahuFlowCFM;
		rooms["roomPressurePA"] = roomPressurePA;
		rooms["freshAirCFM"] = freshAirCFM;
		rooms["bleedAirCFM"] = bleedAirCFM;
		rooms["exhaustAirCFM"] = exhaustAirCFM;
		rooms["temperature"] = temperature;
		rooms["rh"] = rh;
		rooms["returnAirCFM"] = returnAirCFM;
		rooms["supplyAirGrillQTY"] = supplyAirGrillQTY;
		rooms["returnAirGrillQTY"] = returnAirGrillQTY;
		rooms["supplyAirFilterQTY"] = supplyAirFilterQTY;
		rooms["returnAirFilterQTY"] = returnAirFilterQTY;
		rooms["remarks"] = remarks;

		callAjaxPostJSON(urlMapping, "POST", "", rooms);
		
	}

	function updateMe(elem) {

		//	var elemSelected = $(elem).attr('id');
		//	alert("updatekMe id : " + elemSelected);
		//	var rowNum = elemSelected.split('_')[1];
		//	var id = elemSelected.split('_')[2];
		//	var gname = elemSelected.split('_')[3];
		//	var rpmMapId = elemSelected.split('_')[4];

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/room' + "/" + 'update';
		var users = {};

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
		callAjaxPostJSON(urlMapping, "POST", "", users);

	}

	function deleteMe(elem) {
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/room' + "/" + 'delete';
		var rooms = {};
		rooms["roomId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", rooms);
}
</script>