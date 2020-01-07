package ru;

public class Main {
    public static void main(String[] args) {

        Person vasya = new Person("Vasya", true);
        Person anya = new Person("Anya", false);
        Person egor = new Person("Egor", true);
        Person andrey = new Person("Andrey", true);
        Person stas = new Person("Stas", true);
        Person katya = new Person("Katya", false);
        Person dima = new Person("Dima", true);
        Person sveta = new Person("Sveta", false);

        marry(dima,sveta);
        marry(sveta,dima);
        marry(anya, sveta);
        marry(vasya, egor);
        marry(egor, sveta);
        marry(vasya, sveta);
        marry(andrey, stas);
        marry(stas, katya);
        marry(andrey, katya);

    }
    public static void marry(Person per1, Person per2) {
        System.out.println("Попытка выйти замуж " + per1.getName() + " c " + per2.getName());
        boolean result = per1.marry(per2);
        System.out.println("Result = " + result + "\n");
    }
}
