package src.java.moon_s.chap_06;

public class Ex_06 {

    // 두 점 (x,y)와 (x1,y1) 간의 거리 구하기
    // getDistance -> 매개변수를 4개받는 메소드 선언(클래스메소드?)
    // 메인 클래스에서 사용하려면 클래스 메소드여야해서?
    static double getDistance(int x, int y, int x1, int y1){
        // Math.sqrt -> 제곱근 구하는 메소드
        return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
    }

    public static void main(String[] args) {
        // TODO 두 점의 거리를 계산
        System.out.println(getDistance(1,1,2,2));
    }
}
