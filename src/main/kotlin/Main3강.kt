
fun main(args: Array<String>) {


    /*
        3강 코틀린에서 Type을 다루는 방법
     */

    // 1. 코틀린에서는 선언된 기본값을 보고 타입을 추론한다.
    // L이 붙을 경우 Long, 없을 경우 Int
    // .0f가 붙을 경우 Float, 없을 경우 Double

    //코틀린에서의 타입 변환은 명시적으로 이루어져야 한다.
    val number1 = 4
    //val numver2 : Long = number1 //Type mismatch

    //to??? to타입 변환타입 제공
    val number2 = 3
    val number3 : Long = number1.toLong()

    val number4 = 3
    val number5 = 5
    val result = number4 / number5.toDouble()
    println(result)

    //number6 에 null값이 들어올 수 있을 시 Error
    val number6 : Int? = 3
    val number7 : Long = number6?.toLong() ?: 0

}

    //2. 타입 캐스팅
    //is == instansof
    // (Persion) == as
    //
fun printAgeIfPerson(obj : Any){
    if(obj is Person){
        //val person = obj as Person //(as Person 생략 가능)
        //스마트 캐스트 (if에서 타입체크를 해주므로써 Person으로 변환될수있는지 확인)
        println(obj.name)
    }

fun printAgeIfPerson(obj :Any){
    val person = obj as? Person // as? --> null이 아니라면 Person, null인경우 전체 null
    println(person?.name)
}
    //value is Type : value가 Type 이면 true 아니면 false
    //value !is Type : 반대
    //value as Type : value가 Type 이면 Type으로 타입 캐스팅 아니면 예외
    //value as? Type : value가 Type이면 타입캐스팅 null이면 null Type이 아니면 null
}