 async function search(sityName) {
    let data=await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${sityName}&appid=5c72e406f798334b62446086261fbc4f&units=metric`)

    let response= await data.json();
    console.log(response);
    
   return response;

}

//  search('Cheboksary');
let list=document.querySelector('.list');
let searchForm=document.forms.citySearch;
 
searchForm.addEventListener('submit',async function(){
    event.preventDefault();
   let title= searchForm.city.value;
 if(title.trim()){
      console.log(title);
     let data=  await search(title);

list.innerHTML+=`<div class="card" >
  <img src="https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">${data.name} ${Math.round(data.main.temp)} ℃</h5>
    <p class="card-text">${data.weather[0].description}</p>
  </div>`

 } 
 searchForm.reset();
})
