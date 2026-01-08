import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi (>= 8.0)
     * @param scores danh sách điểm số
     * @return số học sinh đạt loại Giỏi
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                if (score >= 8.0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Chưa cài đặt ở issue #1
    public double calculateValidAverage(List<Double> scores) {
        return 0;
    }
}
