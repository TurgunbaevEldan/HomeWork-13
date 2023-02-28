public class Display {
    private String diagonal;
    private String manufacturer;
    private String matrixType;

    public Display(String diagonal, String manufacturer, String matrixType) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.matrixType = matrixType;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMatrixType() {
        return matrixType;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal='" + diagonal + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", matrixType='" + matrixType + '\'' +
                '}';
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;

    }
}
