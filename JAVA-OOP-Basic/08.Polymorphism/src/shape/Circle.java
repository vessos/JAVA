package shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius){
        this.radius=radius;
        this.calculateArea();
        this.calculatePerimeter();

    }

    public final Double getRadius() {
        return this.radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(this.radius*2*3.14);
    }

    @Override
    public void calculateArea() {
        setArea(this.radius*this.radius*3.14);
    }
}
