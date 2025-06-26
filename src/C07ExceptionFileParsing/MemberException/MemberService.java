package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

// 핵심 로직을 구현하는 계층
// 객체의 조립은 보통 Service가 담당
public class MemberService {
    private MemberRepository memberRepository;

    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    //    회원가입
    public void register(String name, String email, String password) throws EmailAlreadyExistsException {
//        이메일이 중복일 경우 예외 발생
        //        DB에 이메일이 중복일경우 예외 발생
        if(memberRepository.findMember(email).isPresent()){
            throw new IllegalArgumentException("이메일 중복입니다.");
        }
//        객체를 조립후 repository를 통해 register
        Member member = new Member(name, email, password);
        memberRepository.register(member);
//        객체를 조립 후 repository를 통해 register 호출
    }

    //    회원 상세 조회
    public Member findMember(Long id) throws NoSuchElementException {
//        Optional 객체에 값이 없을 경우 예외 발생. 있으면 Member를 꺼내서 return.
        return memberRepository.findMember(id).orElseThrow(()->new NoSuchElementException("해당 ID가 존재하지 않습니다."));
    }

    public Member findMember(String email) throws NoSuchElementException {
        return memberRepository.findMember(email).orElseThrow(()->new NoSuchElementException("해당 이메일이 존재하지 않습니다."));
    }

    //    회원 목록 조회
    public List<Member> findAll() {
        return this.memberRepository.findAll();
    }

    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Member member = this.memberRepository.findMember(email).orElseThrow(() -> new NoSuchElementException("없는 이메일입니다."));

        if (!member.getPassword().equals(password)) {
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
    }
}
