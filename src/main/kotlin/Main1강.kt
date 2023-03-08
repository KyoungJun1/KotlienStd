fun main(args: Array<String>) {

    //println("Hello World!")
    //println("Program arguments: ${args.joinToString()}")


    /*
    1강 변수 선언 키워드 - var 과 val 차이점
      */
    //가변
    var number1 = 10L
    number1 = 15L
    //불변
    val number2 = 10L
    //불변 변경 시 error
    //number2 = 15L

    //타입은 의무적으로 작성해주지 않아도 자동으로 판단
    var number3: Long = 10L

    //초기화하지 않은 변수는 타입을 판단할 수 없으므로 Error
    //var number4

    //출력
    println(number1)

    //모든 변수를 val 로 만들고 꼭 필요한 경우에만 var로 변경 추천

    /*
     1강 변수 선언 키워드 - Kotlin에서의 Primitive Type
      Primitive Type : char, byte, int 등 일반 값 자료형으로 실값을 저장하는 타입
      Reference Type : 객체? 번지를 참조하는 타입으로 메모리 번지값을 통해 객체 참조
      크게 대문자 Long을 사용하지만 실제 동작 시에는 상황에 따라 필요할 때 Primitive로 알맞게 사용된다.
    */
     var number5 = 10L
     var number6 = 1_000L;

    /*
      코틀린은 기본적으로 Null이 들어갈 수 없다
      Null를 사용할려면 Type?를 사용해야한다.( 아예 다른 타입으로 간주 )
     */
     var number7 = null
     var number8 : Long? = null

    /*
        코틀린에서는 객체를 인스턴스화할 때에는 new를 사용x
     */
     var person = Person("김경준", 100)


}

class Person(s: String, i: Int) {

    val name: String
        get() {
            TODO()
        }
    val age : Int
        get(){
            TODO()
        }

}
