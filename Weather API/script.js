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



  
//   const userTab=document.querySelector("[data-useWeather]");
// const searchTab=document.querySelector("[data-searchWeather]");
// const userContainer = document.querySelector(".weather-container");

// const grantAccessContainer=document.querySelector(".grant-location-container")
// const searchForm=document.querySelector("[data-searchForm]");
// const loadingScreen=document.querySelector(".loading-container")
// const userInfoContainer=document.querySelector(".user-info-container")


// // initially needed variable

// let currentTab=userTab;
// const API_KEY = "1c54c33952779ec69e08163bb90104f7";
// currentTab.classList.add("current-tab");
// getfromSessionStorage();

// function switchTab(clickedTab) {
//     if(clickedTab!=currentTab){
//         // is code se background colour switch hota hai to the tabs on which we are clicking
//         currentTab.classList.remove("current-tab");
//         currentTab=clickedTab;
//         currentTab.classList.add("current-tab");  

//         if (!searchForm.classList.contains("active")) {
//             userInfoContainer.classList.remove("active");
//             grantAccessContainer.classList.remove("active");
//             searchForm.classList.add("active");

//         }
//         else{
//             // main pehle search vale tab par tha,ab your weather tab visible karna hai
//             searchForm.classList.remove("active");
//             userInfoContainer.classList.remove("active");
//             // ab mai your weather vale tab me aagya hu toh weather bhi display karna padega. so lets check the local storage first 
//             // for coordinates if we have saved them there.
//             getfromSessionStorage();
//         }
//     }
    
// }

// // ye humme ye bata raha hai ki humne iss tab pe click kar diya hai hum ispe switchTab laga ke ye bata rahe ki humne userTab pe click kiya hai switch to it
// userTab.addEventListener("click",()=>{
//     // pass clicked tab as input parameter
//     switchTab(userTab);
// });

// // ye humme ye bata raha hai ki humne iss tab pe click kar diya hai hum ispe switchTab laga ke ye bata rahe ki humne searchTab pe click kiya hai switch to it
// searchTab.addEventListener("click",()=>{
//     // pass clicked tab as input parameter
//     switchTab(searchTab);
// });

// // check if coordinates are already present in session storage
// function getfromSessionStorage(){
//     const localCoordinates= sessionStorage.getItem("user-coordinates");
//     if (!localCoordinates) {
//         // agar local coordinates nahi mile
//         grantAccessContainer.classList.add("active");
//  }
//  else{
//     const coordinates = JSON.parse(localCoordinates);
//     fetchUserWeatherInfo(coordinates);
//  }
// }

//  async function fetchUserWeatherInfo(coordinates) {
//     const{lat,lon}= coordinates;
//     //    make grantAccessContainer invisible
//  grantAccessContainer.classList.remove("active");
// //    make loader visible
// loadingScreen.classList.add("active");

// // API CALL
// try{
//     const response = await fetch(
//         `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}`
//     );
// const data = await response.json();

// loadingScreen.classList.remove("active");
// userInfoContainer.classList.add("active");

// renderWeatherInfo(data);
// // will take the data from json function and display it on UI
// }

// catch(err){
//    loadingScreen.classList.remove("active");
// //    hw what to add next
// }
//  }

// function renderWeatherInfo(weatherInfo) {
//     // firstly we have to fetch the elements
//     const cityName = document.querySelector("[data-cityName]");
//     const countryIcon = document.querySelector("[data-countryIcon]");
//     const desc = document.querySelector("[data-weatherDisc]");
//     const weatherIcon = document.querySelector("[data-weatherIcon]");
//     const temp= document.querySelector("[data-temp]");
//     const windspeed = document.querySelector("[data-windspeed]");
//     const humidity = document.querySelector("[data-humidity]");
//     const cloudiness = document.querySelector("[data-cloudiness]");

// // fetch values from json using weatherInfo and put it in UI elements
// // optional chaining operator - agar hum json object ke andar kisi paticular property ko acces karna chahte hai toh hum kar skte hai with the help of optional chaining operator
// // ? is an optional chaining operator

// cityName.innerText = weatherInfo?.name;
// countryIcon.src=`https://flagcdn.com/144x108/${weatherInfo?.sys?.country.toLowerCase()}.png`;
// desc.innerText = weatherInfo?.weather?.[0]?.description;
// weatherIcon.src=`https://openweathermap.org/img/w/${weatherInfo?.weather?.[0]?.icon}.png`;
// temp.innerText=`${weatherInfo?.main?.temp} °C`;
// windspeed.innerText=`${weatherInfo?.wind?.speed}m/s`;
// humidity.innerText=`${weatherInfo?.main?.humidity}%`;
// cloudiness.innerText= `${weatherInfo?.clouds?.all}%`;
// }


// function getLocation() {
//     if (navigator.geolocation) {
//         navigator.geolocation.getCurrentPosition(showPosition);
//     }
//     else{
        
//         alert("No geolocation Support available");
//     }
// }

// function showPosition(position){

//     const userCoordinates ={
//         lat : position.coords.latitude,
//         lon : position.coords.longitude,
//     }
//     sessionStorage.setItem("user-coordinates",JSON.stringify(userCoordinates));
//     fetchUserWeatherInfo(userCoordinates);
// }

// const grantAccessButton =document.querySelector("[data-grantAccess]");
// grantAccessButton.addEventListener("click",getLocation);

// const searchInput = document.querySelector("[data-searchInput]");

// searchForm.addEventListener("submit",(e) => {
//     e.preventDefault();
//     let cityName=searchInput.value;

//     if (cityName==="") 
//         return;
//         else
//         fetchSearchWeatherInfo(cityName);
    
// })

// async function fetchSearchWeatherInfo(city) {
//     loadingScreen.classList.add("active");
//     userInfoContainer.classList.remove("active");
//     grantAccessContainer.classList.remove("active");

//     try {
//         const response = await fetch(
//             `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}`
//         );
//         const data = await response.json();
//         loadingScreen.classList.remove("active");
//         userInfoContainer.classList.add("active");
//         renderWeatherInfo(data);
//    } 
    
//     catch (error) {
        
//     }
// }

 