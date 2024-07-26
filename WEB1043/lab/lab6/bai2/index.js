var flag = true;
var count = 0;

function play(index) {
    var buttons = document.getElementsByTagName("button");
    var button = buttons[index];
    button.innerText = flag ? "X" : "O";
    button.style.backgroundColor = flag ? "aqua" : "yellow";
    button.setAttribute("disabled", "true");
    flag = !flag;

    count++;
    if (count == 8) {
        alert("Game over!");
        location.reload();
    }
}