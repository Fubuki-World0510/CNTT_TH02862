var a = null, b = null, o = null;

var isMathBI = false
var ListA = []
var ListB = []
function returnIt() {
    a = null;
    b = null;
    o = null;
}

function mathB(x) {
    isMathBI = true;
    o = x;
    console.log("Math React")
}

function mathA(x) {
    /**
     * input: 1234
     * Câu hỏi: Làm sao để dừng nhập chuyển sang B
     * Cách làm: Khi nhấn vào toán tử, array sẽ kết thúc và chuyển sang B
     */
    if (!isMathBI) {
        if (ListA.length < 0 || ListA.length >= 0) {
            console.log("A")
            ListA.push(x)
            a = x;
        }
    }
    if (isMathBI) {
        if (ListB.length < 0 || ListB.length >= 0) {
            console.log("B")
            ListB.push(x)
            b = x;
        }
    }
}

function init() {
    if (ListA.length >= 0 && ListB.length >= 0 && o) {
        var result;
        const a1 = Number(ListA.join(""));
        const b1 = Number(ListB.join(""));
        console.log(`A: ${a1}`, `B: ${b1}`)
        switch (o) {
            case '+':
                result = a1 + b1;
                break;
            case '-':
                result = a1 - b1;
                break;
            case 'x':
                result = a1 * b1;
                break;
            case '/':
                result = a1 / b1;
                break;
            default:
                ListA = [];
                ListB = [];
                isMathBI = false;
                result = 'Nhap lai';
        }
        ListA = [];
        ListB = [];
        isMathBI = false;
        alert(result);
        returnIt();
    } else {
        alert('Nhap lai');
    }
}