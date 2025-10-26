let countBox = prompt('Welcome my game\nHow many boxes do you want? (min = 3, max = 999)');
countBox = parseInt(countBox);

let timeNumber = prompt('How much time do you need? (default 30 min)\n1 - 1 min\n2 - 2 min\n3 - 5 min\n4 - 10min\n5 - 20 min');
timeNumber = parseInt(timeNumber);

 let level=prompt('Выберите уровень сложности(default: medium)\n1 - super Lite\n2 - Lite\n3 - Medium\n4 - Hard\n5 - super Hard');
level=parseInt(level);
let conteiner = document.querySelector('.conteiner');
let  gameActive = true;
let boxes = [];
let speed;
let timer;


function addBox() {
    const DEFAULT_BOX_COUNT = 10;
    let conteiner = document.querySelector('.conteiner');
    if (countBox <= 0 || countBox == null || countBox == '' || countBox == undefined || !countBox) {
        countBox = DEFAULT_BOX_COUNT;
    }



    let box = '';
    for (let i = 0; i < countBox; i++) {
        const r = Math.floor(Math.random() * 256);
        const g = Math.floor(Math.random() * 256);
        const b = Math.floor(Math.random() * 256);
        box += `<div class="box" style="background-color:rgb(${r},${g},${b})"> ${i + 1}</div>`;

    }

    conteiner.innerHTML = box;

}



function driveBox() {

  


   boxes = document.querySelectorAll('.box');
    let conteiner = document.querySelector('.conteiner');


    switch (level) {
        case 1:
            speed=2;
            break;

        case 2:
            speed=5;
            break;
        case 3:
            speed=8;
            break;
        case 4:
            speed=12;
            break;
        case 5:
            speed=17;
            break        
        default:
            speed=8;
            break;
    }
//   console.log('=== driveBox вызван ===');
//     console.log('level:', level);
//     console.log('speed до:', speed);


    boxes.forEach(box => {
        box.style.position = 'absolute';
        const maxX = conteiner.offsetWidth - box.offsetWidth;
        const maxY = conteiner.offsetHeight - box.offsetHeight;

        box.style.left = Math.random() * maxX + 'px';
        box.style.top = Math.random() * maxY + 'px';

        box.vx = (Math.random() - 0.5) * speed;
        box.vy = (Math.random() - 0.5) * speed;
    });

    (function move() {

      if (gameActive) {
           boxes = document.querySelectorAll('.box');
        boxes.forEach(box => {
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
        
      }
        requestAnimationFrame(move);
    })();


    //  console.log('speed после:', speed);
}




function deleteBox() {
    let span = document.querySelector('#message2');
    document.querySelector('.conteiner').addEventListener('click', function (event) {
        if (event.target.className == 'box' && gameActive) {
            event.target.remove()
            let boxes = document.querySelectorAll('.box');
            updateCounterBox();

            if (boxes.length > 0) {
                span.style.display = 'none';
            } else {
                span.style.display = 'block';
                span.innerText = 'Вы победили!';
                span.style.color = 'red';
                span.style.fontWeight = 'bold';
                clearInterval(timer);
                gameActive = false;
            }
        }

    })
}


function updateCounterBox() {
     boxes=document.querySelectorAll('.box');
    let count=document.querySelector('#count');
    if (count) {
        count.textContent=boxes.length
    }
}



function stopTimerOnWin() {
    gameActive = false; // Останавливаем игру
    clearInterval(timer); // Останавливаем таймер
}









function startTimer() {
    let time;
    switch (timeNumber) {
        case 1:
            time = 1;
            break;
        case 2:
            time = 2;
            break;
        case 3:
            time=5;
            break;
        case 4:
            time=10;
            break;
        case 5:
            time=20;
            break;    
                


        default: time=30;
            break;
    }

    let seconds = time * 60;
        gameActive = true;
         timer = setInterval(() => {
            
            if (gameActive) {
                seconds--;
                let min = Math.floor(seconds / 60);
                let sec = seconds % 60;
                document.querySelector('#timer').textContent = `Time: ${ min<10 ? '0': ''}${min}:${sec<10 ? '0' : ''}${sec}`;
                
                if (seconds <= 0) {
                    clearInterval(timer);
                    let message=document.querySelector('#message');
                    message.style.display='block';
                    message.textContent='Вы проиграли!';
                    message.style.fontWeight='bold';
                    gameActive=false;
                    
                }
            }
            
            
        }, 1000)
        
        updateCounterBox();
}









function startGame() {
    addBox();
    startTimer();
    driveBox();
    deleteBox();
}



startGame();
