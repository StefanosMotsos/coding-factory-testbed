package gr.aueb.cf.cf9.ch15;

public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

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
        return Math.PI * radius * radius;
    }
}
