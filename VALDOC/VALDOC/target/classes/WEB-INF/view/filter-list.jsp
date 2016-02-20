<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box-header well" style="border-radius: 0px;">
	<h2>Valdoc / AHU</h2>
</div>
<div style="border-bottom: 1px solid #cbcbcb; margin: 10px; padding-bottom: 10px; padding-top: 10px;"
	class="add-user-container">
	<span><a id="addUser" class="btn btn-info addUserBtn"
		style="padding: 8px; background-color: #337ab7;"> <i
			class="fa fa-user"></i> Add New AHU
	</a> </span>
</div>
<div class="box-content">
	<table id="exampleAhu"
		class="table table-striped table-bordered dt-responsive nowrap"
		width="100%">
	</table>
</div>

<div class="addUser-content hide">
	<div class="form-group" style="padding: 10px;">
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU TYpe</label> <input type="text" class="form-control"
					id="ahuType" value="" title="AHU Type" placeholder="e.g. Recirculation">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Capacity (Air Flow in cfm)</label> <input type="number" class="form-control" placeholder="e.g. 3600"  
					id="capacity" value="" title="Capacity (Air Flow in cfm)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Return Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 3600"
					id="returnAirCFM" value="" title="Return Air cfm">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Exhaust Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 0"
					id="exhaustAirCFM" value="" title="Exhaust Air cfm">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed filter Type</label> <input type="text" class="form-control" placeholder="e.g. HEPA"
					id="bleedFilterType" value="" title="Bleed filter Type">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed filter Efficiency</label> <input type="number" class="form-control" placeholder="e.g. 99.97"
					id="bleedFilterEfficiency" value="" title="Bleed filter Efficiency">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Air Cfm</label> <input type="number" class="form-control" placeholder="e.g. 55"
					id="bleedAirCFM" value="" title="Bleed Air Cfm">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 1"
					id="bleedFilterQty" value="" title="Bleed Filter Qty">
			</div>
			
		</div>
		
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Filter Size</label> <input type="text" class="form-control" placeholder="e.g. 2*2"
					id="bleedFilterSize" value="" title="Bleed Filter Size">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Type</label> <input type="text" class="form-control" placeholder="e.g. Pre Filter"
					id="freshFilterType" value="" title="Fresh Filter Type">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 60"
					id="freshAirCFM" value="" title="Fresh Air cfm">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 1"
					id="freshFilterQty" value="" title="Fresh Filter Qty">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Size</label> <input type="text" class="form-control" placeholder="e.g. 1*2"
					id="freshFilterSize" value="" title="Fresh Filter Size">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU HEPA Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 4"
					id="ahuHEPAFilterQty" value="" title="AHU HEPA Filter Qty">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Filter efficiency</label> <input type="number" class="form-control" placeholder="e.g. 99.97"
					id="hepaFilterEfficiency" value="" title="HEPA Filter efficiency">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Particle size</label> <input type="text" class="form-control" placeholder="e.g. 0.3um"
					id="hepaParticleSize" value="" title="HEPA Particle size">
			</div>
			
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Filter Specification (leak)</label> <input type="number" class="form-control" placeholder="e.g. 0.01"
					id="hepaFilterSpecification" value="" title="HEPA Filter Specification (leak)">
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
					id="editId" value="" title="User Id">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Name</label> <input type="text" class="form-control"
					id="editName" value="" title="User name">
			</div>


			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Type</label> <select class="form-control" id="editTypeId">
					<option value="1">Admin</option>
					<option value="2">User</option>
				</select>
			</div>

		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editUser();">Save</button>
		<div>&nbsp;</div>
	</div>
