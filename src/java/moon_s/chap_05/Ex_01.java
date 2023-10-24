package src.java.moon_s.chap_05;

public class Ex_01 {
    public static void main(String[] args) {

        // TODO 다차원 배열 연습
        // 배열의 인덱스는 0부터 시작한다
        // 배열의 길이는 인덱스마다 다르게 설정 가능

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
        };

        System.out.println(arr[3].length); // 2

    }
}
