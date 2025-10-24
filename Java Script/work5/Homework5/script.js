let countBox=prompt('Welcome my game\nHow many boxes do you want? (min = 3, max = 999)');
countBox=parseInt(countBox);
let time=prompt('How much time do you need? (default 30 min)\n1 - 1 min\n2 - 2 min\n3 - 5 min\n4 - 10min\n5 - 20 min');
time=parseInt(time);

let conteiner=document.querySelector('.conteiner');




let box='';
for (let i = 0; i < countBox; i++) {
    const r=Math.floor(Math.random()*256);
    const g=Math.floor(Math.random()*256);
    const b=Math.floor(Math.random()*256);

  
   box+=`<div class="box" style="background-color:rgb(${r},${g},${b})"> ${i + 1}</div>`;
    
}

 conteiner.innerHTML=box;


