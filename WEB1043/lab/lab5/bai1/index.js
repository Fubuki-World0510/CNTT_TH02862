function dis() {
    var name = document.getElementById("pro").innerText
    document.getElementById("name").innerText = `${name}`
    var sl = document.getElementById("qty").value
    var price = document.getElementById('pro').getAttribute('data-price')
    document.getElementById('amout').innerText = `${sl*price}`
}