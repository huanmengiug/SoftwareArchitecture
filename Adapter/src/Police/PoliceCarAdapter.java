package Police;

public class PoliceCarAdapter extends CarController {
    private PoliceLamp lamp;
    private PoliceSound sound;

    
    public PoliceCarAdapter() {
        lamp = new PoliceLamp();
        sound = new PoliceSound();
    };

    @Override
    public void phonate() {
        sound.alarmSound();
    };

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    };
}
