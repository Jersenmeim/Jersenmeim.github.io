var d = new Date();
  		var weekday = new Array(7);
  			weekday[1] = "Monday";
  			weekday[2] = "Tuesday";
  			weekday[3] = "Wednesday";	
  			weekday[5] = "friday";	

		var n = weekday[d.getDay()];
		if (n === weekday[1] ) 
		{
		var ad = "Temple closed today"
		document.getElementById("message").innerHTML=ad;
		}