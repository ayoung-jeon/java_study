package src.java.moon_s.chap_05;

public class Ex_08 {
    public static void main(String[] args) {

        // TODO 주어진 배열을 시계방향으로 90도 회전시켜 출력
        char[][] star = {
                {'*', '*', ',', ','},
                {'*', '*', ',', ','},
                {'*', '*', '*', '*'},
                {'*', '*', '*', '*'},
        };

        // 결과가 나올 새로운 문자형 배열 선언 -> 주어진 배열과 같은 크기
        char[][] result = new char[star[0].length][star.length];

        // 이중 반복문으로 먼저 원래 배열 출력
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();

            for (int k = 0; k < star.length; k++) {
                for (int j = 0; j < star[i].length; j++) {
                    int x = j;
                    int y = star.length - 1 - k;

                    result[x][y] = star[i][j];
                }
            }

            for (int z = 0; z < result.length; z++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[z][j]);
                }
                System.out.println();
            }
        }
    }
}
