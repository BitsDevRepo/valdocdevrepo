<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / Grill</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add Grill Details
	</a> </span>
</div>
<div class="box-content">
	<table id="grillFilter"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Grill ID</label>  <input type="text" class="form-control" placeholder="e.g. 1"
					id="grillCode" value="" title="Grill Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Name</label> <select class="form-control" id="roomId"></select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control"
					id="width" value="" title="Width" placeholder="e.g. 2" onChange="cal()">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" onChange="cal()"
					id="length" value="" title="Length" placeholder="e.g. 2">
			</div>
						
		</div>
		
				<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area (f2)</label> <input type="text" readonly="readonly" class="form-control" placeholder="e.g. length * width"
					id="grillArea" value="" title="Grill Area">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Effective Gril Area 75% (ft2)</label> <input type="text" class="form-control" placeholder="e.g. area * 75%"
					id="effectiveArea" readonly="readonly" value="" title="Effective Grill Area">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply/Return Grill</label><select type="number" class="form-control" id="isSupplyGrill">
					<option value="true">Supply</option>
					<option value="false">Return</option>
				</select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Additional Details</label><select type="number" class="form-control" id="additionalDetail">
					<option value="true">Yes</option>
					<option value="false">No</option>
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
				<label>Id</label> <input type="text" class="form-control"
					id="editGrillId" value="" title="Id" disabled>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Grill ID</label>  <input type="text" class="form-control" placeholder="e.g. 1"
					id="editGrillCode" value="" title="Grill Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Name</label> <select class="form-control" id="editRoomId"></select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control"
					id="editWidth" value="" title="Width" placeholder="e.g. 2" onChange="cal1()">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" onChange="cal1()"
					id="editLength" value="" title="Length" placeholder="e.g. 2">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area (f2)</label> <input type="text" readonly="readonly" class="form-control" placeholder="e.g. length * width"
					id="editGrillArea" value="" title="Grill Area">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Effective Gril Area 75% (ft2)</label> <input type="text" class="form-control" placeholder="e.g. area * 75%"
					id="editEffectiveArea" readonly="readonly" value="" title="Effective Grill Area">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply/Return Grill</label><select type="number" class="form-control" id="editIsSupplyGrill">
					<option value="true">Supply</option>
					<option value="false">Return</option>
				</select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Additional Details</label><select type="number" class="form-control" id="editAdditionalDetail">
					<option value="true">Yes</option>
					<option value="false">No</option>
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
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/roomFilter/roomData";
var $select = $('#roomId');
$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(roomData) {
$select.html('');
$.each(roomData, function(key, val){
  
  $select.append('<option value="' + val.roomId + '">' + val.roomName + '</option>');
})
},
			error : function(xhr, status, error) {

			}
});

function cal(){
	var w=document.getElementById('width').value;
	var l=document.getElementById('length').value;
	if(l=="" || l== null){
		l=1;
	}if(w=="" || w== null){
		w=1;
	}
	ar=w*l;
	eA=(ar*80)/100;
	grillArea.value=ar;
	effectiveArea.value=eA;
}

function cal1(){
	var w=document.getElementById('editWidth').value;
	var l=document.getElementById('editLength').value;
	if(l=="" || l== null){
		l=1;
	}if(w=="" || w== null){
		w=1;
	}
	ar=w*l;
	eA=(ar*80)/100;
	editGrillArea.value=ar;
	editEffectiveArea.value=eA;
}

</script>
<script>
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/roomFilter/roomData";
var $select1 = $('#editRoomId');
$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(roomData) {
$select1.html('');
$.each(roomData, function(key1, val1){
  
  $select1.append('<option value="' + val1.roomId + '">' + val1.roomName + '</option>');
})
},
			error : function(xhr, status, error) {

			}
});
</script>
    
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + '/roomFilter' + "/" + 'grill' + "/" + 'data';
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#grillFilter').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});
	});
	
	function drawTable(data) {
		var thead = "<thead><tr><th class='grillId'>Id</th><th class='grillCode'>Grill Id</th><th class='roomId'>Room Name</th><th class='width'>Width(ft)</th><th class='length'>Lenth(ft)</th><th class='grillArea'>Grill Area(Ft2)</th><th class='effectiveArea'>Effective Grill Area 75% (Ft2)</th><th class='creationDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#grillFilter").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}
