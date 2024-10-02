package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        /*
        "자바에서 대입은 항상 변수에 들어 있는 값을 복사한다."
        student1, student2 에는 참조값이 보관되어 있다. 따라서 이 참조값이 배열에 저장된다.
        또는 student1, student2에 보관된 참조값을 읽고 복사해서 배열에 대입한다고 표현한다.
         */

        Student[] students = {student1, student2}; // Student[] students = new Student[] {student1, student2}; 도 가능하다.


        for (int i = 0 ; i < students.length ; i++) {
            System.out.println("이름: " + students[i].name + ", 나이: " + students[i].age + ", 성적: " + students[i].grade);
        }

        // 위 for 구문을 한 번 더 최적화 하면 아래의 코드처럼 바꿀 수 있다.
        for (int i = 0 ; i < students.length ; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

        // 위 for 구문을 for-each 구문을 이용해서 한 번 더 최적화 할 수 있다.
        // for-each 구문 단축키 iter
        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
