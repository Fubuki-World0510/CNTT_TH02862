var d = []
function add(button, data) {
    var tong
    for (const a of d) {
        if (a === "ip9" && data === "ip") {
            const btw = document.getElementById("ip9D")
            const cl = document.getElementsByClassName("ip")[1]
            if (btw && cl) {
                const gc = Number(document.getElementsByClassName("priceIP")[1].innerText.replace(/\$/im, ''))
                const tien = Number(document.getElementById("tien").innerText)
                document.getElementsByClassName("priceIP")[1].innerText = `$${gc + 2700}`
                tong = tien + 2700
                document.getElementById("tien").innerText = `${tong}`
            }
        }
        if (a === "ss" && data === "ss") {
            const btw = document.getElementById("ssD")
            const cl = document.getElementsByClassName("ss")[1]
            if (btw && cl) {
                const gc = Number(document.getElementsByClassName("priceSS")[1].innerText.replace(/\$/im, ''))
                const tien = Number(document.getElementById("tien").innerText)
                document.getElementsByClassName("priceSS")[1].innerText = `$${gc + 1500}`
                tong = tien + 1500
                document.getElementById("tien").innerText = `${tong}`
            }
        }
        if (a === "nokia" && data === "no") {
            const btw = document.getElementById("nokiaD")
            const cl = document.getElementsByClassName("nokia")[1]
            if (btw && cl) {
                const gc = Number(document.getElementsByClassName("priceNO")[1].innerText.replace(/\$/im, ''))
                const tien = Number(document.getElementById("tien").innerText)
                document.getElementsByClassName("priceNO")[1].innerText = `$${gc + 1200}`
                tong = tien + 1200
                document.getElementById("tien").innerText = `${tong}`
            }
        }
        if (a === "sony" && data === "so") {
            console.log("REACHED")
            const btw = document.getElementById("sonyD")
            const cl = document.getElementsByClassName("sony")[1]
            console.log("BTW", btw)
            console.log("CL", cl)
            if (btw && cl) {
                console.log("REACHED 2")
                const gc = Number(document.getElementsByClassName("priceSO")[1].innerText.replace(/\$/im, ''))
                const tien = Number(document.getElementById("tien").innerText)
                document.getElementsByClassName("priceSO")[1].innerText = `$${gc + 1700}`
                tong = tien + 1700
                document.getElementById("tien").innerText = `${tong}`
            }
        }
    }

    var but = button.parentElement.parentElement.cloneNode(true);
    const set = d.find((d) => d == but.id)
    console.log("ĐẦU", d);
    if (but.id === "ip9" && !set) {
        var btnXoa = but.getElementsByTagName("button")[0];
        btnXoa.innerText = "Xóa";
        btnXoa.setAttribute('onclick', 'rm(this)');
        document.getElementById("cart").appendChild(but);

        d.push("ip9")
        const tien = Number(document.getElementById("tien").innerText)
        tong = tien + 2700
        document.getElementById("tien").innerText = `${tong}`
        btnXoa.setAttribute('id', `${but.id}D`)
    }
    if (but.id === "ss" && !set) {
        var btnXoa = but.getElementsByTagName("button")[0];
        btnXoa.innerText = "Xóa";
        btnXoa.setAttribute('onclick', 'rm(this)');
        document.getElementById("cart").appendChild(but);
        d.push("ss")
        const tien = Number(document.getElementById("tien").innerText)
        tong = tien + 1500
        document.getElementById("tien").innerText = `${tong}`
        btnXoa.setAttribute('id', `${but.id}D`)
    }
    if (but.id === "nokia" && !set) {
        var btnXoa = but.getElementsByTagName("button")[0];
        btnXoa.innerText = "Xóa";
        btnXoa.setAttribute('onclick', 'rm(this)');
        document.getElementById("cart").appendChild(but);
        d.push("nokia")
        const tien = Number(document.getElementById("tien").innerText)
        tong = tien + 1200
        document.getElementById("tien").innerText = `${tong}`
        btnXoa.setAttribute('id', `${but.id}D`)
    }
    if (but.id === "sony" && !set) {
        var btnXoa = but.getElementsByTagName("button")[0];
        btnXoa.innerText = "Xóa";
        btnXoa.setAttribute('onclick', 'rm(this)');
        document.getElementById("cart").appendChild(but);
        d.push("sony")
        const tien = Number(document.getElementById("tien").innerText)
        tong = tien + 1700
        document.getElementById("tien").innerText = `${tong}`
        btnXoa.setAttribute('id', `${but.id}D`)
    }
}

function rm(button) {
    var but = button.parentElement.parentElement
    if (but.id === "ip9") {
        const tien = Number(document.getElementById("tien").innerText)
        const gc = Number(document.getElementsByClassName("priceIP")[1].innerText.replace(/\$/im, ''))
        tong = tien - gc
        document.getElementById("tien").innerText = `${tong}`
        d = d.filter(d => d !== "ip9")
    }
    if (but.id === "ss") {
        const tien = Number(document.getElementById("tien").innerText)
        const gc = Number(document.getElementsByClassName("priceSS")[1].innerText.replace(/\$/im, ''))
        tong = tien - gc
        document.getElementById("tien").innerText = `${tong}`
        d = d.filter(d => d !== "ss")
    }
    if (but.id === "nokia") {
        const tien = Number(document.getElementById("tien").innerText)
        const gc = Number(document.getElementsByClassName("priceNO")[1].innerText.replace(/\$/im, ''))
        tong = tien - gc
        document.getElementById("tien").innerText = `${tong}`
        d = d.filter(d => d !== "nokia")
    }
    if (but.id === "sony") {
        const tien = Number(document.getElementById("tien").innerText)
        const gc = Number(document.getElementsByClassName("priceSO")[1].innerText.replace(/\$/im, ''))
        tong = tien - gc
        document.getElementById("tien").innerText = `${tong}`
        d = d.filter(d => d !== "sony")
    }
    console.log("CUỐI", d);
    document.getElementById("cart").removeChild(but);
}