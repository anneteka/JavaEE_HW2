package main.field;

import org.springframework.stereotype.Component;

//@Component
public class BreadField implements ItemField {

    BreadField(){
        System.out.println("bread created");
    };

    public String getName() {
        return "bread";
    }
}
