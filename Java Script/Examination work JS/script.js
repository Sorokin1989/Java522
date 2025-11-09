 
 //const title = "Матрица";
// const encodedTitle = encodeURIComponent(title);
// const url = `https://www.omdbapi.com/?s=${encodedTitle}&apiKey=12b53682`;
 
// async function searchMovie(title) {
//     try {
//         const encodedTitle = encodeURIComponent(title);
//         const response = await fetch(`https://www.omdbapi.com/?s=${encodedTitle}&apiKey=12b53682`);
//         const data = await response.json();
//         return data;
//     } catch (error) {
//         console.error('Ошибка:', error);
//     }
// }
 
 
 
 
 async function search(title){
 try{
        const codedTitle = encodeURIComponent(title);
    let data=await fetch(`https://www.omdbapi.com/?s=${codedTitle}&apikey=12b53682`)
    let response= await data.json();
    console.log(response);
    
    return response;
 }catch(error) {
    console.error(error);
    
 }
}



async function searchDetail(id){
try{
     console.log('🔄 Запрашиваем детали для ID:',id);
    let data= await fetch(`https://www.omdbapi.com/?i=${id}&apikey=12b53682`);
let response= await data.json();
return response;

}catch(error){
    console.log('error', error);
    
    return null;
}

}







let allCards=document.querySelector('.allCards');
 let searchForm=document.forms.searchForm;
 let searchBtn=document.querySelector('#button-addon2');
 let detailsBtn=document.querySelector('.detailsBtn');
 let detalies=document.querySelector('.detalies')


searchBtn.addEventListener('click', async function () {
let title=searchForm.movieName.value;

if(title.trim()){
    console.log(title);
 let data= await search(title);
 console.log(data);

 for (const movie of data.Search) {
    
     allCards.innerHTML+=`
             <div class="card flex-row border-3 ">
                 <img src="${movie.Poster}"
                     class="card-img-top imgCard" alt="...">
                 <div class="card-body d-flex flex-column justify-content-between">
                     <div class="content-text">
                         <h5 class="card-title">${movie.Type}</h5>
                         <p class="card-text">${movie.Title}</p>
                         <p class="year-text">${movie.Year}</p>
                     </div>
                     <div class="button-text ">
                         <button type="button" class="btn btn-primary w-100 detailsBtn" data-imdbid="${movie.imdbID}">Details</button>
                     </div>
             </div>
         </div>`
 }
}

    searchForm.reset();
})



 document.addEventListener('click', async function(event){    
    if(event.target.classList.contains('detailsBtn')){  
console.log('кнопка нажата');


  
       let id= event.target.dataset.imdbid;
       console.log('IMDb ID:', id);
        
 let datail= await searchDetail(id);



        detalies.innerHTML=`
          
                
                  <div class="cardPoster border border-5 rounded-5 w-75 ">
        
                      <div class="button-text d-flex justify-content-end  ">
                            <button type="button" class="btn btn-primary buttonClose m-3 ">❌</button>
                        </div>
        
                    <div class="d-flex justify-content-center">
                         <h1 class="mt-5">Film info</h1>
                            <hr>
                    </div>
        
        
               <div class="d-flex justify-content-center align-items-center ">
             <img src="${datail.Poster}"
                        class="card-img-top  imgPoster " alt="pic">
                        
                    <div class="card-body-poster d-flex flex-column justify-content-between">
                       
                        <div class="content-text">
                           <div class="d-flex align-items-center"> <p class="card-title">Title:</p>
                            <span> название</span></div>
                           <div class="d-flex  align-items-center mt-5"> <p class="card-title">Released:</p>
                            <span> название</span></div>
                            <div class="d-flex  align-items-center mt-5"> <p class="card-title">Genre:</p>
                             <span> название</span></div>
                           <div class="d-flex  align-items-center mt-5"> <p class="card-title">Country:</p>
                            <span> название</span></div>
                           <div class="d-flex  align-items-center mt-5"> <p class="card-title">Director:</p>
                            <span> название</span></div>
                           <div class="d-flex  align-items-center mt-5"> <p class="card-title">Writer:</p>
                            <span> название</span></div>
                           <div class="d-flex  align-items-center mt-5"> <p class="card-title">Actors:</p>
                            <span> название</span></div>
                           <div class="d-flex  align-items-center mt-5"> <p class="card-title">Awards:</p>
                            <span> название</span></div>
                    
                           
                        </div>
                       
                    </div>
        
        
        
               </div>
            </div>`;
 
    }
        })









 