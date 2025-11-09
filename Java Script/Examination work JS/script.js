 
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







let allCards=document.querySelector('.allCards');
 let searchForm=document.forms.searchForm;
 let searchBtn=document.querySelector('#button-addon2');


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
                         <button type="button" class="btn btn-primary w-100 details-text">Details</button>
                     </div>
             </div>
         </div>`
 }







 
}

    searchForm.reset();
})




 