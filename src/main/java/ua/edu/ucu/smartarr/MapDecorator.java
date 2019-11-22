package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;


// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {


    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        this.smartArray.setObjects(Arrays.stream(
                this.smartArray.toArray()).map(function).toArray());
    }
}
