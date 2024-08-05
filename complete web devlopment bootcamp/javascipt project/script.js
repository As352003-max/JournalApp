
const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '2b1b1d966emsh844acf3b99902b6p1ccc1ejsn923f5452ee62',
		'X-RapidAPI-Host': 'weather-by-api-ninjas.p.rapidapi.com'
	 }
	 };
	 
	 fetch{'https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=Seattle',options}
	 
	   .then{
		response=>response.json()
	   }
	   .then{
		response=>console.log(response)
	   }
	 catch (error) {
	console.error(error);
}