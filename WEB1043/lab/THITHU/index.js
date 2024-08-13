var anh = [];
var current = 1;
var run = false
var inter;

function core() {
    for(var i = 1; i <= 5; i++) {
        anh[i] = new Image();
        anh[i].src = "slide" + i + ".jpg"
    }
}

function tiep() {
    if(current < 5) {
        current++
    } else {
        current = 1
    }
    document.getElementById("anh").src = anh[current].src
}

function ve() {
    if(current > 1) {
        current--
    } else {
        current = 5
    }
    document.getElementById("anh").src = anh[current].src
}

function dau() {
    current = 1
    document.getElementById("anh").src = anh[current].src
}

function cuoi() {
    current = 5
    document.getElementById("anh").src = anh[current].src
}

function start() {
    if(!run) {
        run = true;
        inter = setInterval((e) => {
            tiep();
        }, 500)
    } else if(run) return;
}

function stop() {
    clearInterval(inter);
}