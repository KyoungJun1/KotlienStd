fun main(args: Array<String>) {

    //println("Hello World!")
    //println("Program arguments: ${args.joinToString()}")


    /*
    1�� ���� ���� Ű���� - var �� val ������
      */
    //����
    var number1 = 10L
    number1 = 15L
    //�Һ�
    val number2 = 10L
    //�Һ� ���� �� error
    //number2 = 15L

    //Ÿ���� �ǹ������� �ۼ������� �ʾƵ� �ڵ����� �Ǵ�
    var number3: Long = 10L

    //�ʱ�ȭ���� ���� ������ Ÿ���� �Ǵ��� �� �����Ƿ� Error
    //var number4

    //���
    println(number1)

    //��� ������ val �� ����� �� �ʿ��� ��쿡�� var�� ���� ��õ

    /*
     1�� ���� ���� Ű���� - Kotlin������ Primitive Type
      Primitive Type : char, byte, int �� �Ϲ� �� �ڷ������� �ǰ��� �����ϴ� Ÿ��
      Reference Type : ��ü? ������ �����ϴ� Ÿ������ �޸� �������� ���� ��ü ����
      ũ�� �빮�� Long�� ��������� ���� ���� �ÿ��� ��Ȳ�� ���� �ʿ��� �� Primitive�� �˸°� ���ȴ�.
    */
     var number5 = 10L
     var number6 = 1_000L;

    /*
      ��Ʋ���� �⺻������ Null�� �� �� ����
      Null�� ����ҷ��� Type?�� ����ؾ��Ѵ�.( �ƿ� �ٸ� Ÿ������ ���� )
     */
     var number7 = null
     var number8 : Long? = null

    /*
        ��Ʋ�������� ��ü�� �ν��Ͻ�ȭ�� ������ new�� ���x
     */
     var person = Person("�����", 100)


}

class Person(s: String, i: Int) {

    val name: String
        get() {
            TODO()
        }
    val age : Int
        get(){
            TODO()
        }

}
