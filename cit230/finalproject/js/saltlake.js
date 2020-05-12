const saltlake = new XMLHttpRequest ();
saltlake.open("GET", "https://api.openweathermap.org/data/2.5/weather?id=5780993&appid=c4f26b47558cfc6a6aebf07554d017ad&units=imperial", true);
saltlake.send();
saltlake.onload = function () {

	let weatherInfo = JSON.parse (saltlake.responseText);
	console.log(weatherInfo);
	document.getElementById("place3").textContent = weatherInfo.name;
	document.getElementById("currentTemp3").textContent = weatherInfo.main.temp;
	document.getElementById("humidity3").textContent = weatherInfo.main.humidity;
	document.getElementById("windSpeed1").textContent = weatherInfo.wind.speed;
	var descriptionp = weatherInfo.weather['0'].description;

	document.getElementById("description3").textContent = descriptionp;
	console.log(descriptionp);

	function doinputoutput() {
    var a = parseFloat(document.getElementById('currentTemp3').textContent);
    var b = parseFloat(document.getElementById('windSpeed3').textContent);
  
    result = (35.74 + (0.6215 * a) - (35.75 * Math.pow(b, 0.16)) + (0.4275 * a * Math.pow(b, 0.16)));
  
    if (result <= 50 && b > 3) {
      document.getElementById('output3').textContent = result.toFixed(0);
    } else {
      document.getElementById('output3').textContent = "NA";
    }
  }
  doinputoutput();
}