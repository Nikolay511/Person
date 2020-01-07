package ru;

public class Person {
    private final String name;

    private final boolean man;

    private Person spouse;

    public Person(String name, boolean man) {
        this.name = name;
        this.man = man;
    }


    public boolean marry(Person person) {
        if (this.man == person.man || this.spouse == person || person == null) {
            return false;
        } else {
            if (this.spouse != null) {
                divorce();
            }
            this.spouse = person;
            person.marry(this);
            return true;
        }
    }


    public boolean divorce() {
        if (this.spouse == null) {
            return false;
        } else {
            Person exSpouse = this.spouse;
            this.spouse = null;
            exSpouse.divorce();
            return true;
        }
    }

    public String getName() {
        return name;
    }
}
