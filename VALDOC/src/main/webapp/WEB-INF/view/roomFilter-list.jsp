<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / Room Filter</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add Room Filter Details
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
				<label>Filter ID</label>  <input type="text" class="form-control" placeholder="e.g. 1"
					id="filterCode" value="" title="Filter Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Name</label> <select class="form-control" id="roomId"></select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter Type</label>  <input type="text" class="form-control" placeholder="e.g. HEPA"
					id="filterType" value="" title="Filter Type">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Efficiency</label>  <input type="number" class="form-control" placeholder="e.g. 99.98"
					id="efficiency" value="" title="Efficiency">
			</div>			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Particle Size</label>  <input type="text" class="form-control" placeholder="e.g. 0.3um"
					id="particleSize" value="" title="Particle Size">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Specification</label>  <input type="number" class="form-control" placeholder="e.g. 0.3"
					id="specification" value="" title="specification">
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
				<label>Effective Gril Area 80% (ft2)</label> <input type="number" class="form-control" placeholder="e.g. area * 80%"
					id="effectiveGrillArea" readonly="readonly" value="" title="Effective Grill Area">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply/Return Filter</label><select class="form-control" id="isSupplyFilter">
					<option value="true">Supply</option>
					<option value="false">Return</option>
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
<!--  For Edit Room Filter --><div class="editUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>ID</label>  <input type="text" class="form-control" disabled="disabled"
					id="editfilterId" value="" title="Filter Id">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter ID</label>  <input type="text" class="form-control" placeholder="e.g. 1"
					id="editfilterCode" value="" title="Filter Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Room Name</label> <select class="form-control" id="editroomId"></select>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter Type</label>  <input type="text" class="form-control" placeholder="e.g. HEPA"
					id="editfilterType" value="" title="Filter Type">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Efficiency</label>  <input type="number" class="form-control" placeholder="e.g. 99.98"
					id="editefficiency" value="" title="Efficiency">
			</div>			
					
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Particle Size</label>  <input type="text" class="form-control" placeholder="e.g. 0.3um"
					id="editparticleSize" value="" title="Particle Size">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Specification</label>  <input type="number" class="form-control" placeholder="e.g. 0.3"
					id="editspecification" value="" title="specification">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control"
					id="editwidth" value="" title="Width" placeholder="e.g. 2" onChange="cal1()">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" onChange="cal1()"
					id="editlength" value="" title="Length" placeholder="e.g. 2">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Area (f2)</label> <input type="text" readonly="readonly" class="form-control" placeholder="e.g. length * width"
					id="editgrillArea" value="" title="Grill Area">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Effective Gril Area 80% (ft2)</label> <input type="number" class="form-control" placeholder="e.g. area * 80%"
					id="editeffectiveGrillArea" readonly="readonly" value="" title="Effective Grill Area">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Supply/Return Filter</label><select class="form-control" id="editisSupplyFilter">
					<option value="true">Supply</option>
					<option value="false">Return</option>
				</select>
			</div>
		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editRoom();">Save</button>
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
	effectiveGrillArea.value=eA;
}

</script>
<script>
var urlPerfix = fetchBackendUrl("config");
urlPerfix = urlPerfix + "/roomFilter/roomData";
var $select1 = $('#editroomId');
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

function cal1(){
	var w=document.getElementById('editwidth').value;
	var l=document.getElementById('editlength').value;
	if(l=="" || l== null){
		l=1;
	}if(w=="" || w== null){
		w=1;
	}
	ar=w*l;
	eA=(ar*80)/100;
	editgrillArea.value=ar;
	editeffectiveGrillArea.value=eA;
}

