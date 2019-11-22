package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;


// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {

    private MyFunction function;

    public MapDecorator(SmartArray smartArray, MyFunction function) {
        super(smartArray);
        this.function = function;
    }

    @Override
    public Object[] toArray() {
        return Arrays.stream(
                smartArray.toArray()).map(function).toArray();
    }

    @Override
    public String operationDescription() {
        return "Map";
    }
}
