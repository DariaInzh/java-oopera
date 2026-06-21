public class Person {
    String name;
    String surname;
    Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    Gender getGender() {
        return gender;
    }

    void setGender(Gender gender) {
        this.gender = gender;
    }
}
