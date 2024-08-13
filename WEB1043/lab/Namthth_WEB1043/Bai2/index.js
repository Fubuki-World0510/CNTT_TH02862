const email = document.getElementById("email").value
const pass = document.getElementById("pass").value
const date = document.getElementById("dater").value
const hoten = document.getElementById("name").value

const validate = () => {
    const regex = /@[a-zA-Z0-9.-]+\.$/
    console.log(email)
    console.log(pass)
    console.log(date)
    console.log(hoten)
    if (email === '') {

    } else {
        console.log("ăn")
        if (!regex.test(email)) {
            document.getElementById("loi1").innerText = "Lỗi mail, kiểm tra lại mail của bạn"
        }
    }
    if (pass === '') {

    } else {
        if (pass.length < 6) {
            document.getElementById("loi2").innerText = "Mật khẩu phải từ 6 ký tự trở lên"
        }
    }
    if (date) {

    } else {
        const a = parseInt(date)
        const b = a > 1900 && a < 2024
        if (!b) {
            document.getElementById("loi3").innerText = "Năm sinh cần nhập phải lớn hơn 1900 và bé hơn 2024"
        }
    }
    return false;
}