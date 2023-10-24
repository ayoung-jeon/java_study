package src.moon_s.chap_05;

public class Ex_06 {
    public static void main(String[] args) {

        // 이게 왜 있지..?
        if (args.length != 1) {
            System.out.println("");
            System.exit(0);
        }

        // TODO 보유한 동전의 개수로 거스름돈 지불하기 -> 부족하면 부족하다는 메세지 출력
        // TODO 거슬러 줬으면 -> 남은 동전 수 출력

        int money = Integer.parseInt(args[0]);

        System.out.println("money = " + money);

        int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전의 수량

        for (int i = 0; i < coin.length; i++) {
            int coinNum = 0;

            // 머니를 동전단위로 나눠서 필요한 동전 개수 구함 -> coinNum
            coinNum = money / coinUnit[i];

            // coin(가지고 있는 동전개수)에서 동전개수(coinNum)을 뺌
            // 충분한 동전이 없으면 -> 가지고 있는 동전개수에서 있는 만큼만 뺌
            if (coin[i] >= coinNum) {
                coin[i] -= coinNum;
            } else {
                coinNum = coin[i];
                coin[i] = 0;
            }

            // 머니에서 동전 개수(coinNum)와 동전 단위를 곱한 값을 뺌
            money -= coinNum * coinUnit[i];

            System.out.println(coinUnit[i] + "원: " + coinNum);
        }

        if (money > 0) {
            System.out.println("거스름돈이 부족합니다");
            System.exit(0); // 프로그램 종료
        }

        System.out.println("= 남은 동전의 개수 =");

        for (int i = 0; i < coin.length; i++) {
            System.out.println(coinUnit[i] + "원: " + coin[i]);
        }

    }
}
