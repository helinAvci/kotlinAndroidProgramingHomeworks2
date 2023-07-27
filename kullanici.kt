package com.helinavci.kotlinacademy

class Kullanici(var name : String? , var surname : String?) {

}
fun main(){
    val kullanici = Kullanici("ali" ,null)
    if(kullanici.name != null && kullanici.surname == null){
        println("${kullanici.name} ${kullanici.surname}")
    }
}