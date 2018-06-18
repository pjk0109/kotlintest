package com.test

import android.util.Log
import android.util.TypedValue
import com.pjk.kotlintest.ArrayTest

/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    println("Hello, world!")

    var res = sum(10)
    println("sum result "+res)


    var a:Int = 123
    println(a)

    var b:Int? = 123;
    b = null
    println(b)


    val name:String = "Ko"
    val age:Int = 20
    val msg = "name is $name  age is $age  name length ${name.length}"
    println(msg)

    val lengthCnt = getLength(msg)
    println(lengthCnt)

    val lenCnt = getStringLength(123)
    println(lenCnt)


    cases("Hello") // String
    cases(1) // Int
    cases(System.currentTimeMillis()) // Long
    cases(MyClass()) // Not a string
    cases("hello") // Unknown




    // 반복문 테스트
    val items = listOf("a","b","c")
    for(item in items) {
        println("item : $item")
    }

    // while문
    var i = 0
    while(i < items.size) {
        println("item : ${items[i]}")
        i++
    }


    // 10진수 표기
    val decValue: Int = 100

    // 16진수 표기
    val hexValue: Int = 0x100

    // 2진수 표기
    val binaryValue : Int = 0b100

    // Long에 한해 대문자만 사용한다
    val longValue: Long = 100L

    val doubleValue: Double = 100.1
    // ( 혹은 1.001e2 )

    val floatValue = 100.0f
    // ( 혹은 100f )

    // 연산자
    /**
     *   Java &  == Kotlin and   비트 연산 AND
     *   |      == or   비트 연산 OR
     *   ^      == xor  비튼 연산 XOR
     *   ~      == inv  비트 연산 NOT
     *   <<     == shl  왼쪽으로 쉬프트 ( 부호 비트 유지 )
     *   >>     == shr  오른쪽으로 쉬프트 ( 부호 비트 유지 )
     *   >>>    == ushr 오른쪽으로 쉬프트 ( 부호 비트 무시 )
     *
     * */

    // 문자
    // 캐릭터형에 Int형 대입불가