</script>
    
    
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + "/roomFilter/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#roomFilter').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});
	});
	
	function drawTable(data) {
		var thead = "<thead><tr><th class='returnAirCFM'>Id</th><th class='returnAirCFM'>Filter Id</th><th class='returnAirCFM'>Filter Suply</th><th class='returnAirCFM'>Room Name</th><th class='returnAirCFM'>Filter Type</th><th class='returnAirCFM'>Efficiency</th><th class='returnAirCFM'>Particle Size</th><th class='returnAirCFM'>Specification</th><th class='exhaustAirCFM'>Width(ft)</th><th class='exhaustAirCFM'>Length(ft)</th><th class='bleedFilterType'>Grill Area(Ft2)</th><th class='bleedFilterEfficiency'>Effective Grill Area(Ft2)</th><th class='createdDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#roomFilter").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}
	
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

	function drawRow(rowData) {
		var row = $("<tr class='roomFilter_"+rowData.filterId+"'/>")
		$("#roomFilter").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='filterId_"+rowData.filterId+"'>" + rowData.filterId + "</td>"));
		
		row.append($("<td  class='filterCode_"+rowData.filterId+"'>" + rowData.filterCode + "</td>"));
		
		row.append($("<td  class='supplyFilter_"+rowData.filterId+"'>" + rowData.supplyFilter + "</td>"));

		row.append($("<td class='roomName_"+rowData.filterId+"'>" + rowData.room.roomName
				+ "</td>"));
		
		row.append($("<td class='filterType_"+rowData.filterId+"'>" + rowData.filterType
				+ "</td>"));

		row.append($("<td class='efficiency_"+rowData.filterId+"'>" + rowData.efficiency
				+ "</td>"));

		row.append($("<td class='particleSize_"+rowData.filterId+"'>" + rowData.particleSize
				+ "</td>"));

		row.append($("<td class='specification_"+rowData.filterId+"'>" + rowData.specification
				+ "</td>"));
		
		row.append($("<td class='width_"+rowData.filterId+"'>" + rowData.width
				+ "</td>"));

		
		row.append($("<td class='length_"+rowData.filterId+"'>" + rowData.length
				+ "</td>"));

		row.append($("<td class='grillArea_"+rowData.filterId+"'>" + rowData.grillArea
				+ "</td>"));

		row.append($("<td class='effectiveGrillArea_"+rowData.filterId+"'>" + rowData.effectiveGrillArea
				+ "</td>"));

		row.append($("<td class='creationDate_"+rowData.filterId+"'>" + rowData.creationDate
				+ "</td>"));
		row.append($("<td class='tdBtn_"+rowData.filterId+"'><span><a id='editBtn_"
						+ rowData.filterId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.filterId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.filterId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.filterId
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
		var urlMapping = urlPerfix + '/roomFilter' + "/" + 'create';
		var filters = {};
		var rooms = {};

		var roomId = $('#roomId').find(":selected").val();
		var filterCode = $('#filterCode').val();
		
		var width = $('#width').val();
		var length = $('#length').val();
		var effectiveGrillArea = $('#effectiveGrillArea').val();
		var isSupplyFilter = $('#isSupplyFilter').find(":selected").val();
		var filterType=$('#filterType').val();
		var efficiency=$('#efficiency').val();
		var specification=$('#specification').val();
		var particleSize=$('#particleSize').val();
		var grillArea=$('#grillArea').val();
	//	alert("New Values : "+isSupplyFilter );			
		if (validate("roomId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("filterCode", "STRING")) {
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
	if (validate("effectiveGrillArea", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("isSupplyFilter", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("filterType", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("efficiency", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("specification", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("particleSize", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("grillArea", "STRING")) {
	} else {
		errorCount++;
	}
	if(errorCount<1){
		errorCount=0;
		rooms["roomId"]=roomId;
		
		filters["room"] = rooms;
		filters["filterCode"] = filterCode;
		filters["width"] = width;
		filters["length"] = length;
		filters["grillArea"] = grillArea;
		filters["effectiveGrillArea"] = effectiveGrillArea;
		filters["isSupplyFilter"] = isSupplyFilter;
		filters["filterType"] = filterType;
		filters["efficiency"] = efficiency;
		filters["specification"] = specification;
		filters["particleSize"] = particleSize;
		callAjaxPostJSON(urlMapping, "POST", "", filters);
		$.growl({
			title : "Status",
			message : "Successfully Added!"
		});
		setInterval(50000);
		switchTab('roomFilter');
		}
	}
	
	function updateMe(elem) {
		
		$('.add-user-container').hide();
		$('.box-content').addClass('hide');
		$('.editUser-content').removeClass('hide');
		
		
		var elemSelected = $(elem).attr('id');
		var id = elemSelected.split('_')[1];
		
		var filterId = $('.filterId_' + id).text();
		var filterCode = $('.filterCode_' + id).text();
		var roomId = $('.roomId_' + id).text();		
		var width = $('.width_' + id).text();
		var length = $('.length_' + id).text();
		var effectiveGrillArea = $('.effectiveGrillArea_' + id).text();
		var isSupplyFilter = $('.isSupplyFilter_' + id).text();
		var filterType=$('.filterType_' + id).text();
		var efficiency=$('.efficiency_' + id).text();
		var specification=$('.specification_' + id).text();
		var particleSize=$('.particleSize_' + id).text();
		var grillArea=$('.grillArea_' + id).text();
		
		$('#editfilterId').val(filterId);
		$('#editfilterCode').val(filterCode);
		//$('#editroomId').val(roomId);
		$('#editwidth').val(width);
		$('#editlength').val(length);
		$('#editeffectiveGrillArea').val(effectiveGrillArea);
		//$('#editisSupplyFilter').val(isSupplyFilter);
		$('#editfilterType').val(filterType);
		$('#editefficiency').val(efficiency);
		$('#editspecification').val(specification);
		$('#editparticleSize').val(particleSize);
		$('#editgrillArea').val(grillArea);
	}

	function deleteMe(elem) {
		try{
		var elemSelected = $(elem).attr('id');
		var rowNum = elemSelected.split('_')[1];
		
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/roomFilter' + "/" + 'delete';
		var filters = {};
		filters["filterId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", filters);
		$.growl({
			title : "Status",
			message : "Successfully Deleted!"
		});
		setInterval(50000);
		switchTab('roomFilter');
		}catch(err){
			$.growl({
			title : "Status",
			message : "Could not delete!"
		});
			setInterval(50000);
			switchTab('roomFilter');
		}
}
function cancelEdit() {
	$('.box-content').removeClass('hide');
	$('.editUser-content').addClass('hide');
	$('.add-user-container').show();
	
}

function editRoom(){

	errorCount=0;
	var urlPerfix = fetchBackendUrl("config");
	var urlMapping = urlPerfix + '/roomFilter' + "/" + 'update';
	var filters = {};
	var rooms = {};

	var roomId = $('#editroomId').find(":selected").val();
	var filterCode = $('#editfilterCode').val();
	var filterId = $('#editfilterId').val();
	var width = $('#editwidth').val();
	var length = $('#editlength').val();
	var effectiveGrillArea = $('#editeffectiveGrillArea').val();
	var isSupplyFilter = $('#editisSupplyFilter').find(":selected").val();
	var filterType=$('#editfilterType').val();
	var efficiency=$('#editefficiency').val();
	var specification=$('#editspecification').val();
	var particleSize=$('#editparticleSize').val();
	var grillArea=$('#editgrillArea').val();

    if (validate("editroomId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editfilterId", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editfilterCode", "STRING")) {
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
	if (validate("editeffectiveGrillArea", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editisSupplyFilter", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editfilterType", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editefficiency", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editspecification", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editparticleSize", "STRING")) {
	} else {
		errorCount++;
	}
	if (validate("editgrillArea", "STRING")) {
	} else {
		errorCount++;
	}
	if(errorCount<1){
		try{		
		errorCount=0;
		
		rooms["roomId"]=roomId;
		filters["room"] = rooms;
		filters["filterId"] = filterId;
		filters["filterCode"] = filterCode;
		filters["width"] = width;
		filters["length"] = length;
		filters["grillArea"] = grillArea;
		filters["effectiveGrillArea"] = effectiveGrillArea;
		filters["isSupplyFilter"] = isSupplyFilter;
		filters["filterType"] = filterType;
		filters["efficiency"] = efficiency;
		filters["specification"] = specification;
		filters["particleSize"] = particleSize;
		
		callAjaxPostJSON(urlMapping, "POST", "", filters);
		$.growl({
			title : "Status",
			message : "Successfully updated!"
		});
		setInterval(50000);
		switchTab('roomFilter');
		}catch(err)
		{
			$.growl({
			title : "Status",
			message : "Unsuccessful!"
		});
			setInterval(50000);
			switchTab('roomFilter');
		}
	}
}
</script>