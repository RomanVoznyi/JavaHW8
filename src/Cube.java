public class Cube extends Shape implements VolumetricShape {
    private int a;
    private boolean isOk = true;

    public Cube(int a) {
        try {
            setA(a);
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
        return 4 * a;
    }

    @Override
    public double getSquare() {
        return a * a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public String toString() {
        return "This volumetric shape has name " + getShapeName() + ", sides '" + getA() + "', perimetr of the each side '"
                + getPerimetr() + "', square of the each side '" + getSquare() + "' and volume '" + getVolume() + "'.";
    }


}
