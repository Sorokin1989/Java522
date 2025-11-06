let myForm = document.forms.toDoForm;
let list = document.querySelector('.list');
let btn = document.querySelector('.clearAll');
let btn2 = document.querySelector('.clear');
let container = document.querySelector('.container');
let zoomBtn = document.querySelector('.zoom-text');
let zoomBtn2 = document.querySelector('.zoom-text2');
let countIncrease = 1;
let countDecrease = 1;
let defaultSize = 12;
let canDecrease = false;
let message3 = document.querySelector('.message3');
let arr = [];

document.addEventListener('DOMContentLoaded', function () {
    let json = localStorage.getItem('list');
    if (json) {
        let newArr = JSON.parse(json);
        for (const item of newArr) {
            drawItem(item);
        }
    }

    let colors = JSON.parse(localStorage.getItem('savedColors') || '[]');
    let checkElements = document.querySelectorAll('.item');

    checkElements.forEach((element, index) => {
        if (colors[index]) {
            element.style.backgroundColor = colors[index];
            element.classList.add('checkBtn');
        }
    });
});




myForm.addEventListener('submit', function (event) {
    event.preventDefault();
    let text = myForm.title.value;

    if (text.trim()) {
        let item = {
            title: text,
            id: Date.now(),
        }
        drawItem(item);
        localStorage.setItem('list', JSON.stringify(arr))

    }
    myForm.reset();
})

function drawItem(item) {


    let li = document.createElement('li');
    li.dataset.id = item.id;
    li.className = 'list-group-item item';
    li.innerHTML = `<span class="message">${item.title}</span>` + '<div><i class="check">✔️</i>  <i class="removeBtn">❌</i></div>';
    list.appendChild(li);

    arr.push(item);

}


btn.addEventListener('click', function () {
    list.innerHTML = '';
    localStorage.clear();
})

list.addEventListener('click', function (event) {

    if (event.target.classList.contains('removeBtn')) {
        let colors = JSON.parse(localStorage.getItem('savedColors') || '[]');
        let element = event.target.parentElement.parentElement;
        let elements = document.querySelectorAll('.item');
        let index = Array.from(elements).indexOf(element);


        if (index !== -1) {
            colors.splice(index, 1);
            localStorage.setItem('savedColors', JSON.stringify(colors));
        }


        let id = event.target.parentElement.parentElement.dataset.id;
        console.log(id);
        arr = arr.filter(x => x.id != id);
        localStorage.setItem('list', JSON.stringify(arr));




        event.target.parentElement.parentElement.remove();
    } else if (event.target.classList.contains('check')) {
        if (event.target.parentElement.parentElement.classList.contains('checkBtn')) {
            let colors = JSON.parse(localStorage.getItem('savedColors') || '[]');
            let element = event.target.parentElement.parentElement;
            let elements = document.querySelectorAll('.item');
            let index = Array.from(elements).indexOf(element);

            if (index !== -1) {
                colors[index] = '';
                event.target.parentElement.parentElement.classList.remove('checkBtn');
                event.target.parentElement.parentElement.style.backgroundColor = '';
                localStorage.setItem('savedColors', JSON.stringify(colors));
            }


        } else {
            event.target.parentElement.parentElement.classList.add('checkBtn');
            let colors = JSON.parse(localStorage.getItem('savedColors') || '[]');
            let elements = document.querySelectorAll('.item')

            let index = Array.from(elements).indexOf(event.target.parentElement.parentElement);

            if (index !== -1) {
                let temp = document.createElement('div');
                temp.className = 'checkBtn';
                document.body.appendChild(temp);

                colors[index] = getComputedStyle(temp).backgroundColor;
                document.body.removeChild(temp);
                localStorage.setItem('savedColors', JSON.stringify(colors));
            }
        }
    } else if (event.target.classList.contains('item')) {

        let wasSelected = event.target.classList.contains('item2');
        document.querySelectorAll('.item2').forEach(x => x.classList.remove('item2'))

        if (!wasSelected) {
            event.target.classList.add('item2');
            localStorage.setItem('selectedItemId', event.target.dataset.id);
        } else {
            localStorage.removeItem('selectedItemId');
        }



    } else if (event.target.classList.contains('message')) {
        if (event.target.classList.contains('message2')) {
            event.target.classList.remove('message2');
        } else {
            event.target.classList.add('message2')
        }
    }
});





container.addEventListener('click', function (event) {

    if (event.target.classList.contains('clear')) {
        const itemWithClass = event.target.parentElement.nextElementSibling.nextElementSibling.querySelector('.item2');
        if (list.children.length == 0) {
            message3.innerHTML = '<p>Список пуст!</p>';
            setTimeout(() => {
                message3.innerText = '';
            }, 3000)
            return;

        }
        if (itemWithClass) {
            itemWithClass.remove();
            message3.innerHTML = ''

            if (list.children.length == 0) {
                message3.innerHTML = '<p>Список пуст!</p>';
                setTimeout(() => {
                    message3.innerText = '';
                }, 3000)
            }

        } else {

            message3.innerHTML = '<p>Элемент не выбран!</p>';
            setTimeout(() => {
                message3.innerText = '';
            }, 3000)
        }


    }
})

function increaseText() {
    const messages = document.querySelectorAll('.message');

    let shouldIncreaseCounter = false;
    messages.forEach(message => {
        const currentSize = parseFloat(window.getComputedStyle(message).fontSize);


        if (Math.abs((currentSize + 2 * countIncrease) - defaultSize) <= 3) {

            message.style.fontSize = defaultSize + 'px';
            countIncrease = 1;
        } else {

            message.style.fontSize = (currentSize + 2 * countIncrease) + 'px';
            shouldIncreaseCounter = true;

        }

    });
    if (shouldIncreaseCounter) {
        countIncrease++;
        canDecrease = true;
    }
}


function decreaseText() {

    if (!canDecrease) return;


    const messages = document.querySelectorAll('.message');
    let shouldDecreaseCounter = false;
    messages.forEach(message => {
        const currentSize = parseFloat(window.getComputedStyle(message).fontSize);


        if (Math.abs((currentSize - 2 * countDecrease) - defaultSize) <= 3) {
            message.style.fontSize = defaultSize + 'px';
            countDecrease = 1;
        } else {
            message.style.fontSize = Math.max(16, currentSize - 2 * countDecrease) + 'px';
            shouldDecreaseCounter = true;
        }
    });
    if (shouldDecreaseCounter) {
        countDecrease++;
    }

}

zoomBtn.addEventListener('click', function () {
    increaseText();
});



zoomBtn2.addEventListener('click', function () {
    decreaseText();
});




// localStorage.setItem('key','value')// записать
// localStorage.getItem('key')// считать
// localStorage.removeItem('key')// удалить по ключу
// localStorage.clear()// очистить
// localStorage.length// сколько item
