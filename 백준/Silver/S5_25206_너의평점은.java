package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_25206_너의평점은 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // ? idea
        // 1. 입력 값을 순회하면서 등급을 먼저 체크하고, P가 아니라면 해당 과목의 학점 x 등급 점수
        // 1.1. 이 때 학점의 총합 값을 같이 저장한다. -> 평균을 구하기 위함
        // 2. 20번 순회가 끝나면 (과목 별 점수) / (학점 총합) 계산 한다.

        // * feedback
        // 1. 괜찮았다. 아이디어 접근도 좋았고, 딱 필요한 것만 input으로 받아서 총 학점과 과목 별 점수를 간결하게 저장했다.

        double sum = 0;
        double amountClassPoint = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명

            double point = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급

            double gradePoint = switch (grade) {
                case "A+" -> 4.5;
                case "A0" -> 4.0;
                case "B+" -> 3.5;
                case "B0" -> 3.0;
                case "C+" -> 2.5;
                case "C0" -> 2.0;
                case "D+" -> 1.5;
                case "D0" -> 1.0;
                default -> 0.0;
            };

            if (grade.equals("P")) {
                continue;
            }

            sum += point; // 총 학점
            amountClassPoint += point * gradePoint; // 과목 별 점수
        }

        System.out.println((double) amountClassPoint / sum);
    }
}