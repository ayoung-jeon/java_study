package src.java.moon_s.chap_05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {

        // TODO 단어의 글자위치를 섞어 보여주고 원래 단어 맞추기

        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            // String -> char[]
            // 한글자씩 뽑아서 섞는거임
            char[] question = words[i].toCharArray();

            for (int j = 0; j < question.length; j++) {
                int idx = (int) (Math.random() * question.length);

                // question 배열 길이만큼 랜덤 숫자 생성 해서 섞기
                char tmp = question[i];
                question[i] = question[idx];
                question[idx] = tmp;
            }

            System.out.print(String.format("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question)));

            // 사용자가 답을 입력함
            String answer = sc.nextLine();

            // 만약에 사용자가 입력한 답과 배열의 값이 같으면~ (입력한 답의 좌우공백 모두제거후 비교)
            if(words[i].equals(answer.trim())) {
                System.out.print(String.format("맞았습니다. %n%n"));
            } else {
                System.out.print(String.format("틀렸습니다. %n%n"));
            }
        }
    }
}
