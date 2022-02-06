package com.geekbrains;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;


public class PhoneBook {
    private Multimap<String, String> multimap;

    public Multimap<String, String> getMultimap() {
        return multimap;
    }

    public void setMultimap(Multimap<String, String> multimap) {
        this.multimap = multimap;
    }

    public PhoneBook(){
        this.multimap = ArrayListMultimap.create();
    }

    public void add(String surname, String phone){
        multimap.put(surname,phone);
    }

    public Collection<String> get(String surname){
        return multimap.get(surname);
    }

}
