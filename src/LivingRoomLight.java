import com.bereket.LightSwitch;

public class LivingRoomLight extends LightSwitch {
    private int dimPercentage;


    public LivingRoomLight(boolean lightOn, int dimPercentage) {
        super(lightOn);
        this.dimPercentage = dimPercentage;
    }

    public int getDimPercentage() {
        return dimPercentage;
    }

    public void setDimPercentage(int dimPercentage) {
        this.dimPercentage = dimPercentage;
    }

    @Override
    public void setLightControl(boolean onOrOff) {
        super.setLightControl(onOrOff);
        if (onOrOff){
            this.setDimPercentage(100);
        }
    }
}
