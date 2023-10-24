package src.moon_s.chap_05;

public class Ex_03 {
    public static void main(String[] args) {

        // TODO 배열에 담긴 모든 값의 총합과 평균 구하기

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int sum = 0;
        float ave = 0;

        // 배열의 합, 2차원 배열이기 때문에 이중for문 사용
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        // 평균은 소숫점이 나오는계산이므로 float형으로 형변환 후 계산하기
        // TODO 이부분 이해 안가면 형변환 추가 학습필요

        // 배열의 모든 합을 배열의 길이로 나눠주면 됨
        // 지금 각 인덱스의 길이가 같음 -> 4 * 5 인 셈 -> 값이 20개니까
        // '합 / 값의 갯수'로 계산
        ave = sum / (float) (arr.length * arr[0].length);

        System.out.println("sum = " + sum);
        System.out.println("ave = " + ave);
    }
}
