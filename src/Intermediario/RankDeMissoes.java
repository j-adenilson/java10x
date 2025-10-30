package Intermediario;

public enum RankDeMissoes {
    D("Muito Baixo", 2),
    C("Baixo", 4),
    B("Normal", 5),
    A("Médio", 6),
    S("Alto", 8),
    SSS("Muito Alto", 10);

    private String descricao;
    private int dificuldade;

    RankDeMissoes() {
    }

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
