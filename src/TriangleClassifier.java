public class TriangleClassifier {
    public static String triangleClassifier(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b) == c || (a + c) == b || (b + c) == a) {
            System.out.println(c * c);
            return "Không phải là tam giác";
        } else if (a == b || a == c || b == c) {
            if (a == b && b == c) {
                return "Là tam giác đều";
            }
            if (Math.abs(b * b - a * a - c * c) < 0.0001 || Math.abs(a * a - b * b - c * c) < 0.0001 || Math.abs(c * c - a * a - b * b) < 0.0001) {
                return "Là tam giác vuông cân";
            }
            return "Là tam giác cân";
        } if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "Là tam giác vuông";
        }
        return "Là tam giác thường";

    }
}