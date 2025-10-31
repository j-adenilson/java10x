package Intermediario;

public class Kunai {
    private String tipoKunai;

    public Kunai() {
    }

    public Kunai(String tipoKunai) {
        this.tipoKunai = tipoKunai;
    }

    public String getTipoKunai() {
        return tipoKunai;
    }

    public void setTipoKunai(String tipoKunai) {
        this.tipoKunai = tipoKunai;
    }

    @Override
    public String toString(){
        return "Tipo da kunai: " + tipoKunai;
    }
}
