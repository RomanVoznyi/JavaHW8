public class Rectangle extends Shape {
    private int a, b;
    private boolean isOk = true;

    public Rectangle(int a, int b) {
        try {
            setA(a);
            setB(b);
        } catch (IllegalArgumentException exc) {
            System.out.println("Error: Invalid argument value. Should be an integer greater than 0");
        }
    }

    public int getA() {
        return a;
    }

    private void setA(int a) throws IllegalArgumentException {
        if (a < 1) {
            this.isOk = false;
            throw new IllegalArgumentException();
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    private void setB(int b) throws IllegalArgumentException {
        if (b < 1) {
            this.isOk = false;
            throw new IllegalArgumentException();
        }
        this.b = b;
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
        return a * 2 + b * 2;
    }

    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public String toString() {
        return "This shape has name " + getShapeName() + ", sides: [" + getA()
                + ", " + getB() + "], perimetr '" + getPerimetr() + "' and square '" + getSquare() + "'.";
    }
}
