package gr.aueb.cf.cf9.ch16;

public interface Printable {
    default void print() {
        System.out.println("This is printable!");
    }
}
