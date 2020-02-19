package main.lists;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CollectionBean {

    @Autowired
    private List<String> nameList;

    public void printNameList() {
        System.out.println(nameList);
    }
}