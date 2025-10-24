let count = 1;

// function test(){
// count++;
// console.log(count);

// }

// let box=document.querySelector('.box');
// box.onclick=test;

// let box=document.querySelector('.box');

// box.addEventListener('click', test) 

// let box=document.querySelector('.box');
// box.addEventListener('click',function(){
// count++;
// console.log(count);

// })


// let id = setInterval(() => {
//     console.log('Hello ' + count++);

// }, 1000)


// let box = document.querySelector('.box');
// box.addEventListener('click', () => {
//     clearInterval(id)
//     console.log('stop');


// })

// let box = document.querySelector('.box');
// box.addEventListener('click', () => {
    // box.addEventListener('dblclick', () => {
    // box.addEventListener('mousedown', () => {
    // box.addEventListener('mouseup', () => {
    // box.addEventListener('mousemove', () => {
    // box.addEventListener('mouseenter', () => {
    // box.addEventListener('mouseleave', () => {
    // box.addEventListener('mouseleave', () => {
    // console.log('Farid ' + count++);


// })


// let box=document.querySelector('.box');
// box.addEventListener('click',()=>{
//     // console.log('Farid' + count++);
//     box.innerText=count;
//     if (count>=10) {
//         box.style.color='red';
//         box.style.background='black'
//     }
//     count++
    
// })
// let counts=[1,1,1];
// let boxes=document.querySelectorAll('.box');



// for (let i = 0; i < boxes.length; i++) {
//     boxes[i].addEventListener('click',()=>{
//         // console.log('Farid' + count++);
//         boxes[i].innerText=counts[i];
//         if (counts[i]>=10) {
//             boxes[i].style.color='red';
//             boxes[i].style.background='black'
//         }
//     counts[i]++;
// });
    
// }


// let boxes=document.querySelectorAll('.box');



// for (let i = 0; i < boxes.length; i++) {
//     boxes[i].addEventListener('click',()=>{
//         // console.log('Farid' + count++);

//         if ( boxes[i].innerText>=10) {
//             boxes[i].style.color='red';
//             boxes[i].style.background='black'
//         }
//         boxes[i].innerText=  ++boxes[i].innerText;
 
// });
    
// }


// for (let i = 0; i < boxes.length; i++) {
//     boxes[i].addEventListener('click',()=>{
//         // console.log('Farid' + count++);
// let count=parseInt(boxes[i].innerText)
//         if (count>=10) {
//             boxes[i].style.color='red';
//             boxes[i].style.background='black'
//         }
//         boxes[i].innerText=  ++count;
 
// });
    
// }




// for (let i = 0; i < boxes.length; i++) {
//     boxes[i].addEventListener('click', () => {
//         let count = parseInt(boxes[i].innerText); // ← ВНУТРИ
        
//         count++;
//         boxes[i].innerText = count;
//     });
// }


// 

// let conteiner=document.querySelector('.conteiner');



//     conteiner.addEventListener('click',(event)=>{
//        console.log(event.target);
//        console.log(event.currentTarget);
       


//     });
    // conteiner.addEventListener('click',(event)=>{
    //    console.log(event.target.className);

    //    if (event.target.className=='box') {
    //     let count=parseInt(event.target.innerText)
    //     if(count>=10) {
    //         event.target.style.color='red';
    //        event.target.style.backgroundColor='black';
    //     }
    //     event.target.innerText=++count;
    //    }


       

 
// });
    


// let btn=document.querySelector('button');
//  conteiner=document.querySelector('.conteiner');
// btn.addEventListener('click', function() {
//     let boxes=document.querySelectorAll('.box');
//     conteiner.innerHTML += `<div class="box">${boxes.length+1}</div>`
// })


// let a='10';
// let b='10';

// if(a==b&& typeof(a)==typeof(b)) { //a===b 
//     console.log('Yes');
    
// }else{
//     console.log('No');
    
// }




// let conteiner=document.querySelector('.conteiner');



//     conteiner.addEventListener('click',(event)=>{
//        console.log(event.target);
//        console.log(event.currentTarget);
       


// //     });

// let conteiner=document.querySelector('.conteiner');

//     conteiner.addEventListener('click',(event)=>{
//        console.log(event.target.className);

//        if (event.target.className=='box') {
//         let count=parseInt(event.target.innerText)
//         if(count>=10) {
//             event.target.style.color='red';
//            event.target.style.backgroundColor='black';
//         }
//         event.target.innerText=++count;
//        }


       

 
// });
    


// let btn=document.querySelector('button');
// //  conteiner=document.querySelector('.conteiner');
// btn.addEventListener('click', function() {
//     // let boxes=document.querySelectorAll('.box');
//     // conteiner.innerHTML += `<div class="box">${boxes.length+1}</div>`
//     let boxes=document.querySelectorAll('.box');
//     let box=document.createElement('div');
//   box.className='box';
// box.classList.add('box');
//     box.innerText=boxes.length+1;
//     conteiner.append(box);
// })

let conteiner=document.querySelector('.conteiner');
let h1=document.querySelector('h1');
let currentUser=1;
// let ccount=1;

function isWin(value) {
    let boxes=document.querySelectorAll('.box');
return (boxes[0].innerText==value && boxes[1].innerText==value && boxes[2].innerText==value ||
 boxes[3].innerText==value && boxes[4].innerText==value && boxes[5].innerText==value ||
 boxes[6].innerText==value && boxes[7].innerText==value && boxes[8].innerText==value||
 boxes[0].innerText==value && boxes[3].innerText==value && boxes[6].innerText==value||
 boxes[1].innerText==value && boxes[4].innerText==value && boxes[7].innerText==value||
 boxes[2].innerText==value && boxes[5].innerText==value && boxes[8].innerText==value||
 boxes[0].innerText==value && boxes[4].innerText==value && boxes[8].innerText==value||
 boxes[2].innerText==value && boxes[4].innerText==value && boxes[6].innerText==value);  

 }
    

function resetGame() {
        let boxes=document.querySelectorAll('.box');
        for (const box of boxes) {
            box.innerText='';
        }
   let h1=document.querySelector('.win');
   h1.style.display='none';
   h1.innerText='Победа!!!';
   currentUser=1;

   h1=document.querySelector('h1');
   h1.innerText='Позиция занята 0';

}




conteiner.addEventListener('click', function() {
    if(event.target.className=='box') {
        // console.log('da');

      
        if (event.target.innerText=='') {
            // console.log(true);
            event.target.innerText=currentUser==1? 'x' : 'y'
       currentUser=currentUser==1?0:1;
            h1.style.display='none';
            h1.innerText='Позиция занята 0'
     if (isWin(event.target.innerText)) {
        let h1=document.querySelector('.win')
        h1.innerText=h1.innerText+' ' + event.target.innerText;
        h1.style.display='block';
        setTimeout(()=>{

            resetGame();
        },5000)
     }
        }else{
            h1.style.display='block';
            let arr=h1.innerText.split(' ');
            let ccount= parseInt(arr[2]);
           ccount++;
            h1.innerText=arr[0]+ " " + arr[1] + " " + ccount;
        }
        
    }
})