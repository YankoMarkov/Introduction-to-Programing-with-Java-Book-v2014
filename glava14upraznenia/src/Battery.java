
public class Battery {

    private String model;
    private float idleTime;
    private float hoursTalk;

    public Battery() {
        this.model = null;
        this.hoursTalk = 0;
        this.idleTime = 0;
    }

    public Battery(String model, float hoursTalk, float idleTime) {
        this.model = model;
        this.hoursTalk = hoursTalk;
        this.idleTime = idleTime;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(float idleTime) {
        this.idleTime = idleTime;
    }

    public float getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(float hoursTalk) {
        this.hoursTalk = hoursTalk;
    }
}
