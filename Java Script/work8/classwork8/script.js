let body=document.querySelector('body');
let container=document.querySelector('.container');





container.addEventListener('click',function(){
    if(event.target.tagName=='BUTTON'){
        // console.log(event.target.className); 
        body.style.backgroundColor=event.target.className;
   document.cookie=`theme=${event.target.className}; max-age=10` 
//    document.cookie=`theme=${event.target.className}; expires=2025 23:00` 
    }
})

document.addEventListener('DOMContentLoaded', function() {
let str=document.cookie;
let arr=str.split('=');
let color=arr[1];
console.log(str);
   body.style.backgroundColor=color; 
})