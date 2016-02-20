<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc/Equipment/Filter</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add New Filter
	</a> </span>
</div>
<div class="box-content">
	<table id="exampleFilter"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter Code</label> <input type="text" class="form-control"
					id="filterCode" value="" title="Filter Code" placeholder="e.g. F1">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control" placeholder="e.g. 10.5 (In Feet)"  
					id="width" value="" title="Width" onChange="calculateArea()">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" placeholder="e.g. 20.25 (In Feet)"
					id="length" value="" title="Length" onChange="calculateArea();">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Grill Area</label> <input type="number" class="form-control" 
					id="grillArea" value="" title="Grill Area" onFocus="calculateArea();">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Effective Grill Area</label> <input type="number" class="form-control" placeholder="e.g. 80.75(In Percentage)"
					id="effectiveGrillArea" value="" title="Effective Grill Area">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>is Supply Filter ?</label> <input type="checkbox" class="form-control"
					id="isSupplyFilter" value="0" title="is Supply Filter">
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
				<label>Filter Id</label> <input type="text" class="form-control"
					id="editFilterId" value="" title="Filter Id" disabled>
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Filter Code</label> <input type="text" class="form-control"
					id="editFilterCode" value="" title="Filter Code" placeholder="e.g. F1">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Width</label> <input type="number" class="form-control" placeholder="e.g. 10.5 (In Feet)"  
					id="editWidth" value="" title="Width" onChange="calculateEditArea()">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Length</label> <input type="number" class="form-control" placeholder="e.g. 20.25 (In Feet)"
					id="editLength" value="" title="Length" onChange="calculateEditArea()">
			</div>

			
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Grill Area</label> <input type="number" class="form-control" 
					id="editGrillArea" value="" title="Grill Area" onFocus="calculateEditArea()">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Effective Grill Area</label> <input type="number" class="form-control" placeholder="e.g. 80.75(In Percentage)"
					id="editEffectiveGrillArea" value="" title="Effective Grill Area">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>is Supply Filter ?</label> <input type="checkbox" class="form-control"
					id="editIsSupplyFilter" value="1" checked title="is Supply Filter">
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
		urlPerfix = urlPerfix + '/equipment' + "/" + 'filter' + "/" + 'data';
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#exampleFilter').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});

	});
	function calculateEditArea(){
	
	var wdth=$('#editWidth').val();
	var lnth= $('#editLength').val();
	if(wdth!=null && lnth!=null){
		var area =parseInt(wdth) * parseInt(lnth);		
		if(area!=NaN){
		$('#editGrillArea').val(area) }
	}
	}
	function calculateArea(){
	
	var wdth=$('#width').val();
	var lnth= $('#length').val();
	if(wdth!=null && lnth!=null){
		var area =parseInt(wdth) * parseInt(lnth);		
		if(area!=NaN){
		$('#grillArea').val(area) }
	}
	}
	

	function drawTable(data) {
		var thead = "<thead><tr><th class='filterId'>Id</th><th class='filterCode'>Filter Code</th><th class='equipmentId'>Equipment Id</th><th class='width'>Width ( ft)</th><th class='length'>Length</th><th class='grillArea'>Grill Area</th><th class='effectiveGrillArea'>Effective Grill Area</th><th class='isSupplyFilter'>Is Supply Filter?</th><th class='creationDate'>Creation Date</th><th class='op'>Operation</th></tr></thead>";
		$("#exampleFilter").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='filter_"+rowData.filterId+"'/>")
		$("#exampleFilter").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it
		row.append($("<td  class='filterId_"+rowData.filterId+"'>" + rowData.filterId + "</td>"));
		row.append($("<td class='filterCode_"+rowData.filterId+"' >" + rowData.filterCode
				+ "</td>"));
		row.append($("<td class='equipmentId_"+rowData.filterId+"'>" + rowData.equipmentId
				+ "</td>"));

		row.append($("<td class='width_"+rowData.filterId+"'>" + rowData.width
				+ "</td>"));

		row.append($("<td class='length_"+rowData.filterId+"'>" + rowData.length
				+ "</td>"));

		row.append($("<td class='grillArea_"+rowData.filterId+"'>" + rowData.grillArea
				+ "</td>"));

		row.append($("<td class='effectiveGrillArea_"+rowData.filterId+"'>" + rowData.effectiveGrillArea
				+ "</td>"));

		if(rowData.isSupplyFilter==true){
			rowData.isSupplyFilter="Yes";
		}
		else{
			rowData.isSupplyFilter="No";
		}
		row.append($("<td class='isSupplyFilter_"+rowData.filterId+"'>" + rowData.isSupplyFilter
				+ "</td>"));
				
		row.append($("<td class='creationDate_"+rowData.filterId+"'>" + rowData.creationDate
				+ "</td>"));

		row.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
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
		var urlMapping = urlPerfix + '/equipment' + "/" + 'filter' + "/" + 'create';
		var filters = {};
		
		var filterCode = $('#filterCode').val();		
		var equipmentId = $('#equipmentId').val();		
		var width = $('#width').val();
		var length = $('#length').val();		
		var grillArea = $('#grillArea').val();
		var effectiveGrillArea = $('#effectiveGrillArea').val();
		
		var isSupplyFilter = $('#isSupplyFilter').is(":checked");
		/*var checkboxValue = parseInt($('#isSupplyFilter').checked);
		alert("checkboxValue="+checkboxValue);
		if(checkboxValue==1){
			 
		}else
		{
			isSupplyFilter = false;
		}*/
		
		
		
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
		if (validate("grillArea", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("effectiveGrillArea", "STRING")) {
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
			errorCount=0;
			filters["filterCode"] = filterCode;	
			filters["equipmentId"] = equipmentId;
			filters["width"] = width;
			filters["length"] = length;
			filters["grillArea"] = grillArea;
			filters["effectiveGrillArea"] = effectiveGrillArea;
			filters["isSupplyFilter"] = isSupplyFilter;
			
			callAjaxPostJSON(urlMapping, "POST", "", filters);
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
		
		var filterId = $('.filterId_' + id).text();
		var filterCode = $('.filterCode_' + id).text();
		var equipmentId = $('.equipmentId_' + id).text();
		var width = $('.width_' + id).text();
		var length = $('.length_' + id).text();
		var grillArea = $('.grillArea_' + id).text();
		var effectiveGrillArea = $('.effectiveGrillArea_' + id).text();		
		var isSupplyFilter =0;
		var checkboxValue= $('.isSupplyFilter_' + id).text();
		if(checkboxValue=="Yes")
			isSupplyFilter=1;
		else
			isSupplyFilter=0;
		
		$('#editFilterId').val(filterId) ;		
		$('#editFilterCode').val(filterCode);		
		$('#editEquipmentId').val(equipmentId);		
		$('#editWidth').val(width);
		$('#editLength').val(length);		
		$('#editGrillArea').val(grillArea);
		$('#editEffectiveGrillArea').val(effectiveGrillArea);
		if(isSupplyFilter==0){
			$('#editIsSupplyFilter').removeAttr('checked');
		}
		else{
			$('.editIsSupplyFilter').prop('checked', true);
		}
		
	}
	
	function cancelEdit() {
		document.getElementById("editIsSupplyFilter").checked = true;
		$('.box-content').removeClass('hide');
		$('.editUser-content').addClass('hide');
		$('.add-user-container').show();
		
	}

	function deleteMe(elem) {
	try{
			var elemSelected = $(elem).attr('id');
			var rowNum = elemSelected.split('_')[1];
			var urlPerfix = fetchBackendUrl("config");
			var urlMapping = urlPerfix + '/equipment' + "/" + 'filter' + "/" + 'delete';
			var filters = {};
			filters["filterId"] = parseInt(rowNum);
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
	function editEquipment(){
	
		errorCount=0;
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/equipment' + "/" + 'filter' + "/" + 'update';
		var filters = {};
		var filterId = $('#editFilterId').val();
		var filterCode = $('#editFilterCode').val();		
		var equipmentId = $('#editEquipmentId').val();		
		var width = $('#editWidth').val();
		var length = $('#editLength').val();		
		var grillArea = $('#editGrillArea').val();
		var effectiveGrillArea = $('#editEffectiveGrillArea').val();
		var isSupplyFilter = $('#editIsSupplyFilter').is(":checked");
		
		if (validate("editFilterCode", "STRING")) {
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
		if (validate("editGrillArea", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editEffectiveGrillArea", "STRING")) {
		} else {
			errorCount++;
		}
		if(errorCount<1){
			try{
			errorCount=0;
			filters["filterId"] = filterId;	
			filters["filterCode"] = filterCode;	
			filters["equipmentId"] = equipmentId;
			filters["width"] = width;
			filters["length"] = length;
			filters["grillArea"] = grillArea;
			filters["effectiveGrillArea"] = effectiveGrillArea;
			filters["isSupplyFilter"] = isSupplyFilter;
			callAjaxPostJSON(urlMapping, "POST", "", filters);
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