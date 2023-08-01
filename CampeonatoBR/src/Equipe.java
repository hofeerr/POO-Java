import java.lang.Comparable;

class Equipe implements Comparable<Equipe> {
    private String nome;
    private int totalPontos, totalVitorias, saldoGols, golsPro;  


    public Equipe(String nome, int totalPontos, int totalVitorias, int saldoGols, int golsPro){
        this.nome = nome;
        this.totalPontos = totalPontos;
        this.totalVitorias = totalVitorias;
        this.saldoGols = saldoGols;
        this.golsPro = golsPro;
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

    @Override
    public int compareTo(Equipe a) {
        if (Integer.compare(a.totalPontos, this.totalPontos) != 0) {
            return Integer.compare(a.totalPontos, this.totalPontos);
        }
        else if(Integer.compare(a.totalVitorias, this.totalVitorias) != 0) {
            return Integer.compare(a.totalVitorias, this.totalVitorias);
        }
        else if(Integer.compare(a.saldoGols, this.saldoGols) != 0) {
            return Integer.compare(a.saldoGols, this.saldoGols);
        }
        else if(Integer.compare(a.golsPro, this.golsPro) != 0) {
            return Integer.compare(a.golsPro, this.golsPro);
        }
        else {
            System.out.println("Informações Insuficientes"); 
            return 0;
        }
    }
}
