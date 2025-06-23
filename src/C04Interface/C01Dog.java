package C04Interface;

public class C01Dog implements C01AnimalInterface1, C01AnimalInterface2 {

    @Override
    public void makeSound() {
        System.out.println("멍멍멍ㅁ어멍머엉머어엉머ㅓ어어머엄어멍");
    }

    @Override
    public String play(String a, String b) {
        return a + "와 " + b + "가 산책합니다.";
    }
}
