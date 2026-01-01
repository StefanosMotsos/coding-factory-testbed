package gr.aueb.cf.cf9.ch15;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
