package adapter;

public class UltraWheel {
    private int size;

    public UltraWheel(int size) {
        this.size = size;
    } //end of the constructor
    public int getWheelSize() {
        return size;
    } // the end of the method

    @Override
    public String toString() {
        return "Ultra Wheel" + "(" + size + ") inches";
    }
} //end of the class