</div>
<script>
	$(document).ready(function() {

		var urlPerfix = fetchBackendUrl("config");
		urlPerfix = urlPerfix + "/ahu/data";
		$.ajax({
			url : urlPerfix,
			type : "GET",
			crossDomain : true,
			success : function(data) {
				drawTable(data);
				$('#exampleAhu').dataTable({
				// parameters
				});
			},
			error : function(xhr, status, error) {

			}
		});

	});

	function drawTable(data) {
		var thead = "<thead><tr><th class='ahuId'>Id</th><th class='ahuType'>AHU Type</th><th class='capacity'>Capacity (Air Flow in cfm)</th><th class='returnAirCFM'>Return Air cfm</th><th class='exhaustAirCFM'>Exhaust Air cfm</th><th class='bleedFilterType'>Bleed filter Type</th><th class='bleedFilterEfficiency'>Bleed filter Efficiency</th><th class='bleedAirCFM'>Bleed Air Cfm</th><th class='bleedFilterQty'>Bleed Filter Qty</th><th class='bleedFilterSize'>Bleed Filter Size</th><th class='freshFilterType'>Fresh Filter Type</th><th class='freshAirCFM'>Fresh Air cfm</th><th class='freshFilterQty'>Fresh Filter Qty</th><th class='freshFilterSize'>Fresh Filter Size</th><th class='ahuHEPAFilterQty'>AHU HEPA Filter Qty</th><th class='hepaFilterEfficiency'>HEPA Filter efficiency</th><th class='hepaParticleSize'>HEPA Particle size</th><th class='hepaFilterSpecification'>HEPA Filter Specification (leak)</th><th class='op'>Operation</th></tr></thead>";
		$("#exampleAhu").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='user_"+rowData.id+"'/>")
		$("#exampleAhu").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='id_"+rowData.id+"'>" + rowData.ahuId + "</td>"));
		row.append($("<td class='name_"+rowData.id+"' >" + rowData.ahuType
				+ "</td>"));
		row.append($("<td class='type_"+rowData.id+"'>" + rowData.capacity
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.returnAirCFM
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.exhaustAirCFM
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.bleedFilterType
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.bleedFilterEfficiency
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.bleedAirCFM
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>" + rowData.bleedFilterQty
				+ "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.bleedFilterSize + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.freshFilterType + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.freshAirCFM + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.freshFilterQty + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.freshFilterSize + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.ahuHEPAFilterQty + "</td>"));

		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.hepaFilterEfficiency + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.hepaParticleSize + "</td>"));
		
		row.append($("<td class='type_"+rowData.id+"'>"	+ rowData.hepaFilterSpecification + "</td>"));

		row.append($("<td class='tdBtn_"+rowData.id+"'><span><a id='editBtn_"
						+ rowData.ahuId
						+ "'  class='btn btn-info tdBtnEdit_"
						+ rowData.ahuId
						+ "' onClick='updateMe(this);'><i class='fa fa-edit'></i></a></span>&nbsp;&nbsp;<span><a id='delBtn_"
						+ rowData.ahuId
						+ "'  class='btn btn-danger  tdBtnDelete_"
						+ rowData.ahuId
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

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/ahu' + "/" + 'create';
		var ahus = {};

		var ahuType = $('#ahuType').val();
		var capacity = $('#capacity').val();
		var returnAirCFM = $('#returnAirCFM').val();
		
		var exhaustAirCFM = $('#exhaustAirCFM').val();
		var bleedFilterType = $('#bleedFilterType').val();
		var bleedFilterEfficiency = $('#bleedFilterEfficiency').val();
		
		var bleedAirCFM = $('#bleedAirCFM').val();
		var bleedFilterQty = $('#bleedFilterQty').val();
		var bleedFilterSize = $('#bleedFilterSize').val();
		
		var freshFilterType = $('#freshFilterType').val();
		var freshAirCFM = $('#freshAirCFM').val();
		var freshFilterQty = $('#freshFilterQty').val();
		
		var freshFilterSize = $('#freshFilterSize').val();
		var ahuHEPAFilterQty = $('#ahuHEPAFilterQty').val();
		var hepaFilterEfficiency = $('#hepaFilterEfficiency').val();
		
		var hepaParticleSize = $('#hepaParticleSize').val();
		var hepaFilterSpecification = $('#hepaFilterSpecification').val();
		//alert("New Values : "+name+"  : "+email +"  : "+password +"  : "+userRole);		
		
		ahus["ahuType"] = ahuType;
		ahus["capacity"] = capacity;
		ahus["returnAirCFM"] = returnAirCFM;
		ahus["exhaustAirCFM"] = exhaustAirCFM;
		ahus["bleedFilterType"] = bleedFilterType;
		ahus["bleedFilterEfficiency"] = bleedFilterEfficiency;
		ahus["bleedAirCFM"] = bleedAirCFM;
		ahus["bleedFilterQty"] = bleedFilterQty;
		ahus["bleedFilterSize"] = bleedFilterSize;
		ahus["freshFilterType"] = freshFilterType;
		ahus["freshAirCFM"] = freshAirCFM;
		ahus["freshFilterQty"] = freshFilterQty;
		ahus["freshFilterSize"] = freshFilterSize;
		ahus["ahuHEPAFilterQty"] = ahuHEPAFilterQty;
		ahus["hepaFilterEfficiency"] = hepaFilterEfficiency;
		ahus["hepaParticleSize"] = hepaParticleSize;
		ahus["hepaFilterSpecification"] = hepaFilterSpecification;
		
		callAjaxPostJSON(urlMapping, "POST", "", ahus);
	}

	function updateMe(elem) {

		//	var elemSelected = $(elem).attr('id');
		//	alert("updatekMe id : " + elemSelected);
		//	var rowNum = elemSelected.split('_')[1];
		//	var id = elemSelected.split('_')[2];
		//	var gname = elemSelected.split('_')[3];
		//	var rpmMapId = elemSelected.split('_')[4];

		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/ahu' + "/" + 'update';
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
		var urlMapping = urlPerfix + '/ahu' + "/" + 'delete';
		var ahus = {};
		ahus["ahuId"] = parseInt(rowNum);
		callAjaxPostJSON(urlMapping, "POST", "", ahus);
	}
</script>