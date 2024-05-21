public class ArmaDeLarga extends Arma implements Comparable<ArmaDeLarga>{
    private boolean tieneSelloRENAR;
    private String descripcionDeUso;
    private int nivelDelArma;

    public ArmaDeLarga(Policia policiaAsociado, int cantDeMuniciones, int alcanceMetros, String marca, int calibre, String estado, boolean tieneSelloRENAR, String descripcionDeUso, int nivelDelArma) {
        super(policiaAsociado, cantDeMuniciones, alcanceMetros, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.descripcionDeUso = descripcionDeUso;
        this.nivelDelArma = nivelDelArma;
    }

    public boolean isTieneSelloRENAR() {
        return tieneSelloRENAR;
    }

    public void setTieneSelloRENAR(boolean tieneSelloRENAR) {
        this.tieneSelloRENAR = tieneSelloRENAR;
    }

    public String getDescripcionDeUso() {
        return descripcionDeUso;
    }

    public void setDescripcionDeUso(String descripcionDeUso) {
        this.descripcionDeUso = descripcionDeUso;
    }

    public int getNivelDelArma() {
        return nivelDelArma;
    }

    public void setNivelDelArma(int nivelDelArma) {
        this.nivelDelArma = nivelDelArma;
    }

    @Override
    public int compareTo(ArmaDeLarga o) {
        if (this.nivelDelArma > o.nivelDelArma) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return "ArmaDeLarga{" +
                "tieneSelloRENAR=" + tieneSelloRENAR +
                ", descripcionDeUso='" + descripcionDeUso + '\'' +
                ", nivelDelArma=" + nivelDelArma +
                '}';
    }
}


