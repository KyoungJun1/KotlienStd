fun main(args: Array<String>) {

    /*
      4강 코틀린에서 연산자를 다루는 방법
     */
    val money1 = 1
    val money2 = 2

    // 코틀린에선 비교 연산자로도 compareTo 비교를 자동으로 해준다.
    if (money1 < money2) {
        println("1")
    }

    //동등성 : 두 객체의 값이 같은가?
    //동일성 : 두 객체가 동일한 객체인지 (주소가 같은지)
    //코틀린은 == 으로도 등등성 즉 equals 처럼 사용할 수 있다.
    val money3 = 1000L
    val money4 = money3
    val money5 = 1000L
    if (money3 == money4) {
        println("1")
    }
    if (money3 == money5) {
        println("1")
    }
    //논리 연산자
    // java 와 완전히 동일
    if(fun1()|| fun2()){
        println("fun fun1")
    }
    if(fun1() && fun2()){
        println("fun fun2")
    }

    //in, !in
    //컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다

    //a..b
    //a부터 b까지 범위 객체를생성한다

    //a[i]
    // a에서 특정 index를 가져온다.
    //a[i] = b
    // a특정인덱스에 b를 넣는다.

    //코틀린에선 객체마다 연산자를 직접 정의한다.
}


fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