//    val c : Char = 65
    val c : Char = 'A'

    // 아스키코드값을 바꾸려면
    // 문자 'A'의 아스키 코드값
    val code : Int = 65

    // code에 해당하는 문자를 할당
    val ch : Char = code.toChar()


    // 논리
    val foo : Boolean = true

    // 논리연산자
    /**
     *   ||  논리 연산 OR
     *   &&  논리 연산 AND
     *   !   논리 연산 NOT
     * */


    // 문자열
    /**
     *
     * 문자열에서 특정 위치의 문자에 접근
     * java 에서는 charAt(1) 이렇게 사용
     *
     * */
    val strings : String = "Lorem ipsum"

    // ch1 에 인덱스가 4인 문자 'm' 할당
    val ch1 : Char = strings.get(4)

    // ch2 에 인덱스가 6인 문자 'i' 할당
    val ch2 : Char = strings[6]

    // 문자열 대입
    val length : Int = 3000
    // "Length: 3000 meters" 값 할당 - 규격화된 문자열
    val lengthText : String = String.format("Length: %d meters", length)

    // 템플릿 문자열에 포함할 인자는 앞에 달러표시 $ 를 붙여 구분
    // 또는  코틀린에서 제공하는 문자열 템플릿
    val lengthText2 : String = "Length : $length meters"

    // 변수 대신 표현식을 넣고 싶으면 중괄호로 구분하면 된다
    val lentghText3 : String = "TextLength : ${strings.length}"

    // 문자열 내에 달러 통화 기호를 포함해야 하는 경우 해당 기호가 탈출 문자를 지원하지않으므로 다르게 표현해야함
    val price : Int = 1000
    val priceText : String = "Price: ${'$'}$price"


    // 배열
    /**
     * java
     * String[] words = new String[] {"Lorem", "ipsum"};
     * */
    val words : Array<String> = arrayOf("Lorem", "ipsum")

    /**
     * 배열의 클래스
     * Java  byte[]   ==   Kotlin  kotlin.ByteArray
     *       double[] ==   kotlin.DoubleArray
     *       float[]  ==   kotlin.FloatArray
     *       int[]    ==   kotlin.IntArray
     *       long[]   ==   kotlin.LongArray
     *       short[]  ==   kotlin.ShortArray
     *
     * */
    /**
     * int[] intArr = new int[]{1,2,3,4,5}
     * */
    val intArr : IntArray = intArrayOf(1,2,3,4,5)

    // 원시타입이 아닌 래퍼타입의 배열을 사용할 경우
    /**
     * Integer[] intArr = new Int[]{1,2,3,4,5}
     * */
    val intArr2 : Array<Int> = arrayOf(1,2,3,4,5)


    /**
     *  Java 배열을 인자로 받거나 가변인자를 사용하는 경우
     *  스프레드연산자( * ) 을 함께 사용해야 코틀린의 배열을 인자로 전달할 수 있다
     *
     *  java
     *  public void foo(int[] arr){
     *
     *  ]
     *
     *  public void bar(String... args) {
     *
     *  }
     *
     *  코틀린에서 이 메서드를 호출할 떄 다음과 같이 해야한다
     *
     *  val intArr : IntArray = intArrayOf(1,2,3,4,5)
     *  foo(*intArr)
     *
     *  val stringArr : Array<String> = arrayOf("a","b","c")
     *  bar(*stringArr)
     *
     *
     *
     *  코틀린에서 작성된 함수는, 가변인자에 배열을 전달하는 경우에만 스프레드 연산자를 사용한다
     *
     *  kotlin
     *  fun foo(arr: Array<Int>) {
     *
     *  }
     *  fun bar(vararg args: String) {
     *
     *  }
     *
     *  val intArr : IntArray = intArrayOf(1,2,3,4,5)
     *  foo(intArr) // 배열을 바로 인자로 대입
     *
     *  val stringArr : Array<String> = arrayOf("a","b","c")
     *  bar(*stringArr) // 스프레드 연산자 사용
     *
     * */

    /**
     * 컬렉션
     * 자료 수정 불가
     * kotlin.collections.List      listOf()
     * kotlin.collections.Set       setOf()
     * kotlin.collections.Map       mapOf()
     *
     * 자료 수정 가능
     * kotlin.collections.ArrayList(java.util.ArrayList)    arrayListOf()
     * kotlin.collections.HashSet(java.util.HashSet)        hashSetOf()
     * kotlin.collections.LinkedHashSet(java.util.LinkedHashSet)    linkedSetOf()
     * kotlin.collections.TreeSet(java.util.TreeSet)    sortedSetOf()
     * kotlin.collections.HashMap(java.util.HashMap)    hashMapOf()
     * kotlin.collections.LinkedHashMap(java.util.LinkedHashMap)    linkedMapOf()
     * kotlin.collections.SortedMap(java.util.SoredMap) sortedMapOf()
     *
     *
     * */
    // 자료를 수정할 수 없는 리스트 생성
    val immutableList : List<String> = listOf("a","b","c","d","e")

    // 컴파일 에러 : 자료 수정을 위한 함수를 지원하지 않음
    //    immutableList.add("aa")

    // 자료를 수정할 수 있는 리스트 생성
    val mutableList : MutableList<String> = arrayListOf("a","b","c")

    // 자료 추가 가능
    mutableList.add("d")


    // 자료 수정못하는 리스트에서 첫 번째 항목 읽기 - get(0) 과 동일
    val firstItem : String = immutableList[0]

    // 자료 변경가능한 경우
    mutableList[0] = "first"

    // 맵은 숫자 인덱스 대신 키 값을 넣어 항목에 접근이 가능하다
    val immutableMap: Map<String, Int> = mapOf(Pair("A", 65), Pair("B",66))
    val immutableMap2: Map<String, Int> = mapOf("A" to 65, "B" to 66)   // Pair 대신에 to 함수 이용


    // 키 "A"에 해당하는 값
    val mapValue1 : Int? = immutableMap["A"]    // 맵에서 값이 없을 경우(null일 경우) 때문에 Int에 ?를 붙여야함

    // 값이 변경가능한 해쉬맵
    val mutableMap: HashMap<String, Int> = hashMapOf(Pair("A", 65), Pair("B",66))

    // 데이터 변경 가능
    mutableMap["A"] = 67
    

    // 자료형 확인 is 연산자
    /**
     * Java 에서는 instanceof 를 사용하였는데
     * 코틀린에서는 is 를 사용한다
     * */
    printTypeName("abc")


    // 자료형 변환 as 연산자
    /**
     * java
     * Integer foo = (Integer)number;
     *
     * 코틀린
     * var foo : Int = number as Int
     *
     * */


    // when 문 - java 의 switch문을 대체한다
    whenTest()


    // while 문
    whileTest()


    // for 문 - 코틀린에서는 for-each 형태만 지원한다
    forTest()

}

