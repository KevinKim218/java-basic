package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        // this.nameField = nameParameter; 앞에 항상 this.를 붙여도 상관 없음
        // 이러한 방식은 멤버 변수를 사용하는지, 아닌지를 직관적으로 알 수 있다.
    }
}
