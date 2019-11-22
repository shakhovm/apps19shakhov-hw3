package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {

    private Object[] objects;

    public BaseArray(Object[] objects) {
        this.objects = objects.clone();
    }

    @Override
    public Object[] toArray() {
        return objects.clone();
    }


    @Override
    public void setValue(int index) {
        objects[index] = 0;
    }

    @Override
    public String operationDescription() {
        return "No Operation";
    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public SmartArray clone(SmartArray smartArray) {
        return new BaseArray(smartArray.toArray());
    }
}
