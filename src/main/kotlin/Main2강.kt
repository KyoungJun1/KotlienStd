import java.lang.IllegalArgumentException

fun main(args: Array<String>) {

    /*
      2�� ��Ʋ������ null�� �ٷ�� ���
     */

    //Safe Call (Null ����)
    val str : String? = "ABC"
    //println(str.length)
    println(str?.length)

    //Elvis ������ ( ���� �������� null�̸� ���� ���� ��� )
    val str2 : String? = null
    println(str2?.length ?:0)


    /*
       java�� �ִ� ������̼��� �����ϹǷ� ���缭 ��� ����
       javax.annotation
       android.support.annotation
       org.jebrains.annotation

       java ��ü�� null ���� ���ΰ� ������̼��� ���ٸ� ��Ÿ�Ӵܿ��� null
       null�� ���θ� �˼� ���� �� �ش� Ÿ���� �÷���Ÿ���̶� ��
    * */
    val persion = Person("�����ϴ� �����")
    startWithA5(persion.name)

}

fun startWithA5(str : String ) :Boolean{
    return str.startsWith("A")
}

fun startWithA4(str : String?) : Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("NULL")
}

// NULL �� ������ Ÿ���� ������ �ٸ��� ����Ѵ�
fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null ����")
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