package src.java.young_s.Chapter5;

//다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다.
// (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
public class Exercise5_8 {
    public static void main(String[] args) {
        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];

        // i가 0일때 0번째인 숫자 1이 case 1에 들어가 counter 0번 자리에 +1
        // i가 4일때 5번째인 숫자 1이 case 1에 들어가 counter 0번 자리에 +1
        // 이런식으로 각 숫자의 개수를 세어 counter 배열에 넣어준다. [3, 2, 3, 4]
        for(int i=0; i < answer.length;i++) {
            switch (answer[i]){
                case 1 : counter[0]++;
                        break;
                case 2 : counter[1]++;
                        break;
                case 3 : counter[2]++;
                        break;
                case 4 : counter[3]++;
                        break;
            }
        }

        // counter 배열의 0번째 숫자 3을 출력하고
        // j가 counter[3] 보다 작아질때까지, 3번 "*"을 줄바꿈없이 출력하고
        // 끝나면 j for문을 빠져나와 줄바꿈하고
        // 다시 i for문으로 돌아와 다음을 돈다.
        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i]);
            for (int j=0; j < counter[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }// end of main
}// end of class

/* 출력
3***
2**
2**
4****
 */