fetch ('Product.json')
    .then(function (respond) {
        return respond.json()
   })
    .then(function (data) {
        appendData(data)
    })
    .catch(function (err) {
        console.log ('error: ' + err)

    })


    function appendData(data) {
        var mainContainer = document.getElementById("myData");
        for( var i=0; i < data.lenght; i++ ) {
            var div = document.createElement ("div")
            div.innerHTML = "Name: "+ data[i].name + ' ' + data[i].price + ' ' + data[i].quantity;
            mainContainer.appendChild(div)

        }
    }
