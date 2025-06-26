package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

// 저장소 역할을 하는 계층
// 실제로는 DB에 CRUD를 수행하는 계층, 현재는 DB가 없기 때문에 원래의 역할을 하는 클래스는 아님.
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

    //    회원 가입
    public void register(Member member) {
        memberList.add(member);
    }

    //    회원 상세 조회
    public Optional<Member> findMember(Long id) {
        return memberList.stream().filter(m -> Objects.equals(m.getId(), id)).findFirst();
    }

    public Optional<Member> findMember(String email) {
        return memberList.stream().filter(m -> m.getEmail().equals(email)).findFirst();
    }

    //    회원 목록 조회
    public List<Member> findAll() {
        return memberList;
    }
}
