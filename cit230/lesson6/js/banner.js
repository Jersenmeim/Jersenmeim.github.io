var d = new Date();
  		var weekday = new Array(7);
  			weekday[2] = "Tuesday";
  			weekday[3] = "Wednesday";	
  			weekday[5] = "friday";	

		var n = weekday[d.getDay()];
		if (n === weekday[5] ) 
		{
		var ad = "Saturday = Preston Pancakes in the Park! | 9:00 a.m. Saturday at the city park pavilion."
		document.getElementById("message").innerHTML=ad;
		}