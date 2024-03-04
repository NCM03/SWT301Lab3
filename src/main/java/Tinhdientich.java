import java.util.Scanner;

public class Tinhdientich {
    public static void main(String[] args) {

    }


        // Tính diện tích hình chữ nhật
        public double calculateRectangleArea(double width, double height) {
            if (!isValidNumber(width) || !isValidNumber(height) || width <= 0 || height <= 0) {
                return -1;
            }
            return width * height;
        }

        // Tính diện tích hình tròn
        public  double calculateCircleArea(double radius) {
            if (!isValidNumber(radius) || radius <= 0) {
                return -1;
            }
            return Math.PI * radius * radius;
        }

        // Tính diện tích hình tam giác bằng công thức Heron
        public double calculateTriangleArea(double side1, double side2, double side3) {
            if (!isValidNumber(side1) || !isValidNumber(side2) || !isValidNumber(side3) ||
                    side1 <= 0 || side2 <= 0 || side3 <= 0) {
                return -1;
            }
            if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {

                return -1;
            }
            double s = (side1 + side2 + side3) / 2; // Nửa chu vi
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Công thức Heron
        }

        // Kiểm tra số có hợp lệ không (không là NaN và không vô cùng)
        private static boolean isValidNumber(double num) {
            return !Double.isNaN(num) && !Double.isInfinite(num);
        }




}



