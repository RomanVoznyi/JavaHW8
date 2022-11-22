public class Sphere extends Shape implements VolumetricShape{
    private int radius;
    private final double PI=3.14;
    private boolean isOk = true;

    public Sphere(int radius) {
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
    public double getVolume() {
        return (double) Math.round(4f/3f*PI*Math.pow(radius,3)*100)/100;
    }

    @Override
    public String toString() {
        return "This volumetric shape has name " + getShapeName() + ", radius of the central circle '" + getRadius()
                + "', perimetr of the central circle '" + getPerimetr() + "', square of the central circle '" + getSquare()
                + "' and volume '"+getVolume()+"'.";
    }


}
