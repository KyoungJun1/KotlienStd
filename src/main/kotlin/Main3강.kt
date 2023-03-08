
fun main(args: Array<String>) {


    /*
        3�� ��Ʋ������ Type�� �ٷ�� ���
     */

    // 1. ��Ʋ�������� ����� �⺻���� ���� Ÿ���� �߷��Ѵ�.
    // L�� ���� ��� Long, ���� ��� Int
    // .0f�� ���� ��� Float, ���� ��� Double

    //��Ʋ�������� Ÿ�� ��ȯ�� ��������� �̷������ �Ѵ�.
    val number1 = 4
    //val numver2 : Long = number1 //Type mismatch

    //to??? toŸ�� ��ȯŸ�� ����
    val number2 = 3
    val number3 : Long = number1.toLong()

    val number4 = 3
    val number5 = 5
    val result = number4 / number5.toDouble()
    println(result)

    //number6 �� null���� ���� �� ���� �� Error
    val number6 : Int? = 3
    val number7 : Long = number6?.toLong() ?: 0
    
    //3. Kotlin Ư�� Ÿ�� 3����
    // 3-1 Any
    // - java Object ���� (��� ��ü �ֻ���)
    // - ��� Primitvive Type �� �ֻ� Ÿ�Ե� Any 
    // - Anty ��ü�δ� null�� ������ �� ������ null�� �����ҷ��� Any?�� ����
    // - Any �� equals / hashCode / toString ����

    // 3-2 Unit
    // - Java �� void�� ������ ����
    // - void �� �ٸ��� Unit�� �� ��ü�� Ÿ�� ���ڷ� ��� ����
    // - �Լ��� ���α׷��ֿ��� Unit�� �� �ϳ��� �ν��Ͻ��� ���� Ÿ���� �ǹ��Ѵ�. ���� �����ϴ� Ÿ��

    // 3-3 Nothing
    // - �Լ��� ���������� ������ �ʾҴٴ� ����� ǥ���ϴ� ����
    // - ������ ���ܸ� ��ȯ�ϴ� �Լ�, ���� ���� �Լ� ��

    //String Ÿ�� ���
    //val person = Person("�����",100)
    //println("�̸� : ${person.name}")

    
    //�����̸��� ����ϴ��� ${����} �� ����ϴ� ���� ������, �ϰ� ��ȯ, ���Խ� Ȱ�� ���鿡�� ������
    val name = "�����"
    println("�̸� : $name")
    
    val str = """
        ���̸�
        ��������
        ${name}
    """.trimIndent()
    println(str)

    //JAVA �迭ó�� ��� ����
    var str2 = "ABC"
    println(str2[0])
}

    //2. Ÿ�� ĳ����
    //is == instansof
    // (Persion) == as
    //


fun printAgeIfPerson(obj : Any) {
    if (obj is Person) {
        //val person = obj as Person //(as Person ���� ����)
        //����Ʈ ĳ��Ʈ (if���� Ÿ��üũ�� ���ֹǷν� Person���� ��ȯ�ɼ��ִ��� Ȯ��)
        println(obj.name)
    }

    fun printAgeIfPerson(obj: Any) {
        val person = obj as? Person // as? --> null�� �ƴ϶�� Person, null�ΰ�� ��ü null
        println(person?.name)
    }
}
    //value is Type : value�� Type �̸� true �ƴϸ� false
    //value !is Type : �ݴ�
    //value as Type : value�� Type �̸� Type���� Ÿ�� ĳ���� �ƴϸ� ����
    //value as? Type : value�� Type�̸� Ÿ��ĳ���� null�̸� null Type�� �ƴϸ� null
