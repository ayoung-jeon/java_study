package src.java.young_s.Chapter6;

// 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.

public class Exercise6_5 {
    public static void main(String args[]) {
        Student1 s = new Student1("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}
class Student1 {
    String name; // 학생이름
    int ban;  // 반
    int no;  // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    public Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal(){
        return kor + eng + math;
    }

    public float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    public String info() {
        return name
                +","+ ban
                +","+ no
                +","+ kor
                +","+ eng
                +","+ math
                +","+ getTotal()
                +","+ getAverage();

    }
}

/* 출력
홍길동,1,1,100,60,76,236,78.7
 */