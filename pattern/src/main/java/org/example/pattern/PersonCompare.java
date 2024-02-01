package org.example.pattern;

public class PersonCompare implements Comparable<PersonCompare> {
    private String name;
    private int age;


    @Override
    public int compareTo(PersonCompare o) {
        return Integer.compare(this.age,o.age);
    }
}
