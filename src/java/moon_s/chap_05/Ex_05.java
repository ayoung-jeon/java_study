package src.java.moon_s.chap_05;

public class Ex_05 {
    public static void main(String[] args) {

        // TODO 거스름돈을 몇 개의 동전으로 지불 가능?
        // 가능한 적은 동전으로 거슬러 주어야 함 -> 큰 수 부터 나눠줘야 적은 동전갯수 됨
        int[] coinUnit = {500, 100, 50, 10};

        int money = 3460; // 변수의 수를 바꿔보면서 바뀌는 값 확인하기
        System.out.println("money = " + money);

        // 반복문 사용하여 코인유닛의 길이만큼 순회
        for (int i = 0; i < coinUnit.length; i++) {

            // 코인유닛의 인덱스를 0부터 순차적으로 돌면서 -> 머니를 코인유닛 인덱스 순차적인 값으로 나눠줌(이건 몫)
            // 남은 머니의 값은은 -> 코인유닛의 인덱스로 나머지 연산으로 나눠주면서 반복함
            System.out.println(coinUnit[i] + "원: " + money / coinUnit[i]);
            money = money % coinUnit[i];
        }
    }
}