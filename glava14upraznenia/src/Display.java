
public class Display {

    private float displayInch;
    private String displayColor;

    public Display() {
        this.displayInch = 5;
    }

    public Display(float displayInch, String displayColor) {
        this.displayInch = displayInch;
        this.displayColor = displayColor;
    }

    public float getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(float displayInch) {
        this.displayInch = displayInch;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }
}