// for 문
fun forTest() {

    val names : List<String> = arrayListOf("a","b","c","d","e")

    // 변수 name의 타입은 리스트 names 를 통해
    // String 으로 추론하므로 타입을 적지 않아도 된다
    for(name in names) {
        Log.d("for", "name="+name)
    }


    // for문에서 인덱스 접근하기
    // for문 내에서 현재 항목의 인덱스가 필요할 경우 Collection.indicies 프로퍼티를 사용하면
    // 컬렉션의 인덱스를 순환하며 인덱스 인자로 배열 내 항목에 접근할 수 있다

    // Collection.indicies는 컬렉션의 인덱스 범위를 반환한다
    for(i in names.indices) {
        // 인덱스 인자로 배열 내 항목 접근
        Log.d("for 인덱스인자로 배열 내 항목 접근", "name=${names[i]}")
    }


    // 범위 지정 ..연산자를 사용한다
    // 0부터 10까지, 시작과 끝을 포함하는 범위를 정의
    val myRange : IntRange = 0..10

    // 앞에서 정의한 범위 내를 순환하는 for 문
    for(i in myRange) {
        // 실행
        Log.d("for IntRange 로 범위지정 ", "현재 범위 : $i")
    }

    // for문 내에서 바로 범위를 정의할 수 있다
    for(i in 0..10) {
        Log.d("for 바로 범위지정 ", "현재 범위 : $i")
    }


    // 인덱스 순환을 하는 경우 ..연산자 대신 until 함수를 사용하면 마지막 값을 포함하지 않는 범위를 생성할 수 있다
    val items : List<String> = arrayListOf("a","b","c","d","e")

    // 0번 인덱스부터 3번 인덱스까지 총 4개의 항목을 포함하는 범위
    val itemRange : IntRange = 0..3

    // itemRange와 동일항 항목을 포함하는 범위
    val itemRange2 : IntRange = 0 until 4


    // 범위 내에 특정 항목이 있는지 알아보려면 in 연산자를 사용한다
    val checkRange : IntRange = 0..10

    // 5가 checkRange 내에 포함되어 있는지 확인 : true 반환
    val foo : Boolean = 5 in checkRange

    // 5가 checkRange 내에 포함되지 않는지 확인 : false 반환
    val bar : Boolean = 5 !in checkRange


    // 항목들의 순서가 반대로 정렬된 범위를 생성하려면 downTo() 함수를 사용한다
    // 첫 번째 인자로 시작 값을, 두 번째 인자로 마지막 값을 대입한다
    // '54321' 출력
    for(i in 5 downTo 1) {
        Log.d("for downTo()함수 ", "downTo()함수 출력 $i")
    }

    // downTo()함수는 기본적으로 1씩 값을 감소시키며 step()함수를 사용하면 감소 폭을 변경할수 있다
    // 2씩 감소시키는 경우
    // '531' 출력
    for(i in 5 downTo 1 step 2) {
        Log.d("for downTo()함수", "downTo()함수와 step()함수 사용 출력 $i")
    }


    // 제네릭
    /**
     * 타입이 정의되어 있는 제네릭을 인자를 받는 예
     * java
     *
     * void processItems(List<String> items) {
     * }
     *
     * kotlin
     *
     * fun processItems(items : List<String>) {
     * }
     *
     * */

    /**
     * 호출 시점에 타입이 정해지는 제네릭을 인자로 받는 예
     * java
     * <T> void processItems(List<T> items) {}
     *
     * kotlin
     * fun <T> processItems(items: List<T>) {}
     *
     * */


    // 예외처리
    /**
     * java
     * public void checkAge(int age) {
     * if(age < 0) {
     *  throw new IllegalArgumentException("Invalid age:"+age);
     *  }
     * }
     *
     * kotlin
     * fun checkAge(age: Int) {
     *  if(age < 0) {
     *    throw IllegalArgumentException("Invalid age: $age")
     *  }
     * }
     * */
    val valid : Boolean = try {
        // 예외를 발생시킬 수 있는 코드들

        // 예외가 발생하지 않았을 경우 true반환
        true
    }catch (e : Exception) {
        // 예외가 발생했을 때 수행할 동작

        // false 반환
        false
    }finally {
        // 예외 발생 여부와 상관없이 수행할 동작
    }


    // 널 안정성
    // 코틀린에서는 별도 표기가 없으면 널 값을 허용하지 않는다
    // 널 값을 가지려면 명시적으로 타입 뒤에 ?를 붙여주어야한다
    val nullableString : String? = null
    val nonNullString : String = "ROO"

    // 널 값을 대신하는 방법  엘비스(?:) 연산자
    // foo 가 null이 아닐 경우에는 foo를 null 이라면 bar를 반환
    foo ?: bar

    // 널 값 확인과 처리를 한번에 안전한 호출(?.) 연산자
    // bar가 null이 아닐 경우에만 해당 값을 대입, 그렇지 않은 경우 null을 foo에 대입
//    val foo2 = bar?.baz
//    // foo2가 null이 아닐 경우에만 bar()호출
//    foo?.bar()

    // 또 다른 예제
    // Address.line1 은 널 값을 허용하지 않지만
    // address가 null인 경우 null을 반환하므로 값 line의 타입은 널 값을 허용해야 합니다.
//    val line : String? = contact.address?.line1

    // 위 예를 한 줄로 줄이면  - 엘비스(?:)연산자 사용
//    val contact : Contact = ...  // 주소록 객체
//    val line : String = contact.address?.line2 ?: "No address"


    // 안전한 자료형 변환  as? 연산자
    val asText : String = "foo"
    // bar가 널 값을 허용하도록 Int? 로 정의한다
    // 자료형 변환에 실패하므로 bar에는 널 값이 할당된다
    val bar2 : Int? = asText as? Int

    // 안전한 변환 연산자가 변환에 실패했을 떄 널값을 반환한다
    // 변환에 실패한 경우 기본값을 지정할 수 있다

    val bar3 : Int = asText as? Int ?: 0 // 자료형 변환에 실패할 경우 기본값을 0으로 지정




    // 널 값이 아님을 명시하기  비 널값  보증(!!)
    // 값 aa는 널 값을 포함할 수 있는 Foo 타입
//    val aa : Foo? =

    // 값 aa 는 널 값을 포함하지 않음을 보증
//    val nonNullab : Foo = aa!!

    // 값 aa가 널 값이 아님을 보장하면서 bar() 함수 호출
//    aa!!.bar()

    // 값 aa가 널 값이 아님을 보장하면서 baz 프로퍼티 접근
//    val myBaz = aa!!.baz




    /**
     * 나중에 초기화되는 변수를 위해 lateinit 키워드
     *
     * 코틀린은 널 값을 허용하지 않는 경우 초기화를 해 주거나 생성자를 통해 값을 초기화하도록 강제하지만
     * lateinit 키워드를 사용하면 초기화없이 변수만 선언 할 수 있다
     */
//    lateinit var api : Api



    // 코틀린 표준 라이브러리
    // 특정 값의 일치 여부 확인
    // check(), require()



    // 컬렉션 생성 함수
    /**
     * 배열
     * 특정 원소를 담고 있는 배열을 생성하려면 arrayOf()사용
     * val cities = arrayOf("Seoul","SYDNEY")
     *
     * String 타입의 빈 배열을 생성 emptyArray<String>()
     * 전달되는 인자가 없어 타입 추론이 불가하므로 함수 호출시 타입을 지정해야함
     * val emptyStringArray = emptyArray<String>()
     *
     * 크기가 3이고 널 값을 포함할 수 있는 배열을 생성
     * val nullStringArray = arrayOfNulls<String>(3)
     *
     *
     * --- 자바의 원시타입은 각 타입에 맞는 함수를 사용해야 한다
     * Boolean타입을 갖는 배열 - 자바의 boolean[] 배열과 호환
     * val boolArray = booleanArrayOf(false,true,true)
     *
     * Byte타입을 갖는 배열 - 자바의 byte[] 배열과 호환
     * val byteArray = byteArrayOf(0x00,0x01)
     *
     * Char타입을 갖는 배열 - 자바의 char[] 배열과 호환
     * val charArray = charArrayOf('a','b','c')
     * java - char[] chars = new char[]('a','b','c') 과 같음
     *
     * Double타입
     * val doubleArray = doubleArrayOf(0,1,2)
     *
     * Int 타입
     * val intArray = intArrayOf(0,1,2)
     *
     * long 타입
     * val longArray = longArrayOf(0,1,2)
     *
     * float 타입
     *
     * short 타입
     *
     *
     *
     * */


    // 리스트
    /**
     * 포함하는 요소를 읽을 수만 있고 수정할 수 없는 읽기 전용 리스트는 listOf()함수를 사용하여 생성가능
     *
     * listOf(vararg elements) // 인자로 받은 elements 를 포함하는 리스트를 반환
     * listOf(element) // 인자로 받은 element 요소 하나만을 갖는 반환
     * listOf() // 비어있는 읽기 전용 리스트
     *
     * 널 값은 구성하고 널이 아닌 값으로만 리스트를 구성하고 싶은 경우
     * listOfNotNull() 함수
     * ex) val listOfCountries = listOfNotNull(null) // 빈리스트를 생성
     *
     * val listOfCountries = listOfNotNull("Seoul","Sydney", null) // 널값은 무시하고 서울 시드니만 반환하는 리스트
     *
     *
     * 리스트에 포함된 요소를 수정할 수 있는 리스트 mutableListOf() 함수를 사용
     *
     *
     * ArrayList를 사용할 경우 arrayListOf() 함수를 사용
     *
     *
     * */


    // 맵  map
    /**
     *
     * 읽기 전용 맵 mapOf() 함수
     *
     * 수정할 수 있는 맵  mutableMapOf() 함수
     *
     * mapOf()함수나 mutableMapOf() 함수는 맵에 들어갈 요소를 모두 Pair 형태로 받는데
     * Pair를 만들 때 사용할 수 있는 표준 라이브러리 내 함수인 to()를 사용하면 직관적으로 표현이 간ㅇ
     *
     *  // Pair를 직접 사용하는 예
        val cities1 = mapOf(Pair("SEO", "Seoul"), Pair("TOK", "Tokyo"), Pair("NYI", "NewYork"))

        // 표준 라이브러리 내 함수인 to를 사용
        val cities2 = mapOf("SEO" to "Seoul", "TOK" to "Tokyo")


        // 보다 명시적인 타입의 맵을 사용하는 경우  hashMapOf(), linkedMapOf(), sortedMapOf()

     * */

    /**
     * 집합
     * 읽기 전용 집합은 setOf() 함수를 사용
     *
     * 요소를 수정가능한 집합은 mutableSetOf() 함수를 사용
     *
     * // 명시적인 타입의 집합을 사용시 hashSetOf(), linkedSetOf(), sortedSetOf()
     *
     * */


    /**
     * 스트림 함수
    */
    val cities = listOf("Seoul", "Tokyo")
    // 도시 이름을 대문자로 변환
    cities.map{ city -> city.toUpperCase()}
            .forEach{println(it)}

    // 도시 이름을 받아, 이를 각 이름의 문자열 길이로 변환
    cities.map{city -> city.length}
            .forEach { println("length=$it") }


    // mapIndexed() 함수를 사용하면 컬렉션 내 포함된 인자의 인덱스 값을 변환 함수 내에서 사용가능
    // 0부터 10까지 정수를 포함하는 범위
    val numbers = 0..10
    // 변환 함수에서 각 인자와 인덱스를 곱한 값을 반환
    numbers.mapIndexed { idx, number -> idx * number }
            .forEach { print("$it") }


    // mapNotNull() 은 컬렉션 내 각 인자를 변환함과 동시에, 변환한 결과가 널 값인 경우 무시한다
    val cities2 = listOf("Seoul", "Tokyo", "Mountain View")
    // 도시 이름의 길이가 5 이하일 경우에는 이를 그대로 반환하고, 그렇지 않은 경우 널 값을 반환
    cities2.mapNotNull { city -> if(city.length <= 5) city else null }
            .forEach { println(it) }
    // Moutain View 는 이름의 길이가 5를 초과하므로 변환 함수에서 null을 반환하여 출력에서 제외된다


    // flatMap() 함수는 map() 함수와 유사하게 컬렉션 내 인자를 다른 형태로 변환해주는 역할을 한다
    // 하지만 map()함수와 달리 flatMap() 함수는 변환 함수의 반환형이 Interable 이다. 하나의 인자에서
    // 여러 개의 인자로 매핑이 필요한 경우에 사용
    val numbers2 = 1..6
    // 1 부터 시작하여 각 인자를 끝으로 하는 범위를 반환
    numbers2.flatMap { number -> 1..number }
            .forEach { println("$it") }
    // 결과는 1 1 2 1 2 3 1 2 3 4 ~~~~


    // groupBy() 함수는 컬렉션 내 인자들을 지정한 기준에 따라 분류하며, 각 인자들의 리스트를 포함하는 맵 형태로 결과를 반환
    val cities3 = listOf("Seoul", "Tokyo", "Mountain View")
    // 도시 이름의 길이가 5 이하면 "A" 그룹에, 그렇지 않으면 "B" 그룹에 대입한다
    // 여기에서 지정하는 이름은 반환되는 맵의 키 이름으로 사용된다
    cities3.groupBy { city -> if(city.length <= 5) "A" else "B"}
            .forEach { key, cities3 -> println("key=$key cities=$cities3") }


    // 필터
    // filter() 함수는 컬렉션 내 인자들 중 주어진 조건과 일치하는 인자만 걸러주는 역할을 한다
    val cities4 = listOf("Seoul", "Tokyo", "Mountain View")
    // 도시 이름의 길이가 5 이하인 항목만 통과시킨다
    cities4.filter { city -> city.length <= 5 }
            .forEach { println(it) }


    // take() 함수 컬렉션 내 인자들 중 앞에서 take() 함수의 인자로 받은 개수만큼만을 인자로 갖는 리스트를 반환
    // takeLast() 함수는task() 함수와 반대로 뒤에서부터 반환
    // takeWhile() 함수는 첫 번째 인자부터 시작하여 주어진 조건을 만족하는 인자까지를 포함하는 리스트를 반환
    // takeLastWhile() 함수는 takeWhile() 함수와 반대로 뒤에서부터 반환
    val cities5 = listOf("Seoul","Tokyo","Mountain View", "NYC", "Singapore")
    // 첫 번째 인자로부터 하나의 인자만 포함하도록 한다
    cities5.take(1)
            .forEach { println(it) }

    // 마지막 인자로부터 두 개의 인자만 포함하도록 한다
    cities5.takeLast(2)
            .forEach { println(it) }

    // 문자열 길이가 5 이하인 조건을 만족할 때까지 해당하는 항목을 반환
    cities5.takeWhile { city -> city.length <= 5 }
            .forEach { println(it) }

    // 뒤에서부터 시작하여, 문자열의 길이가 13 미만인 조건을 만족할 때까지 해당하는 항목을 반환
    cities5.takeLastWhile { city -> city.length < 13 }
            .forEach { println(it) }


    // drop() 함수는 take() 함수의 반대 역할을 하며, 조건을 만족하는 항목을 컬렉션에서 제외한 결과를 반환
    // 첫 번째 인자로부터 하나의 인자를 제외한다
    cities5.drop(1)
            .forEach { println(it) }

    // 마지막 인자로부터 두 개의 인자를 제외한다
    cities5.dropLast(2)
            .forEach { println(it) }

    // 문자열의 길이가 5이하인 조건을 만족할때까지 해당하는 항목을 제외한다
    cities5.dropWhile { city -> city.length <= 5 }
            .forEach { println(it) }

    // 뒤에서부터 시작하여, 문자열의 길이가 13미만인 조건을 만족할 때까지 해당하는 항목을 제외한다
    cities5.dropLastWhile { city -> city.length < 13 }
            .forEach { println(it) }


    // first() 함수 컬렉션 내 첫번째 인자를 반환
    val cities6 = listOf("Seoul","Tokyo","Mountain View", "NYC", "Singapore")

    // 첫번째 인자를 반환
    println(cities6.first())

    // 마지막 인자를 반환
    println(cities6.last())

    // 문자열 길이가 5 이상인 첫 번째 인자를 반환
    println(cities6.first{city -> city.length > 5 })

    // 문자열 길이가 5 이상인 마지막 인자를 반환
    println(cities6.last{city -> city.length > 5})

    try {
        // 조건을 만족하는 첫 번째 인자를 반환하며, 없을 경우 널 값을 반환
        cities6.first() {city -> city.isEmpty()}
    }catch (e : NoSuchElementException) {
        println("Not Found")
    }

    try {
        // 조건을 만족하는 마지막 인자를 반환하며, 없을 경우 널 값을 반환
        cities6.last() {city -> city.isEmpty()}
    }catch (e : NoSuchElementException) {
        println("Not Found")
    }

    // 조건을 만족하는 첫 번째 인자를 반환하며, 없을 경우 널 값을 반환
    println(cities6.firstOrNull{ city -> city.isEmpty()})

    // 조건을 만족하는 마지막  인자를 반환하며, 없을 경우 널 값을 반환
    println(cities6.lastOrNull{ city -> city.isEmpty()})


    // distinct() 함수는 컬렉션 내에 포함된 항목 중 중복된 항목을 걸러낸 결과를 반환
    // 항목의 중복 여부는 equals()로 판단하며, distinctBy() 함수를 사용하면
    // 비교에 사용할 키 값을 직접 설정할 수 있다
    val cities7 = listOf("Seoul","Tokyo","Mountain View", "NYC", "Singapore", "Seoul","Tokyo")

    // 도시 목록 중 중복된 항목을 제거한다
    cities7.distinct()
            .forEach { println(it) }

    // 중복된 항목을 판단할 때, 도시 이름의 길이를 판단 기준으로 사용한다
    cities7.distinctBy { city -> city.length }
            .forEach { println(it) }


    // 조합 및 합계
    // zip() 함수는 두 컬렉션 내의 자료들을 조합하여 새로운 자료를 만들 때 사용한다
    // 두 컬렉션 간 자료의 개수가 달라도 사용할 수 있으며, 이 경우에는 조합에 사용하는 컬렉션의 자료의 수 중 더 적은 쪽의 개수로
    // 반환하게 된다
    // 도시코드를 담은 리스트로, 4개의 자료를 가지고 있다
    val cityCodes = listOf("SEO","TOK","MTV","NYC")
    // 도시이름을 담은 리스트로 3개의 자료를 가지고 있다
    val cityNames = listOf("SEOUL","TOKYO","Mountain View")
    // 단순히 zip함수를 호출하는 경우, Pair 형태로 자료를 조합한다
    cityCodes.zip(cityNames)
            .forEach { pair -> println("${pair.first}:${pair.second}") }

    // 조합할 자료의 타입을 조합 함수를 통해 지정하면 해당 형태로 바꿔준다
    cityCodes.zip(cityNames) {code, name -> "$code ($name)"}
            .forEach { println(it) }


    // joinToString() 함수는 컬렉션 내 자료를 문자열 형태로 변환함과 동시에, 이를 조합하여 하나의 문자열로 생성
    // 컬렉션 내 자료를 간단히 직렬화할 때 매우 유용하게 사용할 수 있다
    val cities8 = listOf("Seoul","Tokyo","Mountain View", "NYC", "Singapore")

    // 기본 설정값을 사용하여 문자열 형태로 조합
    println(cities8.joinToString())

    // 구분자로 다른 문자를 사용하도록 한다
    // 구분자 이외에도 다른 설정을 변경할 수 있다
    println(cities8.joinToString(separator = "|"))


    // count() 함수는 컬렉션 내 포함된 자료의 개수를 반환
    val cities9 = listOf("Seoul","Tokyo","Mountain View", "NYC", "Singapore")

    // 컬렉션 내 포함된 모든 자료의 개수를 반환
    println(cities9.count())

    // 컬렉션 내 포함된 자료 중, 길이가 5 이하인 자료의 개수를 반환
    println(cities9.count { city -> city.length <= 5 })


    // any() 함수   컬렉션 내 단 하나의 자료라도 존재하면 true를, 그렇지 않으면 false를 반환
    val cities10 = listOf("Seoul","Tokyo","Mountain View", "NYC", "Singapore")

    // cities10 리스트 내에 자료가 존재하는지 확인
    println(cities10.any())

    // 문자열 길이가 5 이하인 자료가 있는지 확인
    println(cities10.any{city -> city.length <= 5})


    // none() 함수는 any() 함수와 반대 작업을 수행, 컬렉션이 비어있으면 true를 반환
    println(cities10.none())

    // 빈 문자열을 가진 자료가 존재하지 않는지 확인
    println(cities10.none{city -> city.isEmpty()})

    // max() 와 min() 함수는 숫자 타입의 자료를 갖는 컬렉션 내에서 사용
    val numbers3 = listOf(1,2,3,4,5,6,7,8)
    // 최댓값을 리턴
    println(numbers3.max())
    // 최솟값을 리턴
    println(numbers3.min())


    // average()함수는 숫자 타입의 컬렉션 내에서 평균을 반환
    println(numbers3.average())


    // let()함수 - 이 함수를 호출한 객체를 이어지는 함수 블록의 인자로 전달, 불필요한 변수 선언을 방지할 수 있다
    

    // 가변인자를 받는 메서드
    // 자바에서 생성된 메서드를 호출할 경우 스프레드 연산자(*)를 사용하여 인자를 전달해야한다
    val a = ArrayTest() // 자바클래스

    // 자바 원시 타입인 int형 배열이므로 intArray를 사용
    val intArgs = intArrayOf(1,2,3,4,5)
    // 스프레드 연산자를 사용하여 인자를 전달한다
    a.doSomething(*intArgs)

    // 객체 타입 배열이므로 일반 배열을 사용한다
    val strungArgs = arrayOf("Lorem", "Ipsum")

    // 스프레드 연산자를 사용하여 인자를 전달
    a.doSomething(*strungArgs)


    // Object클래스 내 메서드
    // 자바의 Object 클래스는 코틀린에서는 Any클래스로 처리된다
    // 코틀린의 Any클래스에서 지원하는 멤버 함수는 toString(), hashCode(), equals()



    /**
     * SAM 변환
     * 예 뷰의 클릭리스너를 지정하는 메서드인 setOnClickListener를 든다면
     * java
     * Button button = ...
     * button.setOnClickListener(new View.OnClickListener() {
     *  @Override
     *  public void onClick(View v) {
     *      ...
     *  }
     * });
     *
     * 코틀린으로 그대로 변환하면
     * val button = ...
     * button.setOnClickListener(object: View.OnClickListener {
     *      override fun onClick(v: View) {
     *
     *      }
     * });
     *
     * 이 경우 SAM 변환이 지원되므로 클릭 인터페이스 구현없이 변경할 수 있따
     * val button = ...
     * // onClick() 함수는 View를 인자로 받고 아무 것도 반환하지 않으므로(void)
     * // 다음과 같이 함수형으로 표현할 수 있다
     * button.setOnClickListener({view: View -> Unit
     *    ....
     *
     * })
     *
     * 
     * */

}


