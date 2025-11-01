let myForm=document.forms.toDoForm;
let list=document.querySelector('.list');
let btn=document.querySelector('.clearAll');
let btn2=document.querySelector('.clear');
let container=document.querySelector('.container');
let zoomBtn=document.querySelector('.zoom-text');
let zoomBtn2=document.querySelector('.zoom-text2');
let countIncrease=1;
let countDecrease=1;
let defaultSize=12;
let canDecrease = false;


myForm.addEventListener('submit',function(event) {
    event.preventDefault();
    // console.log('hello');
    let title=myForm.title.value;
    console.log(title);
    // list.insertAdjacentHTML('beforeend',` <li class="list-group-item">${title}</li>`)
// list.innerText+=title;
if(title.trim()){
    let li=document.createElement('li');
li.className='list-group-item item';
li.innerHTML=`<span class="message">${title}</span>` + '<div><i class="check">✔️</i>  <i class="removeBtn">❌</i></div>'
                                    ;
// li.innerText=title;
list.appendChild(li);

}
// myForm.title.value='';
    myForm.reset();    
})








btn.addEventListener('click',function(){
list.innerHTML='';
})

list.addEventListener('click',function(event) {
    if(event.target.classList.contains('removeBtn')){
console.log('remove');
event.target.parentElement.parentElement.remove();
    }

 else if (event.target.classList.contains('check')) {
        if(event.target.parentElement.parentElement.classList.contains('checkBtn')){
               event.target.parentElement.parentElement.classList.remove('checkBtn')
    } else {
        event.target.parentElement.parentElement.classList.add('checkBtn')
}
 }

   else if(event.target.classList.contains('item')) {

 let wasSelected = event.target.classList.contains('item2');
 document.querySelectorAll('.item2').forEach(x=>x.classList.remove('item2'))

 if (!wasSelected) {
        event.target.classList.add('item2');
    }



}

// if (event.target.classList.contains('item')) {
//  document.querySelectorAll('.item2').forEach(x=>x.classList.remove('item2'))
//  event.target.classList.add('item2')
// }

 else if(event.target.classList.contains('message')) {
    // event.target.classList.toggle('message2')
    console.log('hello');
    

    if(event.target.classList.contains('message2')){
        event.target.classList.remove('message2');
    }else{
        event.target.classList.add('message2')
    }
}
    

}


)


//    if (event.target.classList.contains('item')) {
//     document.querySelectorAll('.item2').forEach(x=>x.classList.remove('item2'))
//     event.target.classList.add('item2')
// }





container.addEventListener('click',function(event) {
 
    if(event.target.classList.contains('clear')) {
        // list.querySelector('.item2')
//  console.log('hello');
 const itemWithClass = event.target.parentElement.nextElementSibling.querySelector('.item2');
if (itemWithClass) {
    console.log('hello');
    
   itemWithClass.remove();
    
}

// if(event.target.classList.contains('.zoom-text')){
//     //  event.target.classList.contains('message').
//     console.log('hello');
    
//     increaseText();
// }
}
})


function increaseText() {
    const messages=document.querySelectorAll('.message');

   let shouldIncreaseCounter = false;
 messages.forEach(message=>{
     const currentSize = parseFloat(window.getComputedStyle(message).fontSize);
//   countDecrease=1;

if(Math.abs((currentSize + 2*countIncrease)-defaultSize)<=3){

message.style.fontSize=defaultSize + 'px';
countIncrease=1;
}else{

  message.style.fontSize = (currentSize + 2*countIncrease) + 'px';
    shouldIncreaseCounter = true;

}

    });
      if (shouldIncreaseCounter) {
        countIncrease++;
          canDecrease = true;
    }
}


function decreaseText() {

if(!canDecrease) return;


  const messages = document.querySelectorAll('.message');
  let shouldDecreaseCounter = false;
   messages.forEach(message=>{
     const currentSize = parseFloat(window.getComputedStyle(message).fontSize);


if(Math.abs((currentSize - 2*countDecrease)-defaultSize)<=3){
message.style.fontSize=defaultSize + 'px';
countDecrease=1;
}else{
  message.style.fontSize = Math.max(16,currentSize - 2*countDecrease) + 'px';
  shouldDecreaseCounter=true;
}
        });
      if (shouldDecreaseCounter) {
        countDecrease++;
    }

}





// function resetCounters() {
//     countIncrease=1;
//     countDecrease=1;
// }


zoomBtn.addEventListener('click',function() {
    increaseText();
});



zoomBtn2.addEventListener('click',function() {
    decreaseText();
});
