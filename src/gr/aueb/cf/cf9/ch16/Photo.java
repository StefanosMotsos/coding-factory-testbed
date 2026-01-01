package gr.aueb.cf.cf9.ch16;

public class Photo implements Printable{
    private String name;

    public Photo() {
    }

    public Photo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a photo!");
    }
}
