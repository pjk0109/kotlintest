package com.test

class Person {

    // 코틀린에서 클래스의 멤버로 사용하는 프로퍼티는 초기값을 명시적으로 지정해야 하며, 그렇지 않을 경우 컴파일 에러가 발생한다
    val name : String? = null // 값을 읽을 수만 있는 val
    var address : String? = null // 값을 읽고 쓸수 있는 var

    lateinit var address2 : String // 선언 시점에 값을 할당하지 않아도 컴파일 에러가 발생하지 않는다


}