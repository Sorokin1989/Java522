
 let currentPage = 1;
 let totalPages = 1;
 let currentSearchTitle = '';
 let currentSearchType = '';
 let totalResults = 0;

 async function search(title, type = '', page = 1) {
     try {

if(!title || title.trim()===''){
    console.error('Пустой запрос!');
    return {Search: [],totalResults: '0'}
}

         const codedTitle = encodeURIComponent(title);

         let url = `https://www.omdbapi.com/?s=${codedTitle}&apikey=12b53682&page=${page}`;

         if (type) {
             url += `&type=${type}`
         }

         let data = await fetch(url);
         let response = await data.json();
         console.log(response);

         return response;
     } catch (error) {
         console.error('Ошибка поиска',error);
         return {
             Search: [],
             totalResults: "0"
         };

     }
 }



 async function searchDetail(id) {
     try {
         let data = await fetch(`https://www.omdbapi.com/?i=${id}&apikey=12b53682`);
         let response = await data.json();
         return response;

     } catch (error) {
         console.log('Ошибка поиска searchDetail', error);
         return null;
     }

 }

 function createPagination(currentPage, totalPages) {

if(totalPages<=1){
    pagination.innerHTML='';
    return;
}

     let paginationHTML = '';
     if (currentPage === 1) {
         paginationHTML += `<li class="page-item disabled"><a class="page-link" href="#">Previous</a></li>`;
     } else {
         paginationHTML += `<li class="page-item"><a class="page-link" href="#" data-page="${currentPage - 1}">Previous</a></li>`;
     }
let startPage=Math.max(1,currentPage-2);
let endPage=Math.min(totalPages,currentPage+2);

if(startPage>1) {
    paginationHTML+=`<li class="page-item"><a class="page-link" href="#" data-page="1">1</a></li>`;
}
if (startPage>2) {
    paginationHTML+=`<li class="page-item disabled"><a class="page-link" href="#">...</a></li>`;
}

     for (let i = startPage; i <= endPage; i++) {
         if (i === currentPage) {
             paginationHTML += `<li class="page-item active"><a class="page-link" href="#" aria-current="page">${i}</a></li>`;
         } else {
             paginationHTML += `<li class="page-item"><a class="page-link" href="#" data-page="${i}">${i}</a></li>`;
         }

     }

if(endPage<totalPages){
    if(endPage<totalPages-1){
        paginationHTML+=`<li class="page-item disabled"><a class="page-link" href="#">...</a></li>`;
    }else{
        paginationHTML+=`<li class="page-item"><a class="page-link" href="#" data-page="${totalPages}">${totalPages}</a></li>`;
    }
}


     if (currentPage === totalPages) {
         paginationHTML += `<li class="page-item disabled"><a class="page-link" href="#">Next</a></li>`;
     } else {
         paginationHTML += `<li class="page-item"><a class="page-link" href="#" data-page="${currentPage + 1}">Next</a></li>`;
     }
     pagination.innerHTML = `
        <nav aria-label="Page navigation">
            <ul class="pagination justify-content-center">
                ${paginationHTML}
            </ul>
        </nav>
    `;

 }


 let allCards = document.querySelector('.allCards');
 let searchForm = document.forms.searchForm;
 let searchBtn = document.querySelector('#button-addon2');
 let detailsBtn = document.querySelector('.detailsBtn');
 let detalies = document.querySelector('.detalies');
 let pagination = document.querySelector('.pagination-text');
 //  pagenation.style.display = 'none';
 let container = document.querySelector('.container-fluid');
 container.style.display = 'block';
 let buttonClose = document.querySelector('.buttonClose');
 let message = document.querySelector('.message-text');
 //  let pagenationText=document.querySelector('.pagenation-text');




 searchBtn.addEventListener('click', async function () {
     let title = searchForm.movieName.value;
     let selectElement = document.querySelector('.form-select');
     let type = selectElement.value;
     //  console.log(type);


     if (title.trim()) {
         console.log(title);

         try {
             allCards.innerHTML = '';
             let data = await search(title, type);
             console.log(data);

             currentSearchTitle = title;
             currentSearchType = type;



if(data.Error){
    message.innerHTML=`Ошибка: ${data.Error}`;
       setTimeout(() => {
             message.innerHTML = '';
         }, 5000);
    pagination.innerHTML='';
}

             else if (!data.Search || data.Search.length === 0) {
                 message.innerHTML = 'Movie not found!';
                 setTimeout(() => {
                     message.innerHTML = '';
                 }, 5000);
                 allCards.innerHTML = '';
                 pagination.innerHTML = '';

             } else {
                 message.innerHTML = `Найдено фильмов: ${data.totalResults}`;
             }



             for (const movie of data.Search) {


                 allCards.innerHTML += `
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

                 // pagination.innerHTML=` <nav aria-label="Page navigation">
                 //             <ul class="pagination">
                 //                 <li class="page-item disabled"><a href="#" class="page-link">Previous</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">1</a></li>
                 //                 <li class="page-item">
                 //                     <a class="page-link" href="#" aria-current="page">2</a>
                 //                 </li>
                 //                 <li class="page-item"><a class="page-link" href="#">3</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">4</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">5</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">6</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">7</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">8</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">9</a></li>
                 //                 <li class="page-item"><a class="page-link" href="#">10</a></li>
                 //                 <li class="page-item disabled"><a class="page-link" href="#">Next</a></li>
                 //             </ul>
                 //         </nav>`







             }

             totalResults = parseInt(data.totalResults) || 0;
             totalPages = Math.ceil(totalResults / 10);
             createPagination(1, totalPages);

             let id = setTimeout(() => {
                 message.innerHTML = '';
             }, 5000)
             searchForm.movieName.value = '';

         } catch (error) {

             console.error('Search error:', error);

         }









     } else {

         message.innerHTML = 'Введите название фильма для поиска!';
         setTimeout(() => {
             message.innerHTML = '';
         }, 5000);
     }






 })



 document.addEventListener('click', async function (event) {
     if (event.target.classList.contains('detailsBtn')) {
         console.log('кнопка нажата');
         let id = event.target.dataset.imdbid;
         console.log('IMDb ID:', id);

         let datail = await searchDetail(id);



         detalies.innerHTML = `
          
                
                  <div class="cardPoster border border-5 rounded-5 w-75 ">
        
                      <div class="button-text d-flex justify-content-end  ">
                            <button type="button" class="btn btn-primary buttonClose m-3 ">❌</button>
                        </div>
        
                    <div class="d-flex justify-content-center">
                         <h1 class="mt-5">Film info</h1>
                         </div>
                         <hr class=" ms-5 me-5 border-3 border-danger">
        
        
               <div class="d-flex justify-content-center align-items-center ">
             <img src="${datail.Poster}"
                        class="card-img-top  imgPoster " alt="pic">
                        
                    <div class="card-body-poster d-flex justify-content-center">
                       
                        <div class="content-text  mt-5 d-flex flex-column  ">
                           <div class="d-flex  flex-row justify-content-start "> <p class="data-title me-5" style="min-width: 150px;">Title:</p>
                            <p class="info-text">${datail.Title}</p></div>
                           <div class="d-flex flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Released:</p>
                            <p class="info-text">${datail.Released}</p></div>
                            <div class="d-flex flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Genre:</p>
                             <p class="info-text">${datail.Genre}</p></div>
                           <div class="d-flex  flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Country:</p>
                            <p class="info-text">${datail.Country}</p></div>
                           <div class="d-flex  flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Director:</p>
                            <p class="info-text">${datail.Director}</p></div>
                           <div class="d-flex  flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Writer:</p>
                            <p class="info-text">${datail.Writer}</p></div>
                           <div class="d-flex flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Actors:</p>
                            <p class="info-text">${datail.Actors}</p></div>
                           <div class="d-flex  flex-row justify-content-start  mt-5"> <p class="data-title me-5" style="min-width: 150px;">Awards:</p>
                            <p class="info-text">${datail.Awards}</p></div>
                    
                           
                        </div>
                       
                    </div>
        
        
        
               </div>
            </div>`;
         container.style.display = 'none';
     }
 })



 document.addEventListener('click', function (event) {
     if (event.target.classList.contains('buttonClose')) {
         detalies.innerHTML = '';
         container.style.display = 'block'

     }
 })


 document.addEventListener('click', async function (event) {
     if (event.target.classList.contains('page-link') &&
         !event.target.parentElement.classList.contains('disabled')) {

         event.preventDefault();
         const page = parseInt(event.target.dataset.page);
         if (page) {
             console.log('Загрузка страницы:', page);

             try {
                 allCards.innerHTML = '<div class="col-12 text-center"><p>Загрузка...</p></div>';
                 let data = await search(currentSearchTitle, currentSearchType, page);
                 console.log(data);

                 if (!data.Search || data.Search.length === 0) {
                     message.innerHTML = 'Фильмы не найдены!';
                     allCards.innerHTML = '';
                     pagination.innerHTML = '';
                 } else {
                     message.innerHTML = `Найдено фильмов: ${data.totalResults}. Страница ${page}`;
                     

                     allCards.innerHTML = '';
                     for (const movie of data.Search) {
                         allCards.innerHTML += `
                            <div class="card flex-row border-3 ">
                                <img src="${movie.Poster}" class="card-img-top imgCard" alt="...">
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
                            </div>`;
                     }


                     totalResults = parseInt(data.totalResults) || 0;
                     totalPages = Math.ceil(totalResults / 10);
                     createPagination(page, totalPages);
                 }

                 setTimeout(() => {
                     message.innerHTML = '';
                 }, 5000);

             } catch (error) {
                 message.innerHTML = 'Ошибка при загрузке страницы';
                 console.error('Pagination error:', error);
             }
         }
     }
 });