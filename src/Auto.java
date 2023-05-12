public class Auto {

    private Duenio duenio;
    private Motor motor;
    private String placa;
    private String color;

    public Auto(Duenio duenio, Motor motor, String placa, String color) {
        this.duenio = duenio;
        this.motor = motor;
        this.placa = placa;
        this.color = color;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
