package src.java.moon_s.chap_06;

public class Ex_22 {

    // TODO 문자열처리
    // .charAt() 메소드 사용

    // 문자열을 매개변수로 받는 isNumber 메소드를 선언
    public static boolean isNumber(String str) {
        // 만약 문자열이 null 이거나, 빈문자열("")과 같다면 -> false
        if(str == null || str.equals("")) {
            return false;
        }

        // 반복문을 이용해 문자열의 길이만큼 순회하면서
        // 문자열의 문자를 한글자씩 추출해서 문자형 변수에 넣기
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 만약에 ch에 넣은 값이 0 ~ 9 사이가 아니라면 -> false
            if(!('0' <= ch && ch <= '9')) {
                return false;
            }
        }
        // 모두 해당 없으면 true 반환
        return true;
    }

    // 실행을위한 메인메소드
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
