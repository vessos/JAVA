package classBox;


public class Box {

   private double length;
   private double width;
   private double height;

    public Box(double length,double width,double height){

        this.length = length;
        this.width = width;
        this.height = height;

    }

    private double getLength() {
        return this.length;
    }

    private double getWidth() {
        return this.width;
    }

    private double getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f",this.surfaceArea(),this.lateralSurfaceArea(),this.volume()) ;

    }

    private double lateralSurfaceArea(){
        return 2*this.getLength()*this.getHeight() + 2*this.getWidth()*this.getHeight();
    }
    private double volume(){
        return this.height*this.width*this.length;
    }

    private double surfaceArea(){
        return 2*this.getLength()*this.getWidth()
                + 2*this.getLength()*this.getHeight()
                + 2*this.getWidth()*this.getHeight();
    }
}
