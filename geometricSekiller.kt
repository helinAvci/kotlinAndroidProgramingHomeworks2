package com.helinavci.kotlinacademy

open class GeometrikSekil(val corner : Int,){

}
class Dikdortgen(corner : Int,val length : Int ,val width : Int) : GeometrikSekil(corner){
    fun area() : Int{
        return width * length
    }
    fun perimeter() : Int{
        return 2 * (length + width)
    }
}
class Daire(corner : Int , val radius : Int) : GeometrikSekil(corner){
    val PI = 3.14
    fun area() : Double{
        return PI * radius * radius
    }
    fun perimeter() : Double {
        return 2 * PI * radius
    }
}