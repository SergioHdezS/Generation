/*
    Exercise #1
Write a program that takes in an array of numbers and returns the largest number in the list. 
Example: The given array is [3, 5, 7, 1, 6] The largest number is 7.
*/
const listaNumeros = [3, 5, 7, 1, 6]
const listaNumeros2 = [2, 8, 5, 3, 7]

function numeroMasGrande(array) { //funcion que toma como argumento un array
    let numeroMayor = array[0]; //variable que establece el primer numero del array como el numero mas grande
    for (var i = 0; i < array.length; i++) { //bucle for para recorrer cada elemento del array
        if (numeroMayor < array[i]) { // compara el valor de la variable con el elemento actual del bucle
            numeroMayor = array[i]; // si el elemento es mayor, reemplaza el valor de la variable
        }
    }
    console.log('El número mas grande es: ' + numeroMayor); // muestra el numero mas grande
    return numeroMayor;
}
numeroMasGrande(listaNumeros);
console.log('---------------------------');
/*
    Exercise #2
Write a program to sort a list of numbers in descending order (from highest to lowest).
*/
function ordenarLista(array) {
    array.sort(function(a, b) { return b - a });
    console.log(array);
}
ordenarLista(listaNumeros);
console.log('---------------------------');
/*
    Exercise #3
Step 1

Write a program that takes in two lists and returns the greatest number out of the two lists. 
Hint: call the function from Class Exercise #1 (Exercise #1 should return a single number - the greatest number
in the list).*/
function compararMasGrandes(listaNumeros, listaNumeros2) {
    let mayor1 = numeroMasGrande(listaNumeros);
    let mayor2 = numeroMasGrande(listaNumeros2);
    if (mayor1 > mayor2) {
        console.log(mayor1);
    } else {
        console.log(mayor2);
    }
}
compararMasGrandes(listaNumeros, listaNumeros2);
console.log('---------------------------');
/*Find a partner.
Exchange your code.
Read your partner's code and suggest improvements on how you would refactor their code.
Test your partner's code for correctness (does it give the correct output), if it does not give the correct output,
work together to fix the code.
*/

/*
PRACTICE Exercises
Arrays
Exercise #1
Open up a blank repl.it set to Javascript. Copy the code below into your workspace:
*/

var arr = ["This", "is", "a", "sentence."];

function printOutString(array) {
    let sentence = '';
    for (let i = 0; i < array.length; i++) {
        sentence = sentence + array[i] + ' ';
    }
    console.log(sentence);
}
printOutString(arr);
console.log('---------------------------');
/*Complete the function to print out the string This is a sentence.
 */

/*Exercise #2
Write a function that:

Takes in an array of numbers.
Doubles the value of each number in the array.
Prints out the new updated array.
Example: Given an array [1, 2, 4, 5]. The output should be [2, 4, 8, 10]
*/

function multiplicarPor2(array) {
    array.forEach(x => console.log(x * 2));
}
multiplicarPor2([1, 2, 4, 5]);
console.log('---------------------------');
/*Exercise #3
Write a program to compute the sum and product (multiplication) of an array of numbers. Print out the sum and the product.
Example: Given an array [1, 2, 3, 4] The sum is 10. The product is 24.
*/

function sumaYMultiplica(array) {
    let suma = 0;
    let producto = 1;
    for (let i = 0; i < array.length; i++) {
        suma = suma + array[i];
        producto = producto * array[i];
    }
    console.log('La suma es: ' + suma);
    console.log('El producto es: ' + producto);
}
sumaYMultiplica([1, 2, 3, 4]);
console.log('---------------------------');
/*Exercise #4
var student1Courses = ['Math', 'English', 'Programming'];
var student2Courses = ['Geography', 'Spanish', 'Programming'];
Create a program that loops over the 2 arrays; if there are any common courses print them out to the console.
*/
var student1Courses = ['Math', 'English', 'Programming'];
var student2Courses = ['Geography', 'Spanish', 'Programming'];

