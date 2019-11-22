package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    private Object[] objects;

    public BaseArray(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Object[] toArray() {
        return objects.clone();
    }

    @Override
    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public void setValue(int index) {
        objects[index] = 0;
    }

    @Override
    public String operationDescription() {
        return getClass().getSimpleName();
    }

    @Override
    public int size() {
        return objects.length;
    }
}
