public class Arma {
    private Policia policiaAsociado;
    private int cantDeMuniciones;
    private int alcanceMetros;
    private String marca;
    private int calibre;
    private String estado;

    public Arma(Policia policiaAsociado, int cantDeMuniciones, int alcanceMetros, String marca, int calibre, String estado) {
        this.policiaAsociado = policiaAsociado;
        this.cantDeMuniciones = cantDeMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Policia getPoliciaAsociado() {
        return policiaAsociado;
    }

    public void setPoliciaAsociado(Policia policiaAsociado) {
        this.policiaAsociado = policiaAsociado;
    }

    public int getCantDeMuniciones() {
        return cantDeMuniciones;
    }

    public void setCantDeMuniciones(int cantDeMuniciones) {
        this.cantDeMuniciones = cantDeMuniciones;
    }

    public int getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(int alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void estaEnCondiones(){
        if (this.estado == "En uso" && this.calibre >= 9){
            System.out.println("Esta arma esta en condiciones de ser usada");
        } else {
            System.out.println("Esta arma no esta en condiciones de ser usada");
        }
    }
}
