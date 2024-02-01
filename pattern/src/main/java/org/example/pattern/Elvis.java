package org.example.pattern;

public class Elvis {
    private static final Elvis inc = new Elvis();
    private static  final String name = "aboba";

    private Elvis(){}

    public static Elvis getInstance()
    {
        return inc;
    }


}
