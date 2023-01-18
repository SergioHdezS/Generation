// PruebaJavaScriptC3

/* obs: los días se deben ingresar como tipo String y los valores de los productos a
comprar se deben trabajar con arreglos, por ejemplo = [1000,500,650,8000]
*/
var dia = ['martes'];
var carrito = [1000, 500, 650, 8000];
var carrito2 = [2500, 5000, 9700];
var carrito3 = [15000, 2500, 4000, 5800];
var carrito4 = [3000, 4500, -600, 550];

// Funcion que aplica un 20% de descuento en el total de la compra
function descuento20PorCiento(carrito) {
    let carritoConDcto20 = [];
    if (dia == 'martes' || dia == 'jueves') {
        carrito.forEach(precio => carritoConDcto20.push(precio * 0.8));
        console.log(carritoConDcto20);
        return carritoConDcto20;
    } else {
        console.log('No aplica descuento.')
    }
}
descuento20PorCiento(carrito);

// Funcion que aplica el 5% de descuento en compras con mas de 3 productos y al menos un producto sobre los $10.0000

function descuento5PorCiento(carrito) {
    let carritoConDcto5 = [];
    if (carrito.length < 3) { // Condicion, verifica que tenga mas de 3 productos
        console.log('No aplica descuento, agregar productos.');
    } else {
        for (let i = 0; i < carrito.length; i++) { // Bucle que recorre la lista verificando que haya al menos un producto sobre los $10.000
            if (carrito[i] > 10000) { // Condicion, si hay un producto sobre los $10.000 aplica el descuento
                carrito.forEach(precio => carritoConDcto5.push(precio * 0.95));
                ///console.log(carritoConDcto5);
            } else {
                console.log('No aplica descuento, agregue producto sobre $10.000');
            }
            return carritoConDcto5;
        }
    }
}
descuento5PorCiento(carrito);

// Funcion que verifica que los valores de los productos no sean negativos

function verificaPrecioNegativo(carrito) {
    for (let i = 0; i < carrito.length; i++) { // Bucle que revisa cada elemento de la lista
        if (carrito[i] < 0) { // Condicion, si hay una numero negativo, arrojar mensaje de error y posicion en la lista
            console.log('Error: Precio incorrecto');
            console.log(carrito.indexOf(carrito[i]));
        } else { // Si no hay precios negativos, arroja mensaje de exito
            console.log('Precios ingresados correctamente.');
        }
    }
}
verificaPrecioNegativo(carrito4);
verificaPrecioNegativo(carrito);

/* Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
producto
○ Crea una función que retorne el valor del producto más costoso.
○ Crea una función que retorne el valor del producto menos costoso.
*/

var carrito5 = [200, 5500, 900, 7000, 500, 300]

function precioMayor(carrito) { // Funcion que busca el precio mayor
    let mayorPrecio = carrito[0]; // Establece el primer elemento de la lista como el mayor precio
    for (let i = 0; i < carrito.length; i++) { //bucle que compara los elementos de la lista
        if (mayorPrecio < carrito[i]) { //Compara cada elemento de la lista con el mayorPrecio, si el elemento es mayor, pasa a ser el mayorPrecio
            mayorPrecio = carrito[i];
        }
    }
    console.log(mayorPrecio);
}

function precioMenor(carrito) { // funcion que busca el precio meno
    let menorPrecio = carrito[0]; // Establece el primer elemento de la lista como el menor precio
    for (let i = 0; i < carrito.length; i++) { // bucle que recorre los elemento de la lista
        if (menorPrecio > carrito[i]) { // Compara cada elemento de la lista con el menorPrecio, si el elemento es mas bajo, pasa a ser el menorPrecio
            menorPrecio = carrito[i];
        }
    }
    console.log(menorPrecio);
}

precioMayor(carrito5);
precioMenor(carrito5);