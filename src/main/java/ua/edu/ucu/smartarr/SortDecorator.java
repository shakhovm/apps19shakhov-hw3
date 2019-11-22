package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    MyComparator cmp;
    public SortDecorator(SmartArray smartArray, MyComparator cmp) {
        super(smartArray);
        this.cmp = cmp;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = smartArray.toArray();
        Arrays.sort(objects, cmp);
        return objects;
    }

    @Override
    public String operationDescription() {
        return "Sort";
    }
}
