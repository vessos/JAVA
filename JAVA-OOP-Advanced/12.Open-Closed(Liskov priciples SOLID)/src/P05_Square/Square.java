package P05_Square;

public class Square extends Rectangle {


    public Square(int m_width, int m_height) {
        super(m_width, m_height);
    }

    public Square(int side){
        super(side,side);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }
}
