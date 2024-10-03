package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
/*
NullPointerException은 이름 그대로 null을 가리키다(Pointer)인데, 이때 발생하는 예외(Exception)이다.
null은 없다는 뜻이므로 결국 주소가 없는 곳을 찾아갈 때 발생하는 예외이다.
객체를 참조할 때는 .(dot)을 사용한다. 이렇게 하면 참조값을 사용해서 해당 객체를 찾아갈 수 있다.
그런데 참조값이 null이라면 값이 없다는 뜻이므로 찾아갈 수 있는 객체(인스턴스)가 없다.
NullPointerException은 이처럼 null에 .(dot)을 찍었을 때 발생한다.
 */