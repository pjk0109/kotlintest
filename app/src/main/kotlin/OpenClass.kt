package com.test

/**
 * java 와 다르게 open 을 지정해야 상속이 가능해진다
 * */
open class OpenClass {

    constructor()

    // 프로퍼티의 값을 상속한 클래스에서 재정의할 수 있도록한다
    open val openProperty = "foo"

    // open 키워드가 없다면, 상속한 클래스에서 프로퍼티 값을 재정의할 수 없습니다
    val finalProperty = "bar"

    // 상속한 클래스에서 함수를 재정의할 수 있도록 한다
    open fun openFunc() {

    }

    // open 키워드가 없다면, 상속한 클래스에서 함수를 재정의할 수 없다
    fun finalFunc() {}

}