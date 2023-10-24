package src.java.moon_s.chap_05;

public class Ex_10 {
    public static void main(String[] args) {

        // TODO 주어진 2차원 배열의 데이터보다 가로 세로 1씩 더 큰 배열 생성
        // TODO 생성해서 -> 행과 열의 마지막 요소에 각 열과 행의 총합 저장

        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        // 주어진 배열보다 크기가 1씩 큰 배열 생성
        int[][] result = new int[score.length + 1][score[0].length + 1];

        // 2차원 배열이기 때문에 이중for문~
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {

                // 일단 맨 마지막에 총합빼고는 값이 같기 때문에 그대로 값을 넣어줌
                result[i][j] = score[i][j];

                // 답이 나올 배열에 값 넣기
                // 각 행, 렬의 마지막 인덱스 설정
                result[i][result[0].length - 1] += result[i][j];
                result[result.length - 1][j] += result[i][j];
                result[score.length][result[0].length - 1] += result[i][j];

                // 위와 같은 답 나옴
                /*result[i][score[0].length] += score[i][j];
                result[score.length][j] += score[i][j];
                result[score.length][score[0].length] += score[i][j];*/
            }
        }

        // 반복문 사용해서 결과값 출력
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(String.format("%4d", result[i][j]));
                // System.out.printf("%4d",result[i][j]); 이렇게도 가능
            }
            System.out.println();
        }
    }
}
