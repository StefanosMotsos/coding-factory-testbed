package gr.aueb.cf.cf9.ch16;

public class Document implements Printable{
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public Document() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is a document!");
    }


}
