package src.java.young_s.Chapter5;

// 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
// (1)에 알맞은 코드를 넣어서 완성하시오.
public class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode = {
                '`','~','!','@','#','$','%','^','&','*',
                '(',')','-','_','+','=','|','[',']','{',
                '}',';',':',',','.','/'
        };
                        //0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            // 알파벳으로 받는지 숫자로 받는지 구분한다.
            // 알파벳으로 받으면 if문으로 들어가 -'a'를 한다.
            // 예를들어 'c'를 받으면 'c'-'a' → 99 - 97 → 2 → result+= abcCode[2]; → result+= '!';
            if('a' <= ch && ch <='z') {
                result += abcCode[ch-'a'];
            // 숫자를 받으면 numCode의 자리를 찾아 뽑아낸다.
            } else if('0' <= ch && ch <='9') {
                result += numCode[ch-'0'];
            }
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    } // end of main
} // end of class

/*출력
src:abc123
result:`~!wer
 */