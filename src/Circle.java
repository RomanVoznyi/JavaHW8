public class Circle extends Shape {
    private int radius;
    private final double PI=3.14;
    private boolean isOk = true;

    public Circle(int radius) {
        try {
            setRadius(radius);
        } catch (IllegalArgumentException exc) {
            System.out.println("Error: Invalid argument value. Should be an integer greater than 0");
        }
    }

    public int getRadius() {
        return radius;
    }

    private void setRadius(int radius) throws IllegalArgumentException {
        if (radius < 1) {
            this.isOk = false;
            throw new IllegalArgumentException();
        }
        this.radius = radius;
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
        return 2*PI*radius;
    }

    @Override
    public double getSquare() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "This shape has name " + getShapeName() + ", radius '" + getRadius() + "', perimetr '" + getPerimetr() + "' and square '" + getSquare() + "'.";
    }
}
