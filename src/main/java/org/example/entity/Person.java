package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private  String firstName;
    private  String lastName;

    private void helloPerson(){
        System.out.println("Hello " + getFirstName());
    }
}
