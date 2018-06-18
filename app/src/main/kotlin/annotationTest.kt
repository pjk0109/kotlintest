package com.pjk.kotlintest

annotation class Ano(
        val numbers:IntArray,
        val names:Array<String>
)

// 자바 원시타입을 갖는 배열과 그렇지 않은 배열 멤버에 값을 지정하는 방식이 다르다
@Ano(numbers = intArrayOf(1,2,3), names = arrayOf("a","b","c")) class Bar {

}