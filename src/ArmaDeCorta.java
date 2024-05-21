public class ArmaDeCorta extends Arma{
    private boolean esAutomatica;

    public ArmaDeCorta(Policia policiaAsociado, int cantDeMuniciones, int alcanceMetros, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policiaAsociado, cantDeMuniciones, alcanceMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }

    public void esEfectivaADistancia(){
        if(this.getAlcanceMetros() > 200){
            System.out.println("Es efectiva a mas de 200m");
        } else {
            System.out.println("No es efectiva a mas de 200m");
        }
    }
}

