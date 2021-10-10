package ru.geekbrains.lesson5;

public class HomeWork {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Kim Kai", "Engineer", "kimk@mailbox.com", "892312312",500000,41);
        empCorp[1] = new Employee("Lee Tae", "Creator", "ltae@mailbox.com", "892312314",20000,22);
        empCorp[2] = new Employee("Se Sehun", "Water pot", "ss@mailbox.com", "892312315",10000,43);
        empCorp[3] = new Employee("Kim Younnie", "EnvelopeLicker", "kimyou@mailbox.com", "892312316",5000,18);
        empCorp[4] = new Employee("Juke Joy", "GrinderPencil", "jjoy@mailbox.com", "892312317",1000,37);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}


