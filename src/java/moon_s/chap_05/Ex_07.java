package src.java.moon_s.chap_05;

public class Ex_07 {
    public static void main(String[] args) {

        // TODO 배열 answer에 감긴 데이터를 읽고 -> 개수 만큼 * 찍기
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int[] counter = new int[4]; // 배열의 크기가 4? -> 숫자의 개수가 4개라서

        // 반복문으로 answer 배열의 길이만큼 순회해서면서 counter 배열에 추가
        // '배열[i] - 1' 은 배열의 마지막 값을 의미 -> 배열인덱스가 0부터 시작해서 그럼
        for (int i = 0; i < answer.length; i++) {
            counter[answer[i] - 1]++; // 인덱스의 값이 같은게 증가++
        }

        // 다시 반복문 사용해서 counter 배열의 길이만큼 순회
        // 카운터가 증가된 수를 출력
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);

            // 그럼 카운터 증가된 수만큼 -> '*' 추가해서 출력
            for (int j = 0; j < counter[i]; j++) {
                System.out.print("*"); // counter[i] 값 만큼 '*' 찍기
            }

            System.out.println();
        }
    }
}
