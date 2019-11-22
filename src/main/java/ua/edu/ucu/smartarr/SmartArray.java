package ua.edu.ucu.smartarr;

public interface SmartArray {


    Object[] toArray(); // return array with SmartArray elements

    String operationDescription(); // return current operation name applied to SmartArray

    //It is just for testing
    void setValue(int index);

    int size(); // return SmartArray size

    SmartArray clone(SmartArray clone);

}
