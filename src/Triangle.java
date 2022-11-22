public class Triangle extends Shape {
    private int a, b, c;
    private boolean isOk = true;

    public Triangle(int a, int b, int c) {
        try {
            isTriangle(a, b, c);
        } catch (IllegalArgumentException exc) {
            System.out.println("Error: Invalid argument value. Should be an integer greater than 0 and any side cannot be greater or equal than the sum of the other two");
        }
    }

    public int getA() {
        return a;
    }

    private void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    private void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    private void setC(int c) {
        this.c = c;
    }

    private void isTriangle(int a, int b, int c) throws IllegalArgumentException {
        if (a < 1 || b < 1 || c < 1 || a >= b + c || b >= a + c || c >= a + b) {
            this.isOk = false;
            throw new IllegalArgumentException();
        }
        setA(a);
        setB(b);
        setC(c);
    }

    @Override
    public boolean isShapeOk() {
        return isOk;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getSquare() {
        double semiPerim = getPerimetr() / 2;
        return Math.sqrt(semiPerim * (semiPerim - a) * (semiPerim - b) * (semiPerim - c));
    }

    @Override
    public String toString() {
        return "This shape has name " + getShapeName() + ", sides: [" + getA()
                + ", " + getB() + ", " + getC() + "], perimetr '" + getPerimetr() + "' and square '" + getSquare() + "'.";
    }
}
