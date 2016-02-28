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
				<label>AHU No.</label> <select class="form-control" id="ahuNo">	</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area Name</label> <select class="form-control" id="areaName"></select>
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
				<label>Width</label> <input type="number" class="form-control" placeholder="e.g. 12" onchange="cal()"
					id="width" value="" title="Width">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" placeholder="e.g. 12" onchange="cal()"
					id="length" value="" title="Length">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Height</label> <input type="number" class="form-control" placeholder="e.g. 12" onchange="cal()"
					id="height" value="" title="Height">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area</label> <input type="number" class="form-control" placeholder="e.g. 144" disabled="disabled"
					id="area" value="" title="Area">
			</div>
			
		</div>
		
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Volume</label> <input type="number" class="form-control" placeholder="e.g. 1880" disabled="disabled"
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
<div class="editUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Id</label>
				 <input type="text" class="form-control"
					id="editroomId" value="" disabled="disabled">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU No.</label> <select class="form-control" id="editahuNo">	</select>
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area Name</label> <select class="form-control" id="editareaName"></select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Name</label> <input type="text" class="form-control"
					id="editroomName" value="" title="Room Name" placeholder="e.g. Recirculation">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room No</label> <input type="text" class="form-control" placeholder="Room No 1"
					id="editroomNo" value="" title="Room No">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control" placeholder="e.g. 12" onchange="cal1()"
					id="editwidth" value="" title="Width">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" placeholder="e.g. 12" onchange="cal1()"
					id="editlength" value="" title="Length">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Height</label> <input type="number" class="form-control" placeholder="e.g. 12" onchange="cal1()"
					id="editheight" value="" title="Height">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area</label> <input type="number" disabled="disabled" class="form-control" placeholder="e.g. 144"
					id="editarea" value="" title="Area">
			</div>
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Volume</label> <input type="number" class="form-control" disabled="disabled" placeholder="e.g. 1880"
					id="editvolume" value="" title="Volume">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>ACPH(NLT)</label> <input type="number" class="form-control" placeholder="e.g. 25"
					id="editacphNLT" value="" title="ACPH(NLT)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Test Ref</label> <input type="text" class="form-control" placeholder="e.g. ISO 14644"
					id="edittestRef" value="" title="Test Ref">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>ISO Clause</label> <input type="text" class="form-control" placeholder="e.g. ISO 8"
					id="editisoClause" value="" title="ISO Clause">
			</div>
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>	Occupancy State</label> <input type="text" class="form-control" placeholder="e.g. At Rest"
					id="editoccupancyState" value="" title="	Occupancy State">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Supply Airflow (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 4"
					id="editroomSupplyAirflowCFM" value="" title="Room Supply Airflow (cfm)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU Flow (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 3600"
					id="editahuFlowCFM" value="" title="Ahu Flow (cfm)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Pressure PA</label> <input type="number" class="form-control" placeholder="e.g. 20"
					id="editroomPressurePA" value="" title="Room Pressure PA">
			</div>
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 60"
					id="editfreshAirCFM" value="" title="Fresh Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 60"
					id="editbleedAirCFM" value="" title="Bleed Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Exhaust Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 0"
					id="editexhaustAirCFM" value="" title="Exhaust Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>	Temperature</label> <input type="number" class="form-control" placeholder="e.g. 22"
					id="edittemperature" value="" title="Temperature(C)">
			</div>
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>RH%</label> <input type="number" class="form-control" placeholder="e.g. 55"
					id="editrh" value="" title="RH%">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Return Air (cfm)</label> <input type="number" class="form-control" placeholder="e.g. 560"
					id="editreturnAirCFM" value="" title="Return Air (cfm)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply Air Grill QTY (Nos)</label> <input type="number" class="form-control" placeholder="e.g. 9"
					id="editsupplyAirGrillQTY" value="" title="Supply Air Grill QTY (Nos)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>	Return Air Grill QTY (Nos)</label> <input type="number" class="form-control" placeholder="e.g. 2"
					id="editreturnAirGrillQTY" value="" title="Return Air Grill QTY (Nos)">
			</div>	
		    <div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply Air Filter QTY(Nos)</label> <input type="number" class="form-control" placeholder="e.g. 9"
					id="editsupplyAirFilterQTY" value="" title="Supply Air Filter QTY(Nos)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Return Air Filter QTY(Nos)</label> <input type="number" class="form-control" placeholder="e.g. 2"
					id="editreturnAirFilterQTY" value="" title="Return Air Filter QTY(Nos)">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Remarks</label> <input type="text" class="form-control" placeholder=""
					id="editremarks" value="" title="Remarks">
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
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/room/ahuData";
var $select1 = $('#ahuNo');
$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(ahuData) {
$select1.html('');
$.each(ahuData, function(key1, val1){
  
  $select1.append('<option value="' + val1.ahuId + '">' + val1.ahuNo + '</option>');
})
},
			error : function(xhr, status, error) {

			}
});


