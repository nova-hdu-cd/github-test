package com.tuya.demo.daily0805;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chendong
 * @date 2020/8/5 10:49 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("anni", "jane", "bob"));
        List<Person> personList = names.stream().map(Person::new).collect(Collectors.toList());
        personList.forEach(System.out::println);
    }
}
