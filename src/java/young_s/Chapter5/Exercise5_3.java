package src.java.young_s.Chapter5;

public class Exercise5_3 {
    // [5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // arr의 배열 길이만큼 각 자리에 숫자를 for문을 돌리고 sum에 더해 넣어준다.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum="+sum);

    }
}

// 출력 -> sum=150