function cal(){
	var w=document.getElementById('width').value;
	var l=document.getElementById('length').value;
	var h=document.getElementById('height').value;
	if(l=="" || l== null){
		l=1;
	}if(w=="" || w== null){
		w=1;
	}if(h=="" || h== null){
		h=1;
	}
	ar=w*l;
	eA=ar*h;
	area.value=ar;
	volume.value=eA;
}

function cal1(){
	var w=document.getElementById('editwidth').value;
	var l=document.getElementById('editlength').value;
	var h=document.getElementById('editheight').value;
	if(l=="" || l== null){
		l=1;
	}if(w=="" || w== null){
		w=1;
	}if(h=="" || h== null){
		h=1;
	}
	ar=w*l;
	eA=ar*h;
	editarea.value=ar;
	editvolume.value=eA;
}


</script>
<script>
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/room/ahuData";
var $select2 = $('#editahuNo');
$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(ahuData) {
$select2.html('');
$.each(ahuData, function(key2, val2){
  
  $select2.append('<option value="' + val2.ahuId + '">' + val2.ahuNo + '</option>');
})
},
			error : function(xhr, status, error) {

			}
});

</script>
<script>
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/room/areaData";
var $select = $('#areaName');
$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(areaData) {
$select.html('');
$.each(areaData, function(key, val){
  
  $select.append('<option value="' + val.areaId + '">' + val.areaName + '</option>');
})
},
			error : function(xhr, status, error) {

			}
		});
</script>
<script>
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/room/areaData";
var $select3 = $('#editareaName');
$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(areaData) {
$select3.html('');
$.each(areaData, function(key3, val3){
  
  $select3.append('<option value="' + val3.areaId + '">' + val3.areaName + '</option>');
})
},
			error : function(xhr, status, error) {

			}
		});
</script>
    
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
	
	function switchTab(tabClicked) {
		var container = "box-inner";
		var newurl = "";
		if (tabClicked == "") {
			if (url != "ERROR") {
				newurl = url + "/" + "underconstruction";
			}
		} else {
			if (url != "ERROR") {
				newurl = url + "/" + tabClicked + "/view";
			}
		}
		callAjax(newurl, container, "GET");
	}
	
	function drawTable(data) {
		var thead = "<thead><tr><th class='roomId'>Id</th><th class='ahuNo'>AHU No</th><th class='areaName'>Area</th><th class='roomName'>Room Name</th><th class='roomNo'>Room No</th><th class='width'>Width(Ft)</th><th class='length'>Length(Ft)</th><th class='height'>Height(Ft)</th><th class='area'>Area(Ft2)</th><th class='volume'>Volume(Ft3)</th><th class='freshFilterType'>ACPH (NLT)</th><th class='freshAirCFM'>Test Ref</th><th class='freshFilterQty'>ISO Clause</th><th class='freshFilterSize'>Occupancy State</th><th class='ahuHEPAFilterQty'>Room Supply Airflow (cfm)</th><th class='hepaFilterEfficiency'>AHU Flow (cfm)</th><th class='hepaParticleSize'>Room Pressure (Pa)</th><th class='hepaFilterSpecification'>Fresh Air (cfm) </th><th class='hepaFilterSpecification'>Bleed Air (cfm) </th><th class='exhaustAirCFM'>Exhaust Air (cfm)</th><th class='bleedFilterType'>Temp (°C)</th><th class='bleedFilterEfficiency'>RH%</th><th class='bleedAirCFM'>Return Air (cfm)</th><th class='bleedFilterQty'>Supply Air Grill Qty (Nos)</th><th class='bleedFilterSize'>Return Air Grill Qty (Nos)</th><th class='freshFilterType'>Supply Air Filter Qty (Nos)</th><th class='freshAirCFM'>Return Air Filter Qty (Nos)</th><th class='freshFilterQty'>Remarks</th><th class='createdDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#room").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}
