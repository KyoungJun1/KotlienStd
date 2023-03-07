import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    /*
      2강 코틀린에서 null을 다루는 방법
     */

    //Safe Call (Null 방지)
    val str : String? = "ABC"
    //println(str.length)
    println(str?.length)

    //Elvis 연산자 ( 앞의 연산결과가 null이면 뒤의 값을 사용 )
    val str2 : String? = null
    println(str2?.length ?:0)


    /*
       java에 있는 어노테이션을 이해하므로 맞춰서 사용 가능
       javax.annotation
       android.support.annotation
       org.jebrains.annotation

       java 객체에 null 가능 여부가 어노테이션이 없다면 런타임단에서 null
       null의 여부를 알수 없을 때 해당 타입을 플랫폼타입이라 함
    * */
    val persion = Person("공부하는 김경준")
    startWithA5(persion.name)

}

fun startWithA5(str : String ) :Boolean{
    return str.startsWith("A")
}

fun startWithA4(str : String?) : Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("NULL")
}

// NULL 이 가능한 타입을 완전이 다르게 취급한다
fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null 들어옴")
    }
    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}
fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}
fun startWith(str : String?) : Boolean{
    return str!!.startsWith("A")
}