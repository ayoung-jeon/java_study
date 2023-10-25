package src.java.moon_s.chap_06;

public class Ex_07 {

    // TODO static 메서드와 인스턴스 메서드 사용 차이알기
    // TODO 변수도 마찬가지
    static class MyPoint{ // 메인메소드에서 사용하려면 static 이어야하 함
        // 인스턴스 변수
        int x;
        int y;

        // 생성자?
        MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // 거리계산하는 메소드 선언
        static double getDistance(int x, int y, int x1, int y1) {
            return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
        }
    }

    // 정적클래스, 정적메서드
    // 인스턴스클래스, 인스턴스 메서드에따라 -> 매개변수 넣는 방식 생각해야함
    public static void main(String[] args) {
        // 생성자 생성
        MyPoint p = new MyPoint(1, 1);

        // p와 (2,2)의 거리 구하기
        System.out.println(p.getDistance(1,1,2,2));

    }
}
