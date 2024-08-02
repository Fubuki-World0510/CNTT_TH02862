var anhAR = [];
var currentIndex = 0;
var invt
var isLoop = false;

function load() {
    for (var i = 1; i <= 4; i++) {
        anhAR[i] = new Image();
        anhAR[i].src = "b" + i + ".jpg";
    }
}

function tiep() {
    if (currentIndex <= 4) {
        currentIndex++;
    } else {
        currentIndex = 1;
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
    if (!isLoop) {
        isLoop = true;
        invt = setInterval(() => {
            tiep();
        }, 1000);
    } else return;
}

function stop() {
    clearInterval(invt);
}

document.getElementById("rform").addEventListener("submit", function (event) {
    var checkboxs = document.querySelectorAll('input[name="checkbox"]:checked');
    var radios = document.querySelectorAll('input[name="radio"]:checked');
    if (checkboxs.length == 0) {
        alert("Vui lòng chọn sở thích");
        event.preventDefault();
    }
    if (radios.length == 0) {
        alert("Vui lòng chọn giới tính");
        event.preventDefault();
    }
    if (checkboxs.length > 0 && radios.length > 0) {
        console.log("Sở thích:", Array.from(checkboxs).map(cb => cb.id));
        console.log("Giới tính:", radios[0].value);
        event.preventDefault();
    }
});