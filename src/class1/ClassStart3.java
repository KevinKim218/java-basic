package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // student1, student2의 참조값 확인
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);
    }
}
/*
클래스와 사용자 정의 타입:
- 타입은 데이터의 종류나 형태를 나타낸다.
- int라고 하면 정수 타입, String이라고 하면 문자열 타입이다.
- 학생(Student)이라는 타입을 만들면 되지 않을까?
- 클래스를 사용하면 int, String과 같은 타입을 직접 만들 수 있다.
- 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
- 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
- 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.

용어: 클래스, 객체, 인스턴스
클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
둘 다 같은 의미로 사용되며 여기서는 학생(Student) 클래스를 기반으로 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.

객체가 가지고 있는 멤버 변수에 값을 대입하려면 먼저 객체에 접근해야 한다.
객체에 접근하려면 .(점, dot) 키워드를 사용하면 된다. 이 키워드는 변수(student1)에 들어있는 참조값을 읽어서 메모리에 존재하는 객체에 접근한다.
*/