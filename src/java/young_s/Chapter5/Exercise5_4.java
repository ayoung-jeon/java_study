package src.java.young_s.Chapter5;

public class Exercise5_4 {
    // 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;

        float num =0; // 담을 예비 그릇하나 만들기, 평균 소숫점까지 나와야해서 float

        // arr.length로 arr 배열의 길이만큼 for문을 이용해 한줄씩 꺼내어
        // arr[i].length로 arr[한줄씩] 의 각 숫자 하나씩 꺼낸다.
        // arr[한줄씩][한개씩] 을 total에 더해 넣어준다.
        // 넣고 다시 for문을 돌러 올라갈때 num의 숫자가 1씩 더해져 총 갯수를 구한다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
                num += 1; // 평균을 내기위해서 총갯수를 구한다.
            }
        }

        average = total / num;

        System.out.println("total="+total);
        System.out.println("average="+average);
    } // end of main
} // end of class

// 출력 -> total=325
//        average=16.25

