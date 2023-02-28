public class SSD {
    private String Memory;
    private String disk;

    public SSD(String memory, String disk) {
        Memory = memory;
        this.disk = disk;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "Memory='" + Memory + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }

    public void setDisk(String disk) {
        this.disk = disk;

    }
}
