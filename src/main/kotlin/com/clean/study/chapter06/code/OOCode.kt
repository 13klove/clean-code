package com.clean.study.chapter06.code

// 다형 메서드 area를 사용한다.

class OOSquare : Shape {
    private val topLeft: Point? = null
    private val side = 0.0
    override fun area(): Double {
        return side * side
    }
}

class OORectangle : Shape {
    private val topLeft: Point? = null
    private val height = 0.0
    private val width = 0.0
    override fun area(): Double {
        return height * width
    }
}

class OOCircle : Shape {
    private val center: Point? = null
    private val radius = 0.0
    val PI = 3.141592653589793
    override fun area(): Double {
        return PI * radius * radius
    }
}