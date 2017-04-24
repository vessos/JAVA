package shape;


public abstract class Shape {

    private Double perimeter;
    private Double area;

    protected Shape(){

    }

    public final Double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public final Double getArea() {
        return this.area;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public abstract void calculatePerimeter();

    public  abstract void calculateArea();
}
