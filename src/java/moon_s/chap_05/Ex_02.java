package src.java.moon_s.chap_05;

public class Ex_02 {
    public static void main(String[] args) {

        // TODO 배열의 담긴 모든 값을 더하기
        // 배열의 선언과 동시 초기화 혹은 값넣기, 변수도 마찬가지
        // .length 메서드 자주사용

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum = " + sum);

    }
}