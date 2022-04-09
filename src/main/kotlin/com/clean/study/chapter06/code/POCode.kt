package com.clean.study.chapter06.code

class Square {
    var topLeft: Point? = null
    var side = 0.0
}

class Rectangle {
    var topLeft: Point? = null
    var height = 0.0
    var width = 0.0
}

class Circle {
    var center: Point? = null
    var radius = 0.0
}

class Geometry {
    val PI = 3.141592653589793

    fun area(shape: Any?): Double {
        return if (shape is Square) {
            val s = shape
            s.side * s.side
        } else if (shape is Rectangle) {
            val r = shape
            r.height * r.width
        } else {
            val c = shape as Circle
            PI * c.radius * c.radius
        }
    }
}