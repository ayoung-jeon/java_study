package src.java.moon_s.chap_06;

public class Ex_03_04 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "홍길동";
        st.ban = 1;
        st.no = 1;
        st.kor = 100;
        st.eng = 60;
        st.math = 76;

        System.out.println("이름 : " + st.name);
        System.out.println("총점 : " + st.getTotal());
        System.out.println("평균 : " + st.getAverage());
    }

    // TODO 1.클래스 정의
    // TODO 2.메서드와 getter 추가
    static class Student { // 그냥 class 는 에러남 static 붙여줘야함
        String name; // 학생이름
        int ban; // 반
        int no; // 번호
        int kor; // 국어점수
        int eng; // 영어점수
        int math; // 수학점수

        // 총점내는 메서드
        int getTotal() {
            return kor + eng + math;
        }

        // 평균내는 메서드
        float getAverage() {
            // 평균내는 계산식? -> 소수점 둘째자리에서 반올림
            return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
        }
    }
}
