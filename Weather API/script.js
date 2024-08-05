var tl = gsap.timeline();

function time() {
    var a= 0;
    setInterval(() => {
        a = a+ Math.floor(Math.random()*15)
    if (a<100) {
        
        document.querySelector("#loader h1").innerHTML= a+"%";  
    }
    else{
        a=100;
        document.querySelector("#loader h1").innerHTML= a+"%";  
    }
      
    }, 150);
}

// time()
tl.to("#loader h1", {
  //scale:1.5,
  delay:0.5,
  duration:1,
  onStart:time()
})

tl.to("#loader",{
    top:"-100vh",
    delay:0.5,


})



const options = {
    method: "GET",
    headers: {
      "X-RapidAPI-Key": "a86f1b6bbdmshba2890b1653a623p11d7b8jsn2fecb0c85e27",
      "X-RapidAPI-Host": "weather-by-api-ninjas.p.rapidapi.com",
    },
  };
  const getWeather = (city) => {
    cityName.innerHTML = city;
    fetch(
      "https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=" + city,
      options
    )
      .then((response) => response.json())
      .then((response) => {
        console.log(response);
        //  cloud_pct.innerHTML =response.cloud_pct
        temp.innerHTML = response.temp;
        temp2.innerHTML = response.temp;
        feels_like.innerHTML = response.feels_like;
        humidity.innerHTML = response.humidity;
        humidity2.innerHTML = response.humidity;
        min_temp.innerHTML = response.min_temp;
        max_temp.innerHTML = response.max_temp;
        wind_speed.innerHTML = response.wind_speed;
        wind_speed2.innerHTML = response.wind_speed;
        wind_degrees.innerHTML = response.wind_degrees;
        sunrise.innerHTML = response.sunrise;
        sunset.innerHTML = response.sunset;
      })
      .catch((err) => console.error(err));
  };
  submit.addEventListener("click", (e) => {
    e.preventDefault();
    getWeather(city.value);
  });
  getWeather("Delhi");
  
  function city1() {
    fetch(
      "https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=Shanghai",
      options
    )
      .then((response) => response.json())
      .then((response) => {
        // console.log(response)
        cloud_pct1.innerHTML = response.cloud_pct;
        temp1.innerHTML = response.temp;
        feels_like1.innerHTML = response.feels_like;
        humidity1.innerHTML = response.humidity;
        min_temp1.innerHTML = response.min_temp;
        max_temp1.innerHTML = response.max_temp;
        wind_speed1.innerHTML = response.wind_speed;
        wind_degrees1.innerHTML = response.wind_degrees;
        sunrise1.innerHTML = response.sunrise;
        sunset1.innerHTML = response.sunset;
      })
      .catch((err) => console.error(err));
  }
  city1();

function city2() {
    fetch(
      "https://weather-by-api-ninjas.p.rapidapi.com/v1/weather?city=Boston",
      options
    )
      .then((response) => response.json())
      .then((response) => {
        // console.log(response)
        cloud_pct2.innerHTML = response.cloud_pct;
        temp21.innerHTML = response.temp;
        feels_like2.innerHTML = response.feels_like;
        humidity21.innerHTML = response.humidity;
        min_temp2.innerHTML = response.min_temp;
        max_temp2.innerHTML = response.max_temp;
        wind_speed21.innerHTML = response.wind_speed;
        wind_degrees2.innerHTML = response.wind_degrees;
        sunrise2.innerHTML = response.sunrise;
        sunset2.innerHTML = response.sunset;
      })
      .catch((err) => console.error(err));
  }
  city2();