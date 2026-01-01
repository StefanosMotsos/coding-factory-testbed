package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "Stefanos", "Motsos");

        System.out.printf("Id: %d , Firstname: %s , Lastname: %s",
                user.getId(), user.getFirstname(), user.getLastname());
    }
}
