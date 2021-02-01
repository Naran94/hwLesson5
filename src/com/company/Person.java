package com.company;

public class Person {
    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    Person(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this. salary = salary;
        this. age = age;

        // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
   System.out.println(" Имя " + name + "Дожность" + position + "Электронная почта" + email + "Телефон" + phoneNumber + "Заработная плата" + salary + "Возраст" + age);

   Person[] pArrey = new Person[5];
    pArrey[0] = new Person("Иванов Иван","Директор", "IIvanov@gmail.com", "89999999999", 100000, 25);
    pArrey[1] = new Person("Семенов Семен", "Заместитель Директора", "ZamIvanova@gmeal.com", "89999999998", 90000, 30);
    pArrey[2] = new Person("Фёдоров Фёдор", "Помощник заместителя директора", "ZamZamaIvanova@gmeal.com", "89999999988", 80000, 32);
    pArrey[3] = new Person("Николаев Николай", "Начальник отдела", "GoodEmployee@gmail.com", "89999999888", 70000, 33);
    pArrey[4] = new Person("Петров Петр", "Помощник начальника отдела", "SupergoodEmployee@gmail.com", "89999998888", 60000, 34);
    pArrey[5] = new Person("Сергей", "Менеджер", "Seryoga@gmeal.com", "89651234567", 10000, 65);

// С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
  for (int i = 0; i<pArrey.length; i++) {
      if (pArrey[i].age > 40)
        System.out.println("Сотрудник старше 40 лет" + i + name);
            }
        }
    }



