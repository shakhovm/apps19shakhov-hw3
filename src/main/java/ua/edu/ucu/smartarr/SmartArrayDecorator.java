package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray.clone(smartArray);
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
        return "No Operation";
    }

    @Override
    public int size() {
        return smartArray.size();
    }

    public SmartArray clone(SmartArray smartArray) {
        return new BaseArray(smartArray.toArray());
    }

}
