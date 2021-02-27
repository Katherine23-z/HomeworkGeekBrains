package homework.homework8.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();
    private List<String> phoneNumberList;


    public void add(String surName, String phoneNumber) {
        if (phoneBook.containsKey(surName)) {
            phoneNumberList = phoneBook.get(surName);
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surName, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surName, phoneNumberList);
        }
    }

    public void getPhoneNumber(String surname) {
        if(phoneBook.containsKey(surname)) {
            System.out.println(phoneBook.get(surname));
        }else{
            System.out.println("Нет такого абонента");
        }

    }


}
