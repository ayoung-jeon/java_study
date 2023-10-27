package src.java.young_s.Chapter6;

// 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행 결과와 같은 결과를 얻도록 하시오.

public class Exercise6_2 {
    public static void main(String args[]) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

// 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
//타입        변수명         설명
//int        num        카드의 숫자.(1~10사이의 정수)
//boolean   isKwang     광(光)이면 true, 아니면 false
class SutdaCard {
        int num;
        boolean isKwang;

        SutdaCard() {
            this(1, true); // SutdaCard(1, ture) 를 호출한다
        }

        SutdaCard(int num, boolean isKwang) {
            this.num = num;
            this.isKwang = isKwang;
        }

        String info() { //숫자를 문자열로 반환한다. 광인 경우 +K
            return num + (isKwang ? "k" : "");
        }
    }




/*출력
3
1K
 */
