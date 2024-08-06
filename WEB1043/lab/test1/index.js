var img = []
var check = false;
var index = 1;
var st;

function load() {
    console.error("I WILL HACK YOUR PC, AHAHAHAHAHAHAH")
    console.error("I WILL HACK YOUR PC, AHAHAHAHAHAHAH")
    console.error("I WILL HACK YOUR PC, AHAHAHAHAHAHAH")
    console.error("I WILL HACK YOUR PC, AHAHAHAHAHAHAH")
    for(var i = 1; i < 4; i++) {
        img[i] = new Image();
        img[i].src = "img" + i + ".jpg"
    }
    setTimeout(console.log("YOUR TOKEN: JHOIhNzk3NzAwNjQ5MDY4MjY1NTAz"), 10000);
    console.log("INFORMATION:\nYour Name: *** Luan\nYour Google Password: *******65\nYour phone number: ********78");
    console.log("You need to buy a key for give back all data");
}

function next() {
    if(index <= 3) {
        index++;
    } else {
        index = 1;
    }
    document.getElementById("a").src = img[index].src;
}

function back() {
    if(index > 1) {
        index--;
    } else {
        index = 4;
    }
    document.getElementById("a").src = img[index].src;
}

function start() {
    if(check == false) {
        check = true;
        st = setInterval(() => {
            next();
        }, 1000);
    } else return;
}

function stop() {
    if(check == true) {
        clearInterval(st);
    }
}