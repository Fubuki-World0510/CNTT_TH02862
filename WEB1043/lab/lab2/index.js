function BMI() {
    const a = prompt("Trọng lượng cơ thể")
    const b = prompt("Chiều cao")
    const tinh = a/(b*b).toFixed(2);
    
    if(a == "" || b == "" || isNaN(a || b)) return alert("NUH UH");

    if(tinh < 18.5) {
        document.getElementById("hello").innerText = (`BMI = ${tinh} Thiếu cân`)
    } else if(tinh > 18.5 && tinh < 24.99) {
        document.getElementById("hello").innerText = (`BMI = ${tinh} Bth bạn`)
    } else if(tinh > 25 && tinh < 29.99) {
        document.getElementById("hello").innerText = (`BMI = ${tinh} Thừa cân gòi`)
    } else if(tinh >= 30) {
        document.getElementById("hello").innerText = (`BMI = ${tinh} Béo vãi ò`)
    }
}
