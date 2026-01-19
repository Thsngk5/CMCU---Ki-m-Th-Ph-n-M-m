import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int result = analyzer.countExcellentStudents(
                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
        );
        assertEquals(2, result);
    }

    @Test
    public void testCountExcellentStudents_AllValid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
                3,
                analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0))
        );
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
                0,
                analyzer.countExcellentStudents(Collections.emptyList())
        );
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double avg = analyzer.calculateValidAverage(
                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
        );
        assertEquals(8.17, avg, 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
                0,
                analyzer.calculateValidAverage(Arrays.asList(-2.0, 12.0))
        );
    }

    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
                5.0,
                analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)),
                0.01
        );
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
                0,
                analyzer.calculateValidAverage(Collections.emptyList())
        );
    }

    @Test
    public void testCalculateValidAverage_AllValidNormal() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
                7.5,
                analyzer.calculateValidAverage(Arrays.asList(7.0, 8.0)),
                0.01
        );
    }

    @Test
    public void testCalculateValidAverage_MinPlusOne() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1.0,
            analyzer.calculateValidAverage(Arrays.asList(1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverage_MaxMinusOne() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(9.0,
            analyzer.calculateValidAverage(Arrays.asList(9.0)), 0.01);
    }

    @Test
    public void testCountExcellentStudents_BoundaryExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(1,
            analyzer.countExcellentStudents(Arrays.asList(8.0)));
    }

    @Test
    public void testCountExcellentStudents_JustBelowExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
            analyzer.countExcellentStudents(Arrays.asList(7.0)));
    }

    @Test
    public void testCountExcellentStudents_MultipleExcellent() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(3,
            analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 10.0)));
    }

    @Test
    public void testCalculateValidAverage_MultipleInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
            analyzer.calculateValidAverage(Arrays.asList(-1.0, -5.0, 20.0)));
    }

    @Test
    public void testCalculateValidAverage_JustBelowMin() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
            analyzer.calculateValidAverage(Arrays.asList(-1.0)));
    }

    @Test
    public void testCalculateValidAverage_JustAboveMax() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(0,
            analyzer.calculateValidAverage(Arrays.asList(11.0)));
    }

    @Test
    public void testCalculateValidAverage_MixBoundaryAndInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        assertEquals(
            5.0,
            analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0, -1.0, 11.0)),
            0.01
        );
    }

}

