import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.Exception
import java.lang.NullPointerException

fun main(args: Array<String>) {
    /*
        7강 코틀린에서 예외를 다루는 방법
     */


    //try catch finally 구문은 문법적으로 동일
    //코틀린에선 try catch가 expression

    fun parseIntThrow(str: String): Int {
        try {
            return str.toInt()
        } catch (e: NullPointerException) {
            throw NullPointerException("주어진 ${str} 그냥 exception 덩어리다")
        }
    }

    fun paresIntThrow2(str: String): Int? {
        return try {
            str.toInt()
        } catch (e: NullPointerException) {
            null
        }
    }

    //해당 메소드는 File을 사용함으로써 java 에선 IOException 처리를 해야했어야함.
    //코틀린에서는 checked Exception 과 Uchecked Exception을 구분하지 않는다. 모두 Uncheck
    fun readFile1() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    //try with resourse 는 코틀린에서 존재하지 않으며 use로 사용
    fun readFile2(path : String) {
        BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }
    }


}