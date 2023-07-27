package com.helinavci.kotlinacademy

class Personel(val name : String , val surname : String , var position : String , var salary : Int){
    fun maasArttir( rate : Int ){
        salary += salary * (rate / 100)
    }
    fun positionChange(newPosition : String){
        position = newPosition
    }

}
fun main(){
    val personel = Personel("ali" , "akyüz" , "halkala ilişkiler" , 15000)
    personel.maasArttir(25)
    personel.positionChange("idari müdür")
    println("new positon is ${personel.position} and new salary for this position is ${personel.salary}")
}