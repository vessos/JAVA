package rectangle;


public class Square extends Rectangle {

    public Square(Double sideA){
        super(sideA);
    }

    public Double perimeter(){
        return 4*this.getSideA();
    }
    @Override
    public Double calculateArea(){
        return this.getSideA()*this.getSideA();
    }
}
