package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0 ; i < studentNames.length ; i++) {
            System.out.println("이름: " + studentNames[i] + ", 나이: " + studentAges[i] + ", 성적: " + studentGrades[i]);
        }
    }
}
/*
배열을 사용해서 코드 반복이나 변경은 최소화 했지만, 한 학생에 대한 데이터가 3개의 배열로 분할되어 있기 때문에
한 학생의 데이터를 관리하기 위해서는 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 하는데, 이는 실수할 확률이 매우 높아진다.
이러한 문제점을 해결하기 위해 클래스라는 개념을 이용한다.
*/