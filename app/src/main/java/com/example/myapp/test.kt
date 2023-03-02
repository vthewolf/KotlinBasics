package com.example.myapp

/*
Función con formato de expresión.
Se sustituyen las llaves por el = al ser solo una expresión.
fun add(x: Int, y: Int): Int = x + y
*/
// Si defino las val en el constructor. Directamente le digo que eso son las properties de la clase
abstract class Person(name: String, val age: Int) {
    var name = name
        get() = "Name: $field" // field para referirnos al campo. Solo aplica en getters/setters
        set(value) {
            field = value
        }
}

class Developer(name: String): Person(name, 20) {

}
fun test(){
    val d = Developer("Tom")
    val name = d.name // Name: Tom

}

