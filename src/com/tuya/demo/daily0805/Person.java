package com.tuya.demo.daily0805;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chendong
 * @date 2020/8/5 10:49 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Person {

    private String name;

    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
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
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("anni", "jane", "bob"));
        List<String> ages = new ArrayList<>(Arrays.asList("21", "22", "23"));


        List<List<String>> res = Stream.of(names, ages).collect(Collectors.toList());

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            people.add(new Person(names.get(i), ages.get(i)));
        }

        System.out.println(people.size() + " " + people);
    }
}
