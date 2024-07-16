const validate = () => {
    // document.getElementById("EmailErr").innerText = "";
    // document.getElementById("PassErr").innerText = "";
    // document.getElementById("ConfirmErr").innerText = "";

    var err = false;
    var email = document.getElementById("email").value;
    var pass = document.getElementById("password").value
    var confim = document.getElementById("confirm").value
    if(pass === '') {
        err = true
        document.getElementById("PassErr").innerText = "Chưa có mật khẩu";
    } else if(!/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8}$/.test(pass)) {
        err = true
        document.getElementById("PassErr").innerText = "Mật khẩu không hợp lệ, chỉ được 8 ký tự, có ký tự hoa và thường, có chứa ký tự đặc biệt";
    } else {
        document.getElementById("PassErr").innerText = "";
    }
    if(confim !== pass) {
        err = true
        confim === '' ? document.getElementById("ConfirmErr").innerText = "Chưa nhập xác nhận mật khẩu" : 
        document.getElementById("ConfirmErr").innerText = "Mật khẩu không khớp";
    } else {
        document.getElementById("ConfirmErr").innerText = "";
    }
    if(email === '') {
        err = true
        document.getElementById("EmailErr").innerText = "Cần nhập Email";
    } else {
        document.getElementById("EmailErr").innerText = "";
    }
    
    if(err == false) {
        document.getElementById("Suc").innerText = "Form hợp lệ";
    } else {
        document.getElementById("Suc").innerText = "";
    }
    return false
}