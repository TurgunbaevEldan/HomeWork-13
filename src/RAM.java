public class RAM {
    private String volume;
    private String manufacturer;

    public RAM(String volume, String manufacturer) {
        this.volume = volume;
        this.manufacturer = manufacturer;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;

    }
}
