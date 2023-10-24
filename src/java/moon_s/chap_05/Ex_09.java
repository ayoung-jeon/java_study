package src.java.moon_s.chap_05;

public class Ex_09 {
    public static void main(String[] args) {

        // TODO 알파벳과 숫자를 주어진 암호표로 암호화 하기

        // 영어 암호코드
        char[] abcCode = {
                '`', '~', '!', '@', '#', '$', '%', '^', '&',
                '*', '(', ')', '-', '_', '+', '=', '|',
                '[', ']', '{', '}', ';', ':', ',', '.', '/'
        };

        // 숫자 암호코드
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123"; // 이걸 바꾸는거
        String result = "";

        // 반복문을 src 배열의 길이만큼 순회하면서
        // 문자형 배열에 한글자씩 분리해서 넣기
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            // 하나씩 뽑아낸 숫자를 영어면 영어코드랑 비교
            // 숫자면 숫자코드로 비교해서 결과값에 더해줌

            // 만약 한글자씩 뽑은 ch값이 소문자 안에 있다면~
            // 결과값에 -a 한 후 넣기(아스키코드 알아야함)
            if ('a' <= ch && ch <= 'z') {
                result += abcCode[ch - 'a'];

                // 그렇지 않다면 ch값이 숫자 안에 포함된다면
                // 값에서 -0 해서 넣기
            } else if ('0' <= ch && ch <= '9') {
                result += numCode[ch - '0'];
            }
        }

        System.out.println("src = " + src);
        System.out.println("result = " + result);

    }
}
