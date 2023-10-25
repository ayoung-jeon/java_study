package src.java.young_s.Chapter5;

// 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
public class Exercise5_9 {
    public static void main(String[] args) {
        char[][] star = {
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'}
        };

        char[][] result = new char[star[0].length][star.length];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int a= 0; //빈그릇 하나 준비

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if(i == 0){
                    a = 3;
                } else if (i == 1) {
                    a = 2;
                } else if (i == 2) {
                    a = 1;
                } else if (i == 3) {
                    a = 0;
                }
                result[j][a] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}

/* 출력

**
**
*****
*****

****
****
**
**
**

 */

