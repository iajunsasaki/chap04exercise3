package shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 3));
        shapes.add(new Triangle(3, 4, 5));

        // 図形の描画
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
