
fun main(args: Array<String>) {

    /*
        6강 코틀린에서 반복문을 사용하는 방법
     */
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers){
        println(number)
    }
    
    //반복
    for(i in 1..3){
        println(i)
    }
    for(i in 3 downTo 1){
        println(i)
    }
    for(i in 1..5 step 2){
        println(i)
    }

    //..연산자는 범위를 만듬 (등차수열) 1)시작값 2) 끝값 3) 공차
}
