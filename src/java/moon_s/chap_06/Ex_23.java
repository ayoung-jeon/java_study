package src.java.moon_s.chap_06;

import java.util.Arrays;

import static java.util.Collections.max;

public class Ex_23 {

    public static int max(int[] arr) {

        // 만약에 배열의 값이 null 이거나, 길이가 0이면 -999999 반환
        if(arr == null || arr.length == 0) {
            return -999999;
        }

        // 최대값이 들어갈 변수를 = 배열의 첫 번째 값으로 초기화
        int max = arr[0];

        // 반복문으로 배열의 길이만큼 순회하면서
        // arr 값이 max 변수의 값보다 크면 -> max 값 교체
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data)); // 배열의 값를 string 형식으로 출력
        System.out.println("최대값: " + max(data)); // 일반적으로 반환될 때
        System.out.println("최대값: " + max(null)); // null 일 때
        System.out.println("최대값: " + max(new int[]{})); // 크기가 0인 배열
    }
}
