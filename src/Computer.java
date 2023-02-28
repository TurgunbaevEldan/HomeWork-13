public class Computer {
    private String display;
    private String brand;
    private String color;
    private String videoCard;

    public Computer(String display, String brand, String color, String videoCard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.videoCard = videoCard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVideoCard() {
        return videoCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", videoCard='" + videoCard + '\'' +
                '}';
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;

    }
}
