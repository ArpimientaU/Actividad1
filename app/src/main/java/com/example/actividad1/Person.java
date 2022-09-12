package com.example.actividad1;

public class Person {
    private String name;
    private String birthday;
    private String sex;

    public Person(String nombre, String cumpleaños, String sexo) {
        this.name = nombre;
        this.birthday = cumpleaños;
        this.sex = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
