
fun main(args: Array<String>) {

    /*
        5강 코틀린에서 제어문을 다루는 방법
    */
    val score = 50
    //코틀린에서의 포함 여부
    if(score in 0..100){
        println("1")
    }

    //switch와 when
    when (score / 10){
        in 3..10 -> println("1")
        11 -> "A"
        12 -> "B"
        1,2,3 -> println("2")
        //....
        else -> "D"
    }

    //들어온 값이 when에 일치하는지 검사한다
    when {
        score == 0 -> println("1")
        score % 2 == 0 -> println("2")
        // ..
        else -> println("3")
    }

}



    //함수에서 Unit(void) 생략
    fun valIf(score :Int){
        if(score < 0){
            throw IllegalArgumentException("${score} 크기")
        }
    }
    //java 에선 if-> statment   코틀린 에선 if-> Expression
    //statment : 하나의 값으로 도출 x (java 에선 삼항 연산자로 대체할 수 있음)
    //Expression : 하나의 값으로 도출되는 문장
    fun getPorF(score : Int) : String{
        return if(score >= 50){
             "P"
        }else{
             "F"
        }
    }

