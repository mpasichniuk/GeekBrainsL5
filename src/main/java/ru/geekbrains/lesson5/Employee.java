package ru.geekbrains.lesson5;

public class Employee {
    public String fio;
    public String title;
    public String email;
    public String phone;
    public int salary;
    public int age;


    public Employee(String fio, String title, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return (fio + "\n-" +
                title+ "\n-" +
                email + "\n-" +
                phone + "\n-" +
                salary + "\n-" +
                age + "\n");
    }
}
