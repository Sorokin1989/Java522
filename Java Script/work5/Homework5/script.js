let countBox=prompt('Welcome my game\nHow many boxes do you want? (min = 3, max = 999)');
countBox=parseInt(countBox);
let time=prompt('How much time do you need? (default 30 min)\n1 - 1 min\n2 - 2 min\n3 - 5 min\n4 - 10min\n5 - 20 min');
time=parseInt(time);

let conteiner=document.querySelector('.conteiner');



function addBox() {    
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
    let nav=document.querySelector('.nav');
    //   const navHeight = nav ? nav.offsetHeight : 0;
    
    boxes.forEach(box => {
        // box.style.position = 'absolute';
        box.style.left = Math.random() * 92 + '%';
        // box.style.top = (Math.random() * 85) + navHeight + 'px';
         box.style.top = Math.random() * 85  + '%';
        box.vx = (Math.random() - 0.5) * 1;
        box.vy = (Math.random() - 0.5) * 1;
    });
    
    (function move() {
        boxes.forEach(box => {
            let x = parseFloat(box.style.left) + box.vx;
            let y = parseFloat(box.style.top) + box.vy;
            
            if (x < 0 || x > 92) box.vx = -box.vx;
            // if (y < navHeight || y > conteiner.offsetHeight-50) box.vy = -box.vy;
            if (y < 0 || y > 85) box.vy = -box.vy;
            
            box.style.left = x + '%';
            box.style.top = y + '%';
        });
        requestAnimationFrame(move);
    })();
}

addBox();
driveBox();