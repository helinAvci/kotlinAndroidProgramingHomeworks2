package com.helinavci.kotlinacademy

fun simpleArraySum(arr : Array<Int>) : Int{
    var sum = 0
    for(i in 0..arr.size-1){
        sum += arr[i]
    }
    return sum
}