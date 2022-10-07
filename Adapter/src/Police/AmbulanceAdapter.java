package Police;

public class AmbulanceAdapter extends CarController{
    private AmbulanceLamp lamp;
    private AmbulanceSound sound;

    
    public AmbulanceAdapter() {
        lamp = new AmbulanceLamp();
        sound = new AmbulanceSound();
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
