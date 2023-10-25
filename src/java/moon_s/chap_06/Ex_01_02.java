package src.java.moon_s.chap_06;

public class Ex_01_02 {
    public static void main(String[] args) {

        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}

// TODO 1.클래스 정의하기
// TODO 2.생성자 추가, info() 추가
class SutdaCard {

    // 멤버변수
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    // 멤버변수 선언된 것과 파라미터 구분 this
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // 문자열로 반환
    String info() {
        return num + (isKwang ? "K" : "");
    }
}
