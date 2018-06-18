package com.test

/**
 * 상속가능한 open 클래스를 상속받은 클래스
 * */
class FinalClass : OpenClass {

    constructor()

    // 성공 : openProperty 는 재정의가 가능한 프로퍼티
    override val openProperty = "Foo"

    // 오류 finalProperty는 재정의가 불가하게 설정되어있다
//    override val finalProperty = "BAR"

    // 성공 : 재정의가 가능한 함수
    override fun openFunc() {


    }

    // 오류 finalFunc는 재정의가 불가능
//    override fun finalFunc() {
//
//    }



}