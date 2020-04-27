package io.rachidassouani.factory.example1;

public class Rectangle implements IShape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
