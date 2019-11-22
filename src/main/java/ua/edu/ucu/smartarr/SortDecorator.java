package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{


    public SortDecorator(SmartArray smartArray, MyComparator cmp)
    {
        super(smartArray);
        Object[] objects = smartArray.toArray();
        Arrays.sort(objects, cmp);
        this.smartArray.setObjects(objects);
    }
}
