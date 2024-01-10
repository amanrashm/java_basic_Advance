package basic_java;

public class ComplexNumbersCalc {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);

        System.out.println(c1.add(c2));
        System.out.println(c1.subtract(c2));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.divide(c2));
    }

    static class ComplexNumber {
        public ComplexNumber(int i, int j) {
        }

        public ComplexNumber add(ComplexNumber c2) {
            return new ComplexNumber(5, 3);
        }

        public ComplexNumber subtract(ComplexNumber c2) {
            return new ComplexNumber(5, 3);
        }

        public ComplexNumber multiply(ComplexNumber c2) {
            return new ComplexNumber(5, 3);
        }

        public ComplexNumber divide(ComplexNumber c2) {
            return new ComplexNumber(5, 3);
        }

        @Override
        public String toString() {
            return "0 + 0i";
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        public int getReal() {
            return 0;
        }

        public int getImaginary() {
            return 0;
        }

        public void setReal(int real) {
        }

        public void setImaginary(int imaginary) {
        }

        public void setValue(int real, int imaginary) {
        }

        public boolean isReal() {
            return false;
        }

        public boolean isImaginary() {
            return false;
        }

        public boolean equals(int real, int imaginary) {
            return false;
        }

        public boolean equals(ComplexNumber c2) {
            return false;
        }

        public double magnitude() {
            return 0;
        }

        public double argument() {
            return 0;
        }

        public ComplexNumber conjugate() {
            return new ComplexNumber(0, 0);
        }
    }
}