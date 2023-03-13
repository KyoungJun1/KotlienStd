class main() {

    /*
        9강 코틀린에서 클래스를 다루는 방법
     */


}

// 생성자를 안에 작성하지 않고 메소드 처럼 생성자를 선언하면서 받을 수 있음 constructor 생략
//class Person constructor(val .....
//받는파라미터 하나하나를 프로퍼티라고 함
class Person(
    val name: String,
    var age: Int
) {
    // 초기화하면서 검증을 하고 싶을 때 주로 사용, 클래스가 생성될 때 들림
    init {
        if (age <= 0) {
            throw Exception("나이는 ${age}")
        }
    }

    //여러 방향의 생성자를 선언할 시 constructor를 직접 안에서 명시해야함
    // ***&반드시 주생성자는 존재해야한다. (클래스 이름 옆에 선언)
    // 클래스의 파라미터가 하나도 없을 경우 주생성자도 생략 가능
    // 부생성자는 주생성자를 this로 가르켜야함.
    constructor(name: String) : this(name, 1)
    constructor(name: String) : this(name, 1) {
        //body를 가질 수 있음
    }

    //부생성자보다 defalut 파라미터를 추천한다.
    //getter , setter
    fun isAdult() : Boolean{
        return this.age >= 20
    }

    //객체의 속성을 나타낼 때는 custom getter 아닐 시 함수
    val isAudlt : Boolean
        get() = this.age >= 0  // return this.age >= 0


    /*
    val name : Stirng = name
    get() = name.uppercase()
*/}






