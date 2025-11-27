// let btn=document.querySelector('a');
// let imgs=document.querySelectorAll('img');
// let cards=document.querySelectorAll('.card')

// for (let i = 0; i < cards.length; i++) {
//     const card = cards[i];
//     card.addEventListener('click',function(event) {
           
//     if (event.target.tagName=='A') {
        
//         imgs[i].src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'
//     }
//     })
// }



// let row=document.querySelector('.row')


// // let count=0;
//     row.addEventListener('click',function(event) {
//         // console.log(count++);
        
           
//     if (event.target.tagName=='A'&& event.target.innerText=='Change') {
        
//     //    event.target.parentElement.parentElement.firstElementChild.src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'
//     //    event.target.parentElement.parentElement.children[0].src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'
//        event.target.parentElement.previousElementSibling.src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'

//     }
//     })


// //parentElement           - родитель
// //children                - ребенок
// //lastElementChild        - последний элемент
// //firstElementChild       - первый элемент
// //previousElementSibling  - сосед родителя выше
// //nextElementSibling      - сосед родителя ниже






// let btn=document.querySelector('button');
// let input=document.querySelector('input');
// let list=document.querySelector('.list')




// btn.addEventListener('click',function() {
//     let text=input.value;

//     // list.insertAdjacentHTML('afterbegin',`<li class="list-group-item">${text}</li>`)
//     // list.insertAdjacentHTML('afterend',`<li class="list-group-item">${text}</li>`)
//     list.insertAdjacentHTML('beforeend',`<li class="list-group-item">${text}</li>`)
//     input.value='';
// })







// btn.addEventListener('click',function(event) {
//     let text=input.value;
//     console.log(text);
//     input.value='';
//     list.innerHTML+=`<li class='item'>${text}</li>`
// })



// btn.addEventListener('click',function(event) {
//     let text=input.value;
    
//     let li=document.createElement('li');
//     li.innerText=text;
//     // li.className='item';

// li.classList.add('item');
// li.classList.add('item1');

//     // list.append(li);// внутри листа в конец
// // list.prepend(li);// внутри листа в начало
// // list.after(li);// после листа в конец
// list.before(li);// до листа в в начало
//     // list.appendChild(li);

    
//     input.value='';
// })

// let btn=document.querySelector('A');
// let imgs=document.querySelectorAll('img');
// // let cards=document.querySelectorAll('.card')
// let row=document.querySelector('.row');

// row.addEventListener('click',function(event) {
//     if(event.target.tagName=='A'&& event.target.classList.contains('btn-primary')){
//         //event.target.innerText=='Change'

// event.target.parentElement.parentElement.firstElementChild.src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'
//     }
// })


// for (let i = 0; i < cards.length; i++) {
//     cards[i].addEventListener('click',function (event) {
    
//         if(event.target.tagName=='A'){
    
//             imgs[i].src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'
//         }
     
    
//     })

    
// }



// let row=document.querySelector('.row');

// row.addEventListener('click',function(event){
//     if (event.target.classList.contains('btn-info')) {
//         event.target.parentElement.parentElement.firstElementChild.src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0x02fUB-0Sgi9anyWpmR0vMc-bsMwEtM1vA&s'
        
//     }
// })




let btn=document.querySelector('button');
let input=document.querySelector('input');
let list=document.querySelector('.list')

btn.addEventListener('click',function () {


    let text=input.value;
// list.insertAdjacentHTML('afterend',`<li class='item'>${text}</li>`)


    console.log(text);
    // list.innerHTML+=`<li class='item'>${text}</li>`;


    // let li=document.createElement('li');
    // li.innerText=text;
    // li.className='item';
    // list.append(li);
    // list.prepend(li);
    // list.after(li);
    // list.before(li);
    // list.appendChild(li);
    input.value='';
})