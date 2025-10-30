let list=document.querySelector('.list');
let input=document.querySelector('input');
let btn=document.querySelector('button');

btn.addEventListener('click',function () {
        let text=input.value;
        if(text.trim()!=''){
            list.insertAdjacentHTML('beforeend',`<div class="text-icon"><li class="message">${text}</li> <i class="removeButton">❌</i></div>`)
        input.value='';

        }
})

list.addEventListener('click',function (event) {
    if(event.target.classList.contains('removeButton')) {
       event.target.parentElement.remove();
    }
    if(event.target.classList.contains('message')) {
event.target.classList.toggle('message2')
    }

})

