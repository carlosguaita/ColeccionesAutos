public class Motor {

    private double cilindraje;

    private String serie;

    private String tipoCombustible;

    public Motor(double cilindraje, String serie, String tipoCombustible) {
        this.cilindraje = cilindraje;
        this.serie = serie;
        this.tipoCombustible = tipoCombustible;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
