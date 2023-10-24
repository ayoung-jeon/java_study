package src.java.moon_s.chap_05;

public class Ex_04 {
    public static void main(String[] args) {

        // TODO 1~9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자 만들기
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        // Math.random -> 난수 생성 * 배열의 길이만큼(9)
        // Math.random -> 0 ~ 1 사이의 난수
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            // tmp, ballArr[i], ballArr[j] -> 세개의 숫자를 각각 바꾸기
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        // .arraycopy 메소드 사용법?
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        // 반복문 사용해서 ball3 배열의 길이만큼 숫자 반환 -> 줄바꿈하지 않은 상태로 출력해서 세자리로 나옴
        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }

        // 줄바꿈을 위해 출력
        System.out.println();
    }
}