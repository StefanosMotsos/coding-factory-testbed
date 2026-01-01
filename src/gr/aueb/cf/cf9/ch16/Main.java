package gr.aueb.cf.cf9.ch16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> items = new ArrayList<>();
        items.add(new Document("test.doc"));
        items.add(new Photo("Athens.png"));
        items.add("NotAPrintable.zip");

        Thread t = new Thread(() -> {
            for (Object o : items) {
                if (o instanceof Printable) {
                   Printable p = (Printable) o;
                   Runnable r = p::print;
                   r.run();
                }
            }
        });

        t.start();
    }
}
