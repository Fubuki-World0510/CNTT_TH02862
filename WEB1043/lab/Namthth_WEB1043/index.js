var anh = []
var check = false
var cur = 1;
var int;

function load() {
    for(var i = 1; i <= 5; i++) {
        anh[i] = new Image();
        anh[i].src = "slide" + i + ".jpg"
    }
}

function tiep() {
    if(cur < 5) {
        cur++;
    } else {
        cur = 1;
    }
    document.getElementById("anh").src = anh[cur].src
}

function ve() {
    if(cur > 1) {
        cur--;
    } else {
        cur = 5;
    }
    document.getElementById("anh").src = anh[cur].src
}

function dau() {
    cur = 1;
    document.getElementById("anh").src = anh[cur].src
}

function cuoi() {
    cur = 5;
    document.getElementById("anh").src = anh[cur].src
}

function start() {
    if(!check) {
        check = true;
        int = setInterval(() => {
            tiep();
        }, 1500)
    }
}

function stop() {
    if(check) {
        clearInterval(int);
    }
}