public class Main {

    public static void getShapeInfo(Shape shape) {
        if (shape.isShapeOk()) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        getShapeInfo(new Square(5));                //should work
        getShapeInfo(new Square(-4));               //should throw Exception
        getShapeInfo(new Square(0));                //should throw Exception
        System.out.println(" ");                       //divider

        getShapeInfo(new Triangle(2, 2, 3));  //should work
        getShapeInfo(new Triangle(2, 2, 4));  //should throw Exception
        getShapeInfo(new Triangle(-2, 2, 0)); //should throw Exception
        System.out.println(" ");

        getShapeInfo(new Rectangle(5, 2));       //should work
        getShapeInfo(new Rectangle(-5, 2));      //should throw Exception
        getShapeInfo(new Rectangle(3, 0));       //should throw Exception
        System.out.println(" ");

        getShapeInfo(new Circle(5));            //should work
        getShapeInfo(new Circle(1));            //should work
        getShapeInfo(new Circle(-2));           //should throw Exception
        System.out.println(" ");

        getShapeInfo(new Sphere(5));            //should work
        getShapeInfo(new Sphere(100));          //should work
        getShapeInfo(new Sphere(-1000));        //should throw Exception
        System.out.println(" ");

        getShapeInfo(new Cube(5));                //should work
        getShapeInfo(new Cube(10));               //should work
        getShapeInfo(new Cube(0));                //should throw Exception
    }
}