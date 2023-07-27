package com.helinavci.kotlinacademy

open class Oyuncu( val name : String , val surname : String , val category : String){
    fun oyna(){

    }
    fun printInfo(){
        println("$name $surname  in category $category")
    }
}
class Futbolcu(name : String , surname : String , category : String , val age : Int ) : Oyuncu(name , surname , category){
    @Override
    fun printlnInfo(){
        println("$name $surname  in category $category with age $age")
    }
}
class Basketbolcu(name : String , surname : String , category : String , val hight : Double ) : Oyuncu(name , surname , category){
    @Override
    fun printlnInfo(){
        println("$name $surname  in category $category with hight $hight")
    }
}
fun main(){
    val futbolcu = Futbolcu("arda" , "güler" , "Futbol" , 18)
    val basketbolcu = Basketbolcu("ahmet" , "sarı" , "basketbol" , 2.03 )
    futbolcu.printlnInfo()
    basketbolcu.printlnInfo()
}