//rowData.userRole.userType
	function drawRow(rowData) {
		var row = $("<tr class='room_"+rowData.roomId+"'/>")
		$("#room").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='roomId_"+rowData.roomId+"'>" + rowData.roomId + "</td>"));
		
		row.append($("<td class='ahuNo_"+rowData.roomId+"'>" + rowData.ahu.ahuNo
				+ "</td>"));

		row.append($("<td class='areaName_"+rowData.roomId+"'>" + rowData.areaId.areaName
				+ "</td>"));

		
		row.append($("<td class='roomName_"+rowData.roomId+"'>" + rowData.roomName
				+ "</td>"));

		row.append($("<td class='roomNo_"+rowData.roomId+"'>" + rowData.roomNo
				+ "</td>"));

		row.append($("<td class='width_"+rowData.roomId+"'>" + rowData.width
				+ "</td>"));

		row.append($("<td class='height_"+rowData.roomId+"'>" + rowData.height
				+ "</td>"));

		row.append($("<td class='length_"+rowData.roomId+"'>" + rowData.length
				+ "</td>"));

		row.append($("<td class='area_"+rowData.roomId+"'>" + rowData.area
				+ "</td>"));

		row.append($("<td class='volume_"+rowData.roomId+"'>"	+ rowData.volume + "</td>"));
		
		row.append($("<td class='acphNLT_"+rowData.roomId+"'>"	+ rowData.acphNLT + "</td>"));
		
		row.append($("<td class='testRef_"+rowData.roomId+"'>"	+ rowData.testRef + "</td>"));

		row.append($("<td class='isoClause_"+rowData.roomId+"'>"	+ rowData.isoClause + "</td>"));
		
		row.append($("<td class='occupancyState_"+rowData.roomId+"'>"	+ rowData.occupancyState + "</td>"));
		
		row.append($("<td class='roomSupplyAirflowCFM_"+rowData.roomId+"'>"	+ rowData.roomSupplyAirflowCFM + "</td>"));

		row.append($("<td class='ahuFlowCFM_"+rowData.roomId+"'>"	+ rowData.ahuFlowCFM + "</td>"));
		
		row.append($("<td class='roomPressurePA_"+rowData.roomId+"'>"	+ rowData.roomPressurePA + "</td>"));
		
		row.append($("<td class='freshAirCFM_"+rowData.roomId+"'>"	+ rowData.freshAirCFM + "</td>"));

		row.append($("<td class='bleedAirCFM_"+rowData.roomId+"'>" + rowData.bleedAirCFM
				+ "</td>"));

		row.append($("<td class='exhaustAirCFM_"+rowData.roomId+"'>"	+ rowData.exhaustAirCFM + "</td>"));
		
		row.append($("<td class='temperature_"+rowData.roomId+"'>"	+ rowData.temperature + "</td>"));
		
		row.append($("<td class='rh_"+rowData.roomId+"'>"	+ rowData.rh + "</td>"));

		row.append($("<td class='returnAirCFM_"+rowData.roomId+"'>"	+ rowData.returnAirCFM + "</td>"));
		
		row.append($("<td class='supplyAirGrillQTY_"+rowData.roomId+"'>"	+ rowData.supplyAirGrillQTY + "</td>"));
		
		row.append($("<td class='returnAirGrillQTY_"+rowData.roomId+"'>"	+ rowData.returnAirGrillQTY + "</td>"));

		row.append($("<td class='supplyAirFilterQTY_"+rowData.roomId+"'>"	+ rowData.supplyAirFilterQTY + "</td>"));
		
		row.append($("<td class='returnAirFilterQTY_"+rowData.roomId+"'>"	+ rowData.returnAirFilterQTY + "</td>"));
		
		row.append($("<td class='remarks_"+rowData.roomId+"'>"	+ rowData.remarks + "</td>"));

		row.append($("<td class='creationDate_"+rowData.roomId+"'>" + rowData.creationDate + "</td>"));

		row.append($("<td class='tdBtn_"+rowData.roomId+"'><span><a id='editBtn_"
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
		var errorCount=0;
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
		if (validate("roomName", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("height", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("length", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("width", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("acphNLT", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("roomNo", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("testRef", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("isoClause", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("occupancyState", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("roomSupplyAirflowCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("ahuFlowCFM", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("roomPressurePA", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("freshAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("bleedAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("exhaustAirCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("temperature", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("rh", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("returnAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("supplyAirGrillQTY", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("returnAirGrillQTY", "STRING")) {
		} else {
			errorCount++;
		}if (validate("supplyAirFilterQTY", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("returnAirFilterQTY", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("remarks", "STRING")) {
		} else {
			errorCount++;
		}
		
	if(errorCount<1)
		{
			errorCount=0;	
		
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
		$.growl({
			title : "Status",
			message : "Successfully Added!"
		});
		setInterval(50000);
		switchTab('room');
	}
		
	}

	function updateMe(elem) {

		
		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.editUser-content').removeClass('hide');
		
		
		var elemSelected = $(elem).attr('id');
		var id = elemSelected.split('_')[1];
		
		var ahuNo = $('.ahuNo_' + id).text();
		var areaName = $('.areaName_' + id).text();
		var roomName = $('.roomName_' + id).text();
		
		var roomId=$('.roomId_' + id).text();
		var roomNo = $('.roomNo_' + id).text();
		var width = $('.width_' + id).text();
		var height = $('.height_' + id).text();
		
		var length = $('.length_' + id).text();
		var area = $('.area_' + id).text();
		var volume = $('.volume_' + id).text();
		
		var acphNLT = $('.acphNLT_' + id).text();
		var testRef = $('.testRef_' + id).text();
		var isoClause = $('.isoClause_' + id).text();
		
		var occupancyState = $('.occupancyState_' + id).text();
		var roomSupplyAirflowCFM = $('.roomSupplyAirflowCFM_' + id).text();
		var ahuFlowCFM = $('.ahuFlowCFM_' + id).text();
		
		var roomPressurePA = $('.roomPressurePA_' + id).text();
		var freshAirCFM = $('.freshAirCFM_' + id).text();
		
		var bleedAirCFM = $('.bleedAirCFM_' + id).text();
		
		var exhaustAirCFM = $('.exhaustAirCFM_' + id).text();
		var temperature = $('.temperature_' + id).text();
		var rh = $('.rh_' + id).text();
		
		var returnAirCFM = $('.returnAirCFM_' + id).text();
		
		var supplyAirGrillQTY = $('.supplyAirGrillQTY_' + id).text();
		
		var returnAirGrillQTY = $('.returnAirGrillQTY_' + id).text();
		
		var supplyAirFilterQTY = $('.supplyAirFilterQTY_' + id).text();
		
		var returnAirFilterQTY = $('.returnAirFilterQTY_' + id).text();
		var remarks = $('.remarks_' + id).text();
		
		$('#editroomName').val(roomName) ;		
		//$('#editTestName').val(testName);	
		
		$('#editroomNo').val(roomNo) ;
		$('#editroomId').val(roomId) ;		
		$('#editheight').val(height);		
		$('#editlength').val(length);		
		$('#editwidth').val(width);
		$('#editarea').val(area);		
		$('#editvolume').val(volume);
		$('#editacphNLT').val(acphNLT);
		$('#edittestRef').val(testRef);
		$('#editisoClause').val(isoClause);
		$('#editoccupancyState').val(occupancyState);
		$('#editroomSupplyAirflowCFM').val(roomSupplyAirflowCFM);
		$('#editahuFlowCFM').val(ahuFlowCFM);
		$('#editroomPressurePA').val(roomPressurePA);
		$('#editfreshAirCFM').val(freshAirCFM);
		$('#editbleedAirCFM').val(bleedAirCFM);
		$('#editexhaustAirCFM').val(exhaustAirCFM);
		$('#edittemperature').val(temperature);
		$('#editrh').val(rh);
		$('#editreturnAirCFM ').val(returnAirCFM );
		$('#editsupplyAirGrillQTY').val(supplyAirGrillQTY);
		$('#editreturnAirGrillQTY').val(returnAirGrillQTY);
		$('#editsupplyAirFilterQTY').val(supplyAirFilterQTY);
		$('#editreturnAirFilterQTY').val(returnAirFilterQTY);
		$('#editremarks').val(remarks);		
	}

	function deleteMe(elem) {
		try{
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/room' + "/" + 'delete';
		var rooms = {};
		rooms["roomId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", rooms);
		$.growl({
			title : "Status",
			message : "Successfully Deleted!"
		});
		setInterval(50000);
		switchTab('room');
}catch(err){
		$.growl({
		title : "Status",
		message : "Could not delete!"
	});

		setInterval(50000);
		switchTab('room');
}
}
	function cancelEdit() {
		$('.box-content').removeClass('hide');
		$('.editUser-content').addClass('hide');
		$('.add-user-container').show();
		
	}

	function editEquipment(){
		errorCount=0;
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/room' + "/" + 'update';
		var rooms = {};
		
		var ahus = {};
		var areas = {};
	    var roomId= $('#editroomId').val();
		var ahuNo = $('#editahuNo').find(":selected").val();
		var areaName = $('#editareaName').find(":selected").val();
		var roomName = $('#editroomName').val();
		
		var roomNo = $('#editroomNo').val();
		var width = $('#editwidth').val();
		var height = $('#editheight').val();
		
		var length = $('#editlength').val();
		var area = $('#editarea').val();
		var volume = $('#editvolume').val();
		
		var acphNLT = $('#editacphNLT').val();
		var testRef = $('#edittestRef').val();
		var isoClause = $('#editisoClause').val();
		
		var occupancyState = $('#editoccupancyState').val();
		var roomSupplyAirflowCFM = $('#editroomSupplyAirflowCFM').val();
		var ahuFlowCFM = $('#editahuFlowCFM').val();
		
		var roomPressurePA = $('#editroomPressurePA').val();
		var freshAirCFM = $('#editfreshAirCFM').val();
		
		var bleedAirCFM = $('#editbleedAirCFM').val();
		
		var exhaustAirCFM = $('#editexhaustAirCFM').val();
		var temperature = $('#edittemperature').val();
		var rh = $('#editrh').val();
		
		var returnAirCFM = $('#editreturnAirCFM').val();
		
		var supplyAirGrillQTY = $('#editsupplyAirGrillQTY').val();
		
		var returnAirGrillQTY = $('#editreturnAirGrillQTY').val();
		
		var supplyAirFilterQTY = $('#editsupplyAirFilterQTY').val();
		
		var returnAirFilterQTY = $('#editreturnAirFilterQTY').val();
		var remarks = $('#editremarks').val();
		
		//alert("New Values : "+ahuNo+"  : "+areaName +"  : "+roomName +"  : "+roomNo);		
		
		if (validate("editroomId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editroomName", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editheight", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editwidth", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editlength", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editroomNo", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editacphNLT", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editroomNo", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("edittestRef", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editisoClause", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editoccupancyState", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editroomSupplyAirflowCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("editahuFlowCFM", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editroomPressurePA", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editfreshAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editbleedAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editexhaustAirCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("edittemperature", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editrh", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editreturnAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editsupplyAirGrillQTY", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editreturnAirGrillQTY", "STRING")) {
		} else {
			errorCount++;
		}if (validate("editsupplyAirFilterQTY", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editreturnAirFilterQTY", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editremarks", "STRING")) {
		} else {
			errorCount++;
		}
		
		if(errorCount<1){
			try{		
			errorCount=0;
			ahus["ahuId"]=ahuNo;
			areas["areaId"]=areaName
			
			rooms["ahu"] = ahus;
			rooms["areaId"] = areas;
			rooms["roomName"] = roomName;
			rooms["roomId"] = roomId;
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
			$.growl({
				title : "Status",
				message : "Successfully updated!"
			});

			setInterval(50000);
			switchTab('room');
			}catch(err)
			{
				$.growl({
				title : "Status",
				message : "Unsuccessful!"
			});

				setInterval(50000);
				switchTab('room');
			}
		}
	}
</script>