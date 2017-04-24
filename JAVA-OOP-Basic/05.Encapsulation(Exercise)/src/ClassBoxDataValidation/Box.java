package ClassBoxDataValidation;


public class Box {

   private double length;
   private double width;
   private double height;

    public Box(double length, double width, double height){

        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);

    }

    private double getLength() {
        return this.length;
    }

    private void setLength(double length) {
        if(length<=0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        if(width<=0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        if(height<=0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
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
