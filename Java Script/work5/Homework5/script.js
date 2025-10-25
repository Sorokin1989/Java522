


let countBox=prompt('Welcome my game\nHow many boxes do you want? (min = 3, max = 999)');
countBox=parseInt(countBox);

let time=prompt('How much time do you need? (default 30 min)\n1 - 1 min\n2 - 2 min\n3 - 5 min\n4 - 10min\n5 - 20 min');
time=parseInt(time);

let conteiner=document.querySelector('.conteiner');






function addBox() {
     const DEFAULT_BOX_COUNT=10; 
   let conteiner= document.querySelector('.conteiner');  
if(countBox<=0||countBox==null||countBox==''||countBox==undefined||!countBox) {
    countBox=DEFAULT_BOX_COUNT;
}



let box='';
for (let i = 0; i < countBox; i++) {
    const r=Math.floor(Math.random()*256);
    const g=Math.floor(Math.random()*256);
    const b=Math.floor(Math.random()*256);
   box+=`<div class="box" style="background-color:rgb(${r},${g},${b})"> ${i + 1}</div>`;
    
}

 conteiner.innerHTML=box;

}



function driveBox() {
    let boxes = document.querySelectorAll('.box');
    // let box=document.querySelector('.box');
    let conteiner=document.querySelector('.conteiner');
    // let nav=document.querySelector('.nav');
    //   const navHeight = nav ? nav.offsetHeight : 0;

    
    // const maxY=85;
    // const maxX=92;
    boxes.forEach(box => {
        box.style.position = 'absolute';
        const maxX=conteiner.offsetWidth-box.offsetWidth;
       const maxY=conteiner.offsetHeight-box.offsetHeight;
       
        box.style.left = Math.random() * maxX + 'px';
        // box.style.top = (Math.random() * 85) + navHeight + 'px';
         box.style.top = Math.random() * maxY  + 'px';
        box.vx = (Math.random() - 0.5) * 100;
        box.vy = (Math.random() - 0.5) * 100;
    });
    
    (function move() {
        boxes.forEach(box => {
            // let x = parseFloat(box.style.left) + box.vx;
            // let y = parseFloat(box.style.top) + box.vy;
      let x = parseFloat(box.style.left);
      let y = parseFloat(box.style.top);

            x += box.vx;
            y += box.vy;

       const maxX = conteiner.offsetWidth - box.offsetWidth;
       const maxY = conteiner.offsetHeight - box.offsetHeight;

            x = Math.max(0, Math.min(x, maxX));
            y = Math.max(0, Math.min(y, maxY));
            
            if (x <= 0 || x >= maxX) box.vx = -box.vx;
            if (y <= 0 || y >= maxY) box.vy = -box.vy;
            
            box.style.left = x + 'px';
            box.style.top = y + 'px';
        });
        requestAnimationFrame(move);
    })();
}



function deleteBox() {
       document.querySelectorAll('.box');
document.querySelector('.conteiner').addEventListener('click',function(event){
    if(event.target.className=='box'){
        event.target.remove()
      let boxes=document.querySelectorAll('.box');
        if (boxes.length == 0) {
           console.log('элементов нет');
       }
    }

})   
}


function startGame() {
    // document.querySelector('.conteiner');
   let boxes= document.querySelectorAll('.box');
   
  
      addBox();
        // boxes = document.querySelectorAll('.box');
    
    driveBox();
    deleteBox();
}
// function checkBox() {
//     let boxes = document.querySelectorAll('.box')
//     if (boxes.length == 0) {
//         console.log('элементов нет');
//     } else {
//         console.log('элементов:', boxes.length);
//     }
// }


startGame();
// addBox();
// driveBox();
// deleteBox();
// checkBox();


