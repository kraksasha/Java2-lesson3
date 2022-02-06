package com.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionLesson {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov","89065016543");
        phoneBook.add("Petrov","89054326787");
        phoneBook.add("Ivanov","89054326789");
        phoneBook.add("Smirnov","89064358923");

        for (Map.Entry<String, String> o: phoneBook.getMultimap().entries()){
            System.out.println(o.getKey() + " " + o.getValue());
        }
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println();


        HashMap<String, Integer> hashMap = new HashMap<>();
        String primaryArray[] = new String[10];
        primaryArray[0] = "Москва";
        primaryArray[1] = "Саратов";
        primaryArray[2] = "Москва";
        primaryArray[3] = "Вологда";
        primaryArray[4] = "Вологда";
        primaryArray[5] = "Ереван";
        primaryArray[6] = "Сочи";
        primaryArray[7] = "Тула";
        primaryArray[8] = "Стамбул";
        primaryArray[9] = "Тула";

        for (int i = 0; i < primaryArray.length; i++){
            Integer n = hashMap.get(primaryArray[i]);
            if (n == null){
                hashMap.put(primaryArray[i], 1);
            } else {
                hashMap.put(primaryArray[i], n + 1);
            }
        }
        for (Map.Entry<String, Integer> hash: hashMap.entrySet()){
            System.out.println(hash.getKey() + " встречается " + hash.getValue() + " раз");
        }
    }
}
