package org.example;

import java.util.Date;

public class User {
    String name;
    String lastName;
    Date birthday;
    int idCard;

    public User (String name, String lastName, Date birthday, int idCard) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getIdCard() {
        return idCard;
    }
}
