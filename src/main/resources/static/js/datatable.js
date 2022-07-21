$(document).ready( function () {
	 var table = $('#carsTable').DataTable({
			"sAjaxSource": "/api/cars",
			"sAjaxDataProp": "",
			  "search": {
				     "regex": false,
				     "smart": false
				  },
		    "order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      { "mData": "carName" },
				  { "mData": "milespGallon" },
				  { "mData": "cylinders" },
				  { "mData": "displacement" },
				  { "mData": "horsePwr" },
				  { "mData": "wgtInlbs" },
				  { "mData": "accleration" },
				  { "mData": "year" },
				  { "mData": "origin" },
			]
	 })
});