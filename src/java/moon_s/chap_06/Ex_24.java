package src.java.moon_s.chap_06;

import static java.lang.Math.abs;

public class Ex_24 {

    // 삼항연산자 사용
    public static int abs(int value) {
        // 매개변수의 값이 양수라면? 그대로 반환 아니라면 -붙여서 반환(양수됨)
        return value >= 0 ? value : -value;
    }

    public static void main(String[] args) {

        int value = 5;
        System.out.println(value + "의 절대값 : " + abs(value));

        value = -10;
        System.out.println(value + "의 절대값 : " + abs(value));
    }
}