function elementosComunes(array1, array2) {
    let comunes = [];
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
                comunes.push(array1[i]);
            }
        }
    }
    console.log('Los elementos comunes son: ' + comunes);
}
elementosComunes(student1Courses, student2Courses);
console.log('---------------------------');

/*Exercise #5
For each of the exercises below, assume you are starting with the following people array.

var people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

Write a command that prints out all of the people in the list.
Write the command to remove "Dani" from the array.
Write the command to remove "Juan" from the array.
Write the command to add "Luis" to the front of the array.
Write the command to add your name to the end of the array.
Using a loop, iterate through this array and after console.log-ing "Maria", exit from the loop.
Write the command that gives the indexOf where "Maria" is located.
At the end of the exercise, there should be 4 people in the array.
*/

var people = ["Maria", "Dani", "Luis", "Juan", "Camila"];

function listaPersonas(lista) {
    for (let i = 0; i < people.length; i++) {
        console.log(people[i]);
    }
    lista.splice(lista.indexOf('Dani'), 1, );
    lista.splice(lista.indexOf('Juan'), 1, );
    lista.splice(lista.indexOf('Luis'), 1, );
    lista.splice(0, 0, 'Luis');
    lista.splice(lista.length, 0, 'Sergio');
    console.log(lista);
    while (true) {
        console.log('Maria')
        break
    }
    console.log(lista.indexOf('Maria'));
}

listaPersonas(people);
console.log('---------------------------');
/*Sorting
Exercise #1
Write a program to sort a list of names alphabetically.
*/

function ordenarAlfabeticamente(lista) {
    lista.sort();
    console.log(lista);
}
ordenarAlfabeticamente(people);
console.log('---------------------------');

/*
Code Refactoring & Fixing Code
Exercise #1
Code and paste the code below into a repl.it (set to Javascript).
Make sure to run the program to understand the output.
Find ways to improve the code and make it clearer to understand.
*/
/*
function someFunction(list) {
    if (list.length === 0) {
        return 0;
    }
    return list.length;
}*/
//NO SUPE HACERLA :(

console.log('---------------------------');
/*
Exercise #2
Copy and paste the code below into a repl.it (set to Javascript).
Make sure to run the program to understand what it currently outputs.
Write test cases and fix the code according to the expected output.
Output should be: Failed if they scored 6 or less Insufficient if they scored > 6 but less than 9. (9 included) Good if they scored > 9 but less than 14. (14 included) Excellent if they scored 15. Error if participants enter a negative number or a number outside the range supported (outside 0 - 15)
*/

/* ESTE TAMPOCO ME SALE :(
function gradeLabel(grade) {
    if (grade >= 0 && grade < 6) {
        console.log('Failed');
    } else if (grade > 6 && grade <= 9) {
        console.log('Insufficient');
    } else if (grade > 9 || grade <= 14) {
        console.log('Good');
    } else if (grade == 15) {
        console.log('Good');
    } else if (grade < 0 || grade > 15) {
        console.log("Error, outside of bounds");
    }
}
gradeLabel(-2);
gradeLabel(0);
gradeLabel(2);
gradeLabel(6);
gradeLabel(8);
gradeLabel(9);
gradeLabel(12);
gradeLabel(14);
gradeLabel(15);
gradeLabel(16);
console.log('---------------------------');
*/


/*Additional Exercises
Arrays
var values1= ['Apple', 1, false];
var values2 = ['Fries', 2 ,true];
var values3 = ['Mars', 9, 'Apple'];
Create a function that compares the 3 arrays and finds any common elements. Print out the common elements.
*/
/*
var values1= ['Apple', 1, false];
var values2 = ['Fries', 2 ,true];
var values3 = ['Mars', 9, 'Apple'];
function elementosComunes(array1, array2, array3) {
    let comunes = [];
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            for (let k = 0; k < array3.length; k++) {
                if (array1[i] == array2[j] == array3[k]) {
                    comunes.push(array1[i]);
                }
            }
        }
    }
    console.log('Los elementos comunes son: ' + comunes);
}
elementosComunes(values1, values2, values3);
*/