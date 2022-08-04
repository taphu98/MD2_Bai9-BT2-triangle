import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    void testTamGiacVuong() {
        double a = 3;
        double b = 4;
        double c = 5;
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        String expected = "Là tam giác vuông";
        assertEquals(result, expected);
    }

    @Test
    void testTamGiacDeu() {
        double a = 2;
        double b = 2;
        double c = 2;
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        String expected = "Là tam giác đều";
        assertEquals(result, expected);
    }

    @Test
    void testTamGiacThuong(){
        double a = 2;
        double b = 2;
        double c = 3;
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        String expected = "Là tam giác cân";
        assertEquals(result, expected);
    }

    @Test
    void testTamGiacVuongCan(){
        double a = 3;
        double b = 3;
        double c = Math.ceil(Math.sqrt(18));
        String result = TriangleClassifier.triangleClassifier(a, b, c);
        String expected = "Là tam giác vuông cân";
        assertEquals(result, expected);
    }
}