class Equipe {
    private String nome;
    private int totalPontos;
    private int totalVitorias;
    private int saldoGols;
    private int golsPro;
    private int pontuacaoFinal;

    public Equipe(String nome, int totalPontos, int totalVitorias, int saldoGols, int golsPro){
        this.nome = nome;
        this.totalPontos = totalPontos;
        this.totalVitorias = totalVitorias;
        this.saldoGols = saldoGols;
        this.golsPro = golsPro;
        this.pontuacaoFinal = totalPontos + totalVitorias + saldoGols + golsPro;

    }

    public String getNome() {
        return nome;
    }
    public int getGolsPro() {
        return golsPro;
    }
    public int getSaldoGols() {
        return saldoGols;
    }   
    public int getTotalVitorias() {
        return totalVitorias;
    }
    public int getTotalPontos() {
        return totalPontos;
    }

}
