package src.java.young_s.Chapter5;

//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
//(1) 에 알맞은 코드를 넣어서 완성하시오.
public class Exercise5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
            };
        int[][] result = new int[score.length + 1][score[0].length + 1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                // 자리에 넣어주기
                result[i][score[0].length] += result[i][j];
                // 4번째 배열에 합 넣어주기
                result[score.length][j] += result[i][j];
                // 총합 넣어주기
                result[score.length][score[0].length] += result[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    } // main
}

/*출력
100 100 100 300
20 20 20 60
30 30 30 90
40 40 40 120
50 50 50 150
240 240 240 720
 */