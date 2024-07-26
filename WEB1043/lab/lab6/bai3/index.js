var anhAR = [];
var currentIndex = 0;

function load() {
    for (var i = 0; i < 5; i++) {
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
    currentIndex = 0;
    document.getElementById("anh").src = anhAR[currentIndex].src;
}

function cuoi() {
    currentIndex = 4;
    document.getElementById("anh").src = anhAR[currentIndex].src;
}