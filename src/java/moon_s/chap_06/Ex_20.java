package src.java.moon_s.chap_06;

import java.util.Arrays;

public class Ex_20 {

    public static int[] shuffle(int[] arr) {

        // 먄약에 배열 arr이 null 이거나 길이가 0 이면
        // 바로 배열 반환
        if(arr == null || arr.length == 0){
            return arr;
        }

        // arr의 길이만큼 순회하면서
        // arr의 길이만큼 랜덤한 숫자 생성
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);

            // arr[i], arr[j] 값 섞기
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        // 섞어서 arr 배열 반환
        return arr;
    }
    public static void main(String[] args) {

        // 원래의 배열
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // 원래의 배열을 스트링 형태로 반환
        System.out.println(Arrays.toString(original));

        // 숫자가 섞인 배열 반환
        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
