public class USBPort {
    private String portType;
    private  String idPort;

    public USBPort(String portType, String idPort) {
        this.portType = portType;
        this.idPort = idPort;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getIdPort() {
        return idPort;
    }

    @Override
    public String toString() {
        return "USBPort{" +
                "portType='" + portType + '\'' +
                ", idPort='" + idPort + '\'' +
                '}';
    }

    public void setIdPort(String idPort) {
        this.idPort = idPort;

    }
}
