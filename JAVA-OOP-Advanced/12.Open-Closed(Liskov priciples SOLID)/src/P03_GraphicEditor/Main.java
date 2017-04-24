package P03_GraphicEditor;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape rec = new Rectangle();
        Shape sqrt = new Square();
        GraphicEditor gE = new GraphicEditor();
        gE.drawShape(shape);
        gE.drawShape(rec);
        gE.drawShape(sqrt);
    }
}
