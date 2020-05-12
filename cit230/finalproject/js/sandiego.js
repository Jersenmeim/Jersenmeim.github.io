const sandiego = new XMLHttpRequest ();
sandiego.open("GET", "https://api.openweathermap.org/data/2.5/weather?id=5391811&appid=c4f26b47558cfc6a6aebf07554d017ad&units=imperial", true);
sandiego.send();
sandiego.onload = function () {

	let weatherInfo = JSON.parse (sandiego.responseText);
	console.log(weatherInfo);
	document.getElementById("place2").textContent = weatherInfo.name;
	document.getElementById("currentTemp2").textContent = weatherInfo.main.temp;
	document.getElementById("humidity2").textContent = weatherInfo.main.humidity;
	document.getElementById("windSpeed2").textContent = weatherInfo.wind.speed;
	var descriptionp = weatherInfo.weather['0'].description;

	document.getElementById("description2").textContent = descriptionp;
	console.log(descriptionp);

	function doinputoutput() {
    var a = parseFloat(document.getElementById('currentTemp2').textContent);
    var b = parseFloat(document.getElementById('windSpeed2').textContent);
  
    result = (35.74 + (0.6225 * a) - (35.75 * Math.pow(b, 0.26)) + (0.4275 * a * Math.pow(b, 0.26)));
  
    if (result <= 50 && b > 3) {
      document.getElementById('output2').textContent = result.toFixed(0);
    } else {
      document.getElementById('output2').textContent = "NA";
    }
  }
  doinputoutput();
}