//rowData.userRole.userType
	function drawRow(rowData) {
		var row = $("<tr class='grill_"+rowData.grillId+"'/>")
		$("#grillFilter").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td class='grillId_"+rowData.grillId+"'>" + rowData.grillId + "</td>"));
		
		row.append($("<td class='grillCode_"+rowData.grillId+"'>" + rowData.grillCode + "</td>"));
		
		row.append($("<td class='roomId_"+rowData.grillId+"'>" + rowData.room.roomName
				+ "</td>"));
				
		row.append($("<td class='width_"+rowData.grillId+"'>" + rowData.width
				+ "</td>"));
		
		row.append($("<td class='length_"+rowData.grillId+"'>" + rowData.length
				+ "</td>"));

		row.append($("<td class='grillArea_"+rowData.grillId+"'>" + rowData.grillArea
				+ "</td>"));

		row.append($("<td class='effectiveArea_"+rowData.grillId+"'>" + rowData.effectiveArea
				+ "</td>"));

		row.append($("<td class='creationDate_"+rowData.grillId+"'>" + rowData.creationDate
				+ "</td>"));
		row.append($("<td class='tdBtn_"+rowData.grillId+"'><span><a id='editBtn_"
						+ rowData.grillId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.grillId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.grillId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.grillId
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
		var urlMapping = urlPerfix + '/roomFilter' + "/" + 'grill' + "/" + 'create';
		var rts = {};
		var rooms = {};

		var roomId = $('#roomId').find(":selected").val();
		var grillCode = $('#grillCode').val();
		
		var width = $('#width').val();
		var length = $('#length').val();
		var grillArea = $('#grillArea').val();
		var effectiveArea = $('#effectiveArea').val();
		var isSupplyGrill = $('#isSupplyGrill').find(":selected").val();
		var additionalDetail = $('#additionalDetail').find(":selected").val();
	//	alert("New Values : "+isSupplyGrill+":"+roomId+":"+width+":"+length+":"+grillCode+":"+effectiveArea+":"+additionalDetail );		
		
	if (validate("grillCode", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("width", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("length", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("effectiveArea", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("isSupplyGrill", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("additionalDetail", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("roomId", "STRING")) {
		} else {
			errorCount++;
		}
		if(errorCount<1)
		{
			errorCount=0;
		
			rooms["roomId"]=roomId;
		
			rts["room"] = rooms;
			rts["grillCode"] = grillCode;
			rts["width"] = width;
			rts["length"] = length;
			rts["additionalDetail"] = additionalDetail;
			rts["grillArea"] = grillArea;
			rts["effectiveArea"] = effectiveArea;
			rts["isSupplyGrill"] = isSupplyGrill;
			callAjaxPostJSON(urlMapping, "POST", "", rts);
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
	
	var grillId = $('.grillId_' + id).text();
	var grillCode = $('.grillCode_' + id).text();	
	var width = $('.width_' + id).text();
	var length = $('.length_' + id).text();	
	var grillArea = $('.grillArea_' + id).text();
	var effectiveArea = $('.effectiveArea_' + id).text();
	var roomId = $('.roomId_'+id).text();

	
	
	$('#editGrillId').val(grillId) ;		
	$('#editGrillCode').val(grillCode);	
	$('#editWidth').val(width);
	$('#editLength').val(length);		
	$('#editGrillArea').val(grillArea);
	$('#editEffectiveArea').val(effectiveArea);
	//$('#editRoomId').val(roomId);
	}

	function deleteMe(elem) {
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/roomFilter' + "/" + 'grill' + "/" + 'delete';
		var grills = {};
		grills["grillId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", grills);
}

	function editEquipment(){
	
		errorCount=0;
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/roomFilter' + "/" + 'grill' + "/" + 'update';
		
		var grills = {};
		var rooms = {};

		var roomId = $('#editRoomId').find(":selected").val();
		
		var grillId = $('#editGrillId').val();
		var grillCode = $('#editGrillCode').val();		
		var length = $('#editLength').val();
		var width = $('#editWidth').val();	
		var grillArea = $('#editGrillArea').val();
		var effectiveArea = $('#editEffectiveArea').val();
		var isSupplyGrill = $('#editIsSupplyGrill').val();
		var additionalDetail = $('#editAdditionalDetail').val();
		
		
		if (validate("editGrillId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editGrillCode", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editRoomId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editWidth", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editLength", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editEffectiveArea", "STRING")) {
		} else {
			errorCount++;
		}
		
		if(errorCount<1){
			try{
			errorCount=0;
			grills["grillId"] = grillId;	
			grills["grillCode"] = grillCode;
			
			rooms["roomId"]=roomId;
			grills["room"] = rooms;
			
			grills["width"] = width;
			grills["length"] = length;
			grills["grillArea"] = grillArea;
			grills["effectiveArea"] = effectiveArea;
			grills["isSupplyGrill"] = isSupplyGrill;
			grills["additionalDetail"] = additionalDetail;
			callAjaxPostJSON(urlMapping, "POST", "", grills);
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