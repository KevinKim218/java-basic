package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
/*
생성자 장점:
- 중복 호출 제거
- 제약(생성자 호출 필수)
    - 생성자를 사용하면 프로그래밍 언어 차원에서 필수값 입력을 보장할 수 있다.
 */