package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Roman")
                .lastName("Kulyk")
                .age(19)
                .weight(60)
                .gender("Male")
                .job("Student")
                .job("Developer")
                .build();
        System.out.println(user);
    }
}