package com.pucetec.rest

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
open class Example {

    val square: Square = Square().apply {
        sidesNumber = 4
        anotherThing = 6
    }
    val triangle: Triangle = Triangle().apply { sidesNumber = 3 }


    // constante que no va a cambiar su valor
    val inmutableVariable = 0

    //variable que si va a cambiar
    var variable: String = "algo"
    var booleanVariable: Boolean = false
    var floatVariable: Float = 0.0f
    var longVariable: Long = 0L

    @GetMapping("/alooo")
    open fun hello(): String {
        return "Hola Mundo"
    }

    @GetMapping("/square")
    open fun square(): GeometricForm{
        return square
    }
}

open class GeometricForm {
    var sidesNumber: Int = 0
}

class Square: GeometricForm() {
    var anotherThing: Int = 2
}

class Triangle: GeometricForm() {
}