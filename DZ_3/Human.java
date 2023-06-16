package HomeWorks.DZ_3;

public class Human {
    String firstName;
    String lastName;
//    String middleName;
//    String birthday;
//    String phoneNumber;
//    String male;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
