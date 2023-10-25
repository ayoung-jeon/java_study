package src.java.young_s.Chapter5;

// 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
// 변 수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하 라.
// 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
// [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
public class Exercise5_6 {
    public static void main(String args[]) {

        // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money=" + money);

        // coinUnit.length로 coinUnit 배열의 각 자리의 숫자를 가져온다
        // 500원: money / coinUnit[500] -> 2680 / 500 = 5
        // money = 2680 % 500 = 나머지 180 = 남은돈 180
        // 다시 for문으로 돌아가 두번째 자리인 100 .....
        for(int i=0; i<coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원: " + money/coinUnit[i]);
            money = money % coinUnit[i];
        }
    } // main
}
// 출력 -> money=2680
//        500원: 5
//        100원: 1
//        50원: 1
//        10원: 3
