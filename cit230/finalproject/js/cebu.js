const cebu = new XMLHttpRequest ();
cebu.open("GET", "https://api.openweathermap.org/data/2.5/weather?id=1717512&appid=c4f26b47558cfc6a6aebf07554d017ad&units=imperial", true);
cebu.send();
cebu.onload = function () {

	let weatherInfo = JSON.parse (cebu.responseText);
	console.log(weatherInfo);
	document.getElementById("place1").textContent = weatherInfo.name;
	document.getElementById("currentTemp1").textContent = weatherInfo.main.temp;
	document.getElementById("humidity1").textContent = weatherInfo.main.humidity;
	document.getElementById("windSpeed1").textContent = weatherInfo.wind.speed;
	var descriptionp = weatherInfo.weather['0'].description;

	document.getElementById("description1").textContent = descriptionp;
	console.log(descriptionp);

	function doinputoutput() {
    var a = parseFloat(document.getElementById('currentTemp1').textContent);
    var b = parseFloat(document.getElementById('windSpeed1').textContent);
  
    result = (35.74 + (0.6215 * a) - (35.75 * Math.pow(b, 0.16)) + (0.4275 * a * Math.pow(b, 0.16)));
  
    if (result <= 50 && b > 3) {
      document.getElementById('output1').textContent = result.toFixed(0);
    } else {
      document.getElementById('output1').textContent = "NA";
    }
  }
  doinputoutput();
}