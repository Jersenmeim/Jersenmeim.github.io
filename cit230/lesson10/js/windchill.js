function doInputOutput () 
{
var a = parseFloat(document.getElementById('currentTemp').textContent);
var b = parseFloat(document.getElementById('windSpeed').textContent);
var wc = windChill (a,b)

if (a <= 50 && b > 3) {
    document.getElementById('output').textContent = wc;
} else {
    document.getElementById('output').textContent = "N/A";
}

}

function windChill (tempF,speed) 	
{
var a = Math.pow(speed,.16);
return result = (35.74 + (.6215 * tempF) - (35.75* a) + (.4275 * tempF * a)).toFixed(2);


}
