var anhAR = [];
var currentIndex = 0;
var invt

function load() {
    for (var i = 1; i <= 4; i++) {
        anhAR[i] = new Image();
        anhAR[i].src = "b" + i + ".jpg";
    }
}

function tiep() {
    if (currentIndex < 4) {
        currentIndex++;
    } else {
        currentIndex = 0;
    }
    document.getElementById("anh").src = anhAR[currentIndex].src;
}

function tro() {
    if (currentIndex > 0) {
        currentIndex--;
    } else {
        currentIndex = 4;
    }
    document.getElementById("anh").src = anhAR[currentIndex].src;
}

function dau() {
    currentIndex = 1;
    document.getElementById("anh").src = anhAR[currentIndex].src;
}

function cuoi() {
    currentIndex = 4;
    document.getElementById("anh").src = anhAR[currentIndex].src;
}

function slideShow() {
   invt = setInterval(() => {
        tiep();
    }, 2000);
}

function stop() {
    clearInterval(invt);
}