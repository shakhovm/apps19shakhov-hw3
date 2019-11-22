package ua.edu.ucu;

import ua.edu.ucu.smartarr.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new DistinctDecorator(new BaseArray(new Object[]{"HELLO", "123", "HELLO"}));

        System.out.println(Arrays.toString(smartArray.toArray()));
    }
}
