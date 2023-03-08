
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
    
    //3. Kotlin 특이 타입 3가지
    // 3-1 Any
    // - java Object 역할 (모든 객체 최상위)
    // - 모든 Primitvive Type 의 최상 타입도 Any 
    // - Anty 자체로는 null을 포함할 수 없ㅎ어 null을 포함할려면 Any?로 포함
    // - Any 에 equals / hashCode / toString 존재

    // 3-2 Unit
    // - Java 의 void와 동일한 역할
    // - void 와 다르게 Unit은 그 자체로 타입 인자로 사용 가능
    // - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미한다. 실제 존재하는 타입

    // 3-3 Nothing
    // - 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
    // - 무적건 예외를 반환하는 함수, 무한 루프 함수 등

    //String 타입 사용
    //val person = Person("김경준",100)
    //println("이름 : ${person.name}")

    
    //변수이름만 사용하더라도 ${변수} 를 사용하는 것이 가독성, 일괄 변환, 정규식 활용 측면에서 긍정적
    val name = "김경준"
    println("이름 : $name")
    
    val str = """
        에이맨
        에이이이
        ${name}
    """.trimIndent()
    println(str)

    //JAVA 배열처럼 사용 가능
    var str2 = "ABC"
    println(str2[0])
}

    //2. 타입 캐스팅
    //is == instansof
    // (Persion) == as
    //


fun printAgeIfPerson(obj : Any) {
    if (obj is Person) {
        //val person = obj as Person //(as Person 생략 가능)
        //스마트 캐스트 (if에서 타입체크를 해주므로써 Person으로 변환될수있는지 확인)
        println(obj.name)
    }

    fun printAgeIfPerson(obj: Any) {
        val person = obj as? Person // as? --> null이 아니라면 Person, null인경우 전체 null
        println(person?.name)
    }
}
    //value is Type : value가 Type 이면 true 아니면 false
    //value !is Type : 반대
    //value as Type : value가 Type 이면 Type으로 타입 캐스팅 아니면 예외
    //value as? Type : value가 Type이면 타입캐스팅 null이면 null Type이 아니면 null
