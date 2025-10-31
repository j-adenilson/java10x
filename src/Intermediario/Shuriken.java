package Intermediario;

public class Shuriken {
    private int quantidade;

    public Shuriken() {
    }

    public Shuriken(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString(){
        return "Quantidade de Shuriken: " + quantidade;
    }
}
