package src.java.young_s.Chapter5;

// 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
// Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.

public class Exercise5_5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        // ballArr.length로 ballArr 배열의 길이까지 for문을 이용해 돌며 숫자를 하나씩 꺼낸다.
        // Math.random() * ballArr.length (1 * 9) 1~9 까지의 숫자를 랜덤으로 가져와 int형으로 변환해 j에 넣어준다.
        for(int i=0; i< ballArr.length;i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0; // 숫자를 돌리기위해 빈그릇 준비

            // 중복되지 않은 세개의 정수를 얻기 위해 세 요소를 차례대로 가져온다.
            tmp =ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;

        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        // ballArr[0] 에서 ball3[0]으로 3개 데이터 복사
        // System.arraycopy --> 배열복사할때 사용
        System.arraycopy(ballArr,0 ,ball3,0, 3);

        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
        }
    } // end of main
} // end of class Sys

// 출력 -> 486 (랜덤이기 때문에 답은 바뀔 수 있다.)