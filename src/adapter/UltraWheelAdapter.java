package adapter;

import com.designpatterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {
    public UltraWheelAdapter(UltraWheel ultraWheel) {
        //public AbstractWheel(int Size, boolean wide)
        super(ultraWheel.getWheelSize(),false);
    }
}
