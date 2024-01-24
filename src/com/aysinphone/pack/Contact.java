package com.aysinphone.pack;

import java.util.Objects;

public class Contact {
    private int id;
    private String name;
    private long phoneNumber;

    public Contact(int id, String name, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return getPhoneNumber() == contact.getPhoneNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber());
    }
}
