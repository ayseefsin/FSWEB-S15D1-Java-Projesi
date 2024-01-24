package com.aysinphone.pack;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    List<Contact> contacts = new ArrayList<>();


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;

    }
    public boolean addNewContact(Contact contact){
        if(contacts.contains(contact)){
            return false;
        }else{
            contacts.add(contact);
            return false;
        }
    }
    public boolean updateContact(Contact contactOld, Contact contactNew){
        if(contacts.contains(contactOld)){
            contacts.remove(contactOld);
            contacts.add(contactNew);
            return true;
        }
        return false;
    }

    public boolean removeContact (Contact contact){
        if(contacts.contains(contact)){
            contacts.remove(contact);
            return true;
        }
        return false;
    }
    public int findContact(Contact contact){
        for(int i = 0; i<contacts.size();i++){
            if(contacts.get(i)==contact){
                return i;
            }
        }
        return -1;
    }
    public int findContact(String name){
        for(int i = 0; i<contacts.size();i++){
            Contact contact = contacts.get(i);
            if(contact.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name) {
        int index = findContact(name);
        if(index<0){return null;}
        return this.contacts.get(index);
    }

    public void printContact(){
        for(int i = 0; i<this.contacts.size();i++){
            Contact contact = this.contacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() +"->"+ contact.getPhoneNumber());
        }
    }

}
