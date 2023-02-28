public class Keyboard {
    private String backlight;
    private String additionalDigits;

    public Keyboard(String backlight, String additionalDigits) {
        this.backlight = backlight;
        this.additionalDigits = additionalDigits;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "backlight='" + backlight + '\'' +
                "additionalDigits='" + additionalDigits + '\'' +
                '}';
    }

    public String getAdditionalDigits() {
        return additionalDigits;

    }
}
