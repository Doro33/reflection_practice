package org.example;

import org.example.entity.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> personClass = Person.class;
        final Person person = new Person("sina","mahmoudi");

        System.out.println(personClass.getSimpleName());

        Field[] personsFields=personClass.getDeclaredFields();
        System.out.println(Arrays.toString(personsFields));
        System.out.println(personsFields.length);

        Field field = personClass.getDeclaredField("firstName");
        field.setAccessible(true);
        System.out.println(field.get(person));

        Method[] personMethods = personClass.getDeclaredMethods();
        System.out.println(Arrays.toString(personMethods));

        Method helloPersson = personClass.getDeclaredMethod("helloPerson");
        helloPersson.setAccessible(true);
        field.set(person,"doro");
        helloPersson.invoke(person);

    }
}