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
				<label>AHU No</label> <input type="text" class="form-control"
					id="ahuNo" value="" title="AHU No" placeholder="e.g. AHU 01">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU Type</label> <input type="text" class="form-control"
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
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Exhaust Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 0"
					id="exhaustAirCFM" value="" title="Exhaust Air cfm">
			</div>
			
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
		</div>
		
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 1"
					id="bleedFilterQty" value="" title="Bleed Filter Qty">
			</div>
			
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
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 1"
					id="freshFilterQty" value="" title="Fresh Filter Qty">
			</div>
			
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
		</div>
		<div class="col-xs-12 col-sm-12  col-md-12  col-lg-12 ">

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Particle size</label> <input type="text" class="form-control" placeholder="e.g. 0.3um"
					id="hepaParticleSize" value="" title="HEPA Particle size">
			</div>
			
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
					id="editahuId" value="" title="Id" disabled="disabled">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU No</label> <input type="text" class="form-control"
					id="editahuNo" value="" title="AHU No" placeholder="e.g. AHU 01">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU TYpe</label> <input type="text" class="form-control"
					id="editahuType" value="" title="AHU Type" placeholder="e.g. Recirculation">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Capacity (Air Flow in cfm)</label> <input type="number" class="form-control" placeholder="e.g. 3600"  
					id="editcapacity" value="" title="Capacity (Air Flow in cfm)">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Return Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 3600"
					id="editreturnAirCFM" value="" title="Return Air cfm">
			</div>			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Exhaust Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 0"
					id="editexhaustAirCFM" value="" title="Exhaust Air cfm">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed filter Type</label> <input type="text" class="form-control" placeholder="e.g. HEPA"
					id="editbleedFilterType" value="" title="Bleed filter Type">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed filter Efficiency</label> <input type="number" class="form-control" placeholder="e.g. 99.97"
					id="editbleedFilterEfficiency" value="" title="Bleed filter Efficiency">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Air Cfm</label> <input type="number" class="form-control" placeholder="e.g. 55"
					id="editbleedAirCFM" value="" title="Bleed Air Cfm">
			</div>			
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 1"
					id="editbleedFilterQty" value="" title="Bleed Filter Qty">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Bleed Filter Size</label> <input type="text" class="form-control" placeholder="e.g. 2*2"
					id="editbleedFilterSize" value="" title="Bleed Filter Size">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Type</label> <input type="text" class="form-control" placeholder="e.g. Pre Filter"
					id="editfreshFilterType" value="" title="Fresh Filter Type">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Air cfm</label> <input type="number" class="form-control" placeholder="e.g. 60"
					id="editfreshAirCFM" value="" title="Fresh Air cfm">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 1"
					id="editfreshFilterQty" value="" title="Fresh Filter Qty">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>Fresh Filter Size</label> <input type="text" class="form-control" placeholder="e.g. 1*2"
					id="editfreshFilterSize" value="" title="Fresh Filter Size">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>AHU HEPA Filter Qty</label> <input type="number" class="form-control" placeholder="e.g. 4"
					id="editahuHEPAFilterQty" value="" title="AHU HEPA Filter Qty">
			</div>

			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Filter efficiency</label> <input type="number" class="form-control" placeholder="e.g. 99.97"
					id="edithepaFilterEfficiency" value="" title="HEPA Filter efficiency">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Particle size</label> <input type="text" class="form-control" placeholder="e.g. 0.3um"
					id="edithepaParticleSize" value="" title="HEPA Particle size">
			</div>
			
			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 nopadding">
				<label>HEPA Filter Specification (leak)</label> <input type="number" class="form-control" placeholder="e.g. 0.01"
					id="edithepaFilterSpecification" value="" title="HEPA Filter Specification (leak)">
			</div>
		</div>
	</div>
	<div class="col-lg-offset-10 col-xs-offset-2" style="margin-top: 20px;">
		<button type="reset" class="btn btn-primary cancelBtn"
			onClick="cancelEdit();">Cancel</button>
		<button type="submit" class="btn btn-primary editBtn"
			onClick="editAhu();">Save</button>
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
		var thead = "<thead><tr><th class='ahuId'>Id</th><th class='ahuNo'>AHU No</th><th class='ahuType'>AHU Type</th><th class='capacity'>Capacity (Air Flow in cfm)</th><th class='returnAirCFM'>Return Air cfm</th><th class='exhaustAirCFM'>Exhaust Air cfm</th><th class='bleedFilterType'>Bleed filter Type</th><th class='bleedFilterEfficiency'>Bleed filter Efficiency</th><th class='bleedAirCFM'>Bleed Air Cfm</th><th class='bleedFilterQty'>Bleed Filter Qty</th><th class='bleedFilterSize'>Bleed Filter Size</th><th class='freshFilterType'>Fresh Filter Type</th><th class='freshAirCFM'>Fresh Air cfm</th><th class='freshFilterQty'>Fresh Filter Qty</th><th class='freshFilterSize'>Fresh Filter Size</th><th class='ahuHEPAFilterQty'>AHU HEPA Filter Qty</th><th class='hepaFilterEfficiency'>HEPA Filter efficiency</th><th class='hepaParticleSize'>HEPA Particle size</th><th class='hepaFilterSpecification'>HEPA Filter Specification (leak)</th><th class='createdDate'>Created Date</th><th class='op'>Operation</th></tr></thead>";
		$("#exampleAhu").append(thead);
		for (var i = 0; i < data.length; i++) {
			drawRow(data[i]);
		}
	}

	function drawRow(rowData) {
		var row = $("<tr class='ahu_"+rowData.ahuId+"'/>")
		$("#exampleAhu").append(row); //this will append tr element to table... keep its reference for a while since we will add cels into it

		//alert(JSON.stringify(rowData));
		row.append($("<td  class='ahuId_"+rowData.ahuId+"'>" + rowData.ahuId + "</td>"));
		
		row.append($("<td  class='ahuNo_"+rowData.ahuId+"'>" + rowData.ahuNo + "</td>"));
		
		row.append($("<td class='ahuType_"+rowData.ahuId+"' >" + rowData.ahuType
				+ "</td>"));
		row.append($("<td class='capacity_"+rowData.ahuId+"'>" + rowData.capacity
				+ "</td>"));

		row.append($("<td class='returnAirCFM_"+rowData.ahuId+"'>" + rowData.returnAirCFM
				+ "</td>"));

		row.append($("<td class='exhaustAirCFM_"+rowData.ahuId+"'>" + rowData.exhaustAirCFM
				+ "</td>"));

		row.append($("<td class='bleedFilterType_"+rowData.ahuId+"'>" + rowData.bleedFilterType
				+ "</td>"));

		row.append($("<td class='bleedFilterEfficiency_"+rowData.ahuId+"'>" + rowData.bleedFilterEfficiency
				+ "</td>"));

		row.append($("<td class='bleedAirCFM_"+rowData.ahuId+"'>" + rowData.bleedAirCFM
				+ "</td>"));

		row.append($("<td class='bleedFilterQty_"+rowData.ahuId+"'>" + rowData.bleedFilterQty
				+ "</td>"));

		row.append($("<td class='bleedFilterSize_"+rowData.ahuId+"'>"	+ rowData.bleedFilterSize + "</td>"));
		
		row.append($("<td class='freshFilterType_"+rowData.ahuId+"'>"	+ rowData.freshFilterType + "</td>"));
		
		row.append($("<td class='freshAirCFM_"+rowData.ahuId+"'>"	+ rowData.freshAirCFM + "</td>"));

		row.append($("<td class='freshFilterQty_"+rowData.ahuId+"'>"	+ rowData.freshFilterQty + "</td>"));
		
		row.append($("<td class='freshFilterSize_"+rowData.ahuId+"'>"	+ rowData.freshFilterSize + "</td>"));
		
		row.append($("<td class='ahuHEPAFilterQty_"+rowData.ahuId+"'>"	+ rowData.ahuHEPAFilterQty + "</td>"));

		row.append($("<td class='hepaFilterEfficiency_"+rowData.ahuId+"'>"	+ rowData.hepaFilterEfficiency + "</td>"));
		
		row.append($("<td class='hepaParticleSize_"+rowData.ahuId+"'>"	+ rowData.hepaParticleSize + "</td>"));
		
		row.append($("<td class='hepaFilterSpecification_"+rowData.ahuId+"'>"	+ rowData.hepaFilterSpecification + "</td>"));

		row.append($("<td class='creationDate_"+rowData.ahuId+"'>" + rowData.creationDate + "</td>"));

		row.append($("<td class='tdBtn_"+rowData.ahuId+"'><span><a id='editBtn_"
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
		var urlMapping = urlPerfix + '/ahu' + "/" + 'create';
		var ahus = {};

		var ahuNo = $('#ahuNo').val();
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
		
		if (validate("ahuNo", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("ahuType", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("capacity", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("returnAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("exhaustAirCFM", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("bleedFilterType", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("bleedFilterEfficiency", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("bleedAirCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("bleedFilterQty", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("bleedFilterSize", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("freshFilterType", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("freshAirCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("freshFilterQty", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("freshFilterSize", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("ahuHEPAFilterQty", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("hepaFilterEfficiency", "STRING")) {
		} else {
			errorCount++;
		}if (validate("hepaParticleSize", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("hepaFilterSpecification", "STRING")) {
		} else {
			errorCount++;
		}
		
		
	if(errorCount<1)
		{
			errorCount=0;	
				
		ahus["ahuNo"] = ahuNo;
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
	
	var ahuId=$('.ahuId_' + id).text();
	var ahuNo = $('.ahuNo_' + id).text();
	var ahuType = $('.ahuType_' + id).text();
	var capacity = $('.capacity_' + id).text();
	var returnAirCFM = $('.returnAirCFM_' + id).text();
	
	var exhaustAirCFM = $('.exhaustAirCFM_' + id).text();
	var bleedFilterType = $('.bleedFilterType_' + id).text();
	var bleedFilterEfficiency = $('.bleedFilterEfficiency_' + id).text();
	
	var bleedAirCFM = $('.bleedAirCFM_' + id).text();
	var bleedFilterQty = $('.bleedFilterQty_' + id).text();
	var bleedFilterSize = $('.bleedFilterSize_' + id).text();
	
	var freshFilterType = $('.freshFilterType_' + id).text();
	var freshAirCFM = $('.freshAirCFM_' + id).text();
	var freshFilterQty = $('.freshFilterQty_' + id).text();
	
	var freshFilterSize = $('.freshFilterSize_' + id).text();
	var ahuHEPAFilterQty = $('.ahuHEPAFilterQty_' + id).text();
	var hepaFilterEfficiency = $('.hepaFilterEfficiency_' + id).text();
	
	var hepaParticleSize = $('.hepaParticleSize_' + id).text();
	var hepaFilterSpecification = $('.hepaFilterSpecification_' + id).text();
	
	$('#editahuId').val(ahuId);
	$('#editahuNo').val(ahuNo);
	$('#editahuType').val(ahuType);
	$('#editcapacity').val(capacity);
	$('#editreturnAirCFM').val(returnAirCFM);
	$('#editexhaustAirCFM').val(exhaustAirCFM);
	$('#editbleedFilterType').val(bleedFilterType);
	$('#editbleedFilterEfficiency').val(bleedFilterEfficiency);
	$('#editbleedAirCFM').val(bleedAirCFM);
	$('#editbleedFilterQty').val(bleedFilterQty);
	$('#editbleedFilterSize').val(bleedFilterSize);
	$('#editfreshFilterType').val(freshFilterType);
	$('#editfreshAirCFM').val(freshAirCFM);
	$('#editfreshFilterQty').val(freshFilterQty);
	$('#editfreshFilterSize').val(freshFilterSize);
	$('#editahuHEPAFilterQty').val(ahuHEPAFilterQty);
	$('#edithepaFilterEfficiency').val(hepaFilterEfficiency);
	$('#edithepaParticleSize').val(hepaParticleSize);
	$('#edithepaFilterSpecification').val(hepaFilterSpecification);
	
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
			var urlMapping = urlPerfix + '/ahu' + "/" + 'delete';
			var ahus = {};
			ahus["ahuId"] = parseInt(rowNum);
			callAjaxPostJSON(urlMapping, "POST", "", ahus);
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

	function editAhu(){
	
		errorCount=0;
		var urlPerfix = fetchBackendUrl("config");
		var urlMapping = urlPerfix + '/ahu' + "/" + 'update';
		
		var ahus = {};

		var ahuId = $('#editahuId').val();
		var ahuNo = $('#editahuNo').val();
		var ahuType = $('#editahuType').val();
		var capacity = $('#editcapacity').val();
		var returnAirCFM = $('#editreturnAirCFM').val();
		
		var exhaustAirCFM = $('#editexhaustAirCFM').val();
		var bleedFilterType = $('#editbleedFilterType').val();
		var bleedFilterEfficiency = $('#editbleedFilterEfficiency').val();
		
		var bleedAirCFM = $('#editbleedAirCFM').val();
		var bleedFilterQty = $('#editbleedFilterQty').val();
		var bleedFilterSize = $('#editbleedFilterSize').val();
		
		var freshFilterType = $('#editfreshFilterType').val();
		var freshAirCFM = $('#editfreshAirCFM').val();
		var freshFilterQty = $('#editfreshFilterQty').val();
		
		var freshFilterSize = $('#editfreshFilterSize').val();
		var ahuHEPAFilterQty = $('#editahuHEPAFilterQty').val();
		var hepaFilterEfficiency = $('#edithepaFilterEfficiency').val();
		
		var hepaParticleSize = $('#edithepaParticleSize').val();
		var hepaFilterSpecification = $('#edithepaFilterSpecification').val();		
		
		if (validate("editahuId", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editahuType", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editahuNo", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editcapacity", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editreturnAirCFM", "STRING")) {
		} else {
			errorCount++;
		}	
		if (validate("editexhaustAirCFM", "STRING")) {
		} else {
			errorCount++;
		}		
		if (validate("editbleedFilterType", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editbleedFilterEfficiency", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editbleedAirCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("editbleedFilterQty", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editbleedFilterSize", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editfreshFilterType", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("editfreshAirCFM", "STRING")) {
		} else {
			errorCount++;
		}if (validate("editfreshFilterQty", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editfreshFilterSize", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("editahuHEPAFilterQty", "STRING")) {
		} else {
			errorCount++;
		}
		if (validate("edithepaFilterEfficiency", "STRING")) {
		} else {
			errorCount++;
		}if (validate("edithepaParticleSize", "STRING")) {
		} else {
			errorCount++;
		}
		
		if (validate("edithepaFilterSpecification", "STRING")) {
		} else {
			errorCount++;
		}
		
		if(errorCount<1){
			try{
			errorCount=0;
			ahus["ahuId"] = ahuId;	
			ahus["ahuNo"] = ahuNo;
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