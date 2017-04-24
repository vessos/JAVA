package P05_Square;

class Rectangle {
    private int m_width;
    private int m_height;

    public Rectangle(int m_width, int m_height) {
        this.setWidth(m_width);
        this.setHeight(m_height);
    }

    protected void setWidth(int width) {
        m_width = width;
    }

    protected void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}