// while 문
fun whileTest() {

    var a: Int = 0
    var b: Int = 10

    while( a < b ) {
        Log.d("While Number", "a=$a b=$b")
        a+=2
        b++
    }

    // do while 문
    var c: Int = 0
    var d: Int = 10

    do{
        Log.d("do while Numebr", "a=$a b=$b")
        a+=2
        b++
    }while ( a < b )

}

// when 문
fun whenTest() {

    /**
     * java
     *
     *
        int bags = 1;
        switch(bags) {
            case 0: {

                break;
            }
            case 1: {
                break;
            }
            case 2: // 여러 케이스의 경우 이런식으로 표현한다 break없이 다음 케이스로 이동하도록
            case 3: {

                break;
            }
            default : {

            }

        }
     * */
    val bags: Int = 1

    when(bags) {
        // 각 case 에 해당하는 값만 적는다
        0 -> {
            Log.d("when test", "0")
        }
        1 -> {
            Log.d("when test", "1")
        }
        // 여러 개의 case는 쉼표로 구분하여 적는다
        2, 3 -> {
            Log.d("when test", "2,3")
        }
        // default 대신에 else 로 표현한다
        else -> {
            Log.d("when test", "else ")
        }
    }

}

fun printTypeName(obj:Any) {
    if(obj is Int) {
        Log.d("Type", "Integer")
    }else if(obj is Float) {
        Log.d("Type", "Float")
    }else if(obj is String) {
        Log.d("Type", "String")
    }else {
        Log.d("Type", "Unknown Type")
    }
}



fun sum(x: Int): Int {
    var result = 0

    result = x + x;

    return result
}

fun getLength(text: Any): Int {

    var result = 0;

    if(text is String) {
        result = text.length
    }

    return result
}

fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass() {
}

