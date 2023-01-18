/*
1.- Crear un programa donde el usuario ingrese la temperatura en Celcius y el programa
muestre en consola la temperatura en Fahrenheit.
*/
function cambiarGrados(celsius) {
    let farenheit = 0;
    farenheit = (celsius * 1.8) + 32;
    console.log(farenheit);
}
cambiarGrados(0);

/*
2.- Pedir un número y luego dividirlo por 10, ejemplo: 5 / 10 igual 0.5.
*/
function dividirPor10(numero) {
    let numeroDividido = 0;
    numeroDividido = numero / 10;
    console.log(numeroDividido);
}
dividirPor10(5);

/*
3.- Si a = [1,2,3] crear un script que determine de muestre en consola el tipo de dato de a.
*/
var a = [1, 2, 3];
console.log(typeof a);

// IF, ELSE, ELSE IF

/*
4.- Crear un programa que determine si un número es par o no, la respuesta será mostrada
con console.log.
*/
function probarPar(numero) {
    if (numero % 2 == 0) {
        console.log('Es par');
    } else {
        console.log('Es impar');
    }
}
probarPar(4);

/*
5.- Crear un programa que determine si un número es divisible por 5 o no, mostrar el
resultado con console.log.
*/
function divisiblePor5(numero) {
    if (numero % 5 == 0) {
        console.log('Es divisible por 5');
    } else {
        console.log('No es divisible por 5');
    }
}
divisiblePor5(15);

/*
6.- Crear un programa que determine si un número introducido es divisible por 11 y 5 o no,
mostrar el resultado con console.log.
*/
function divisiblePorOnceYCinco(numero) {
    if (numero % 11 == 0 && numero % 5 == 0) {
        console.log('Es divisble por 11 y 5');
    } else {
        console.log('No es divisible por 11 y 5');
    }
}
divisiblePorOnceYCinco(55);

/*
7.- Crear un programa que le pida dos números y luego muestre en un console.log el número
mayor.
*/
function numeroMayor(num1, num2) {
    if (num1 < num2) {
        console.log('El numero mayor es: ' + num2);
    } else if (num1 > num2) {
        console.log('El numero mayor es: ' + num1);
    } else {
        console.log('Los numeros son iguales');
    }
}
numeroMayor(2, 5);

/*
8.- Crear un programa que le pida un número y luego un segundo número para luego mostrar
en console.log el número mayor, esta vez realizar el ejercicio ocupando un if ternario.
*/

/*
9.- El siguiente código tiene un error, descubrirlo y arreglarlo:
~~~javascript
// Obtener edad
if(edad < 13) {
console.log("Es niño");
}if(edad < 18 ){
console.log("Es adolecente");
} else{
console.log("Es adolecente");
}
~~~

*/

// LOOPS

/*
10.- Mostrar todos los números de 1 a n aumentando de 1 en 1 donde n se ingresa como
número en la función
*/
var n = 10
var i = 1
while (i <= n) {
    console.log(i);
    i++;
}

/*
11.- Mostrar todos los números de 1 a N aumentando de 2 en 2 donde n se ingresa como
número en la función.
*/
var m = 10
var j = 1
while (j <= m) {
    console.log(j);
    j = j + 2;
}

/*
12.- Mostrar todos los números de N a 1 disminuyendo de 1 en 1 donde n se ingresa como
número en la función
*/