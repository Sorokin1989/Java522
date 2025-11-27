let myForm=document.forms.toDoForm;
let list=document.querySelector('.list');
let btn=document.querySelector('.clear')

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
li.innerHTML=`<span>${title}</span>` + '<div><i class="check">✔️</i>  <i class="removeBtn">❌</i></div>'
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

}
)


