public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(15);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Square(10);

        System.out.println("After-sort:");
        System.out.println();
        for (Shape shape : shapes){
            System.out.println(shape.getPerimeter());
        }

        System.out.println();
        System.out.println("After-sort:");
        System.out.println();
        for (Shape shape1 : shapes){
            if(shape1 instanceof Square || shape1 instanceof Circle || shape1 instanceof Rectangle){
                ((Resizeable) shape1).resize(Math.round(Math.random()*100+1));
            }
            System.out.println(shape1.getPerimeter());
        }
    }
}
