package src.java.moon_s.chap_06;

public class Ex_08 {

    class PlayingCard {

        // 클래스 블럭 안 -> 인스턴스 변수
        int kind;
        int num;

        // static -> static 변수(클래스변수)
        static int width;
        static int heiget;

        PlayingCard(int k, int n) {
            // k, n -> 지역 변수
            kind = k;
            num = n;
        }
    }

    public static void main(String[] args) {

        // args, card -> 지역변수
        PlayingCard card = new PlayingCard(1,1);
    }
}
