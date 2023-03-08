import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.NullPointerException

fun main(args: Array<String>) {
    /*
        8강 코틀린에서 함수를 다루는 방법
     */

    //= 을 사용하여 전체하나로 묶을 수 있다. 반환타입 생략
    fun max(a: Int, b: Int): Int = if (a > b) a else b

    //java 는 오버로딩 시 여러 메소드를 작성해야함
    //메서드 작성 시 고정으로 변수에 값을 넣고 시작함으로써 값이 안들어올 경우 기본값으로 사용
    fun repeat(str : String, num : Int = 3, userNewLine : Boolean = true){
        for(i in 1..num){
            if(userNewLine){
                println(str)
            }else{
                println(str)
            }
        }
    }
    repeat("a")
    repeat("aa" , 5, true)

    //해당 경우엔 default 값의 변수를 입력하고 싶지 않을 때 다른 default 변수에 변수명을 선언함으로써 사용
    repeat("a", userNewLine = false)
    //코틀린에서는 java 함수를 가져다 사용할 때 named argument를 사용할 수 없다.
    
    //Stirng ... 코틀린으로 사용
    fun printAll(vararg strings : String){
        for(str in strings){
            println(str)
        }
    }
    printAll("a","b","c")

    //String을 받지만 배열을 집어넣을 때 *을 넣어줌으로써 하나씩 꺼내 사용할 수 있다.
    val array = arrayOf("a","b","c")
    printAll(*array)
}
