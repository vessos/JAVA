package shape;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height,Double width){
        this.height=height;
        this.width=width;
        this.calculatePerimeter();
        this.calculateArea();

    }

    public final Double getHeight() {
        return this.height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    public final Double getWidth() {
        return this.width;
    }

    private void setWith(Double with) {
        this.width = with;
    }

    @Override
    public void calculatePerimeter() {
        super.setPerimeter(2*this.height+2*this.width);
    }

    @Override
    public void calculateArea() {
        super.setArea(this.height*this.width);
    }
}
