package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public void setValue(int index) {
        smartArray.setValue(index);
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return getClass().getSimpleName();
    }

    @Override
    public void setObjects(Object[] objects) {
        smartArray.setObjects(objects);
    }

    @Override
    public int size() {
        return smartArray.size();
    }

}
