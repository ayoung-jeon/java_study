package src.java.moon_s.chap_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {

        String[][] word = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        // 답을 맞춘 수를 저장하기 위한 변수 선언
        int score = 0;

        // 사용자 입력받기위해 스캐너 사용
        Scanner sc = new Scanner(System.in);

        // 배열을 순회 하면서 문제에 인덱스 값 입력
        // i + 1 -> 문제 번호는 1번부터라서
        for (int i = 0; i < word.length; i++) {
            System.out.print(String.format("Q.%d %s의 뜻은?", i + 1, word[i][0]));

            // 사용자가 답을 입력
            String answer = sc.nextLine();

            // 입력한 답이 배열의 값과 같으면 score ++
            // word[i][1] -> 문제말고 답이 한개 밖에 없어서
            if (answer.equals(word[i][1])) {
                System.out.print(String.format("정답입니다.%n%n"));
                score++;
            } else {
                System.out.print(String.format("틀렸습니다. 정답은 %s입니다. %n%n", word[i][1]));
            }
        }
        System.out.print(String.format("전체 %d문제 중 %d문제 맞추셨습니다. %n", word.length, score));
    }
}
