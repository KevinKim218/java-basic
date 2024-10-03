package ref;

/*
class1 패키지의 Student 클래스를 사용하게 되면 "import class1.Studet;" 가 선언된다.
이렇게 되면 class1 패키지에서 선언한 Student를 사용하게 되는건데, 이러한 경우 접근 제어자 때문에 컴파일 오류가 발생할 수 있다.
 */
public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
