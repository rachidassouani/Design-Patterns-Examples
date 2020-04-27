package io.rachidassouani.factory.example1;

public class ShapeFactory {

    public IShape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
