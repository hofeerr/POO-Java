import java.util.ArrayList;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Mercantil {
    public int totalCaixas;
    private ArrayList<Pessoa> fila = new ArrayList<Pessoa>();
    private Pessoa[] caixas = new Pessoa[totalCaixas];
    
   
    Mercantil(int qtdCaixas){
        this.totalCaixas = qtdCaixas;
        this.caixas = new Pessoa [qtdCaixas];
        for(int i = 0; i < qtdCaixas; i++) {
            caixas[i] = null;
        }        
        
    }

    public void chegar(Pessoa p){ //arrive
        fila.add(p);
 
    }

    public void chamarNoCaixa(int indice) { // call
            if(fila.isEmpty() == true) {
                System.out.println("fail: fila vazia");
                return;

            }
            else {
                if(caixas[indice] == null) {
                    caixas[indice] = fila.get(0);
                    fila.remove(0);
                }
                else {
                    System.out.println("fail: caixa cheio");
                }
            }
        }


    public Pessoa finalizarAtendimento(int indice) { //finish 
            Pessoa vazia = caixas[indice];
            caixas[indice] = null;
            return vazia;
    }

    public String toString(){ //show
        String resp = "";
        // for(tipo instancia : estrutura) 
        resp += "|";
        for(int i = 0; i < totalCaixas; i++) {
            resp += i + ":";
            if(caixas[i] == null) {
                resp += "-----|";
            }
            else {
                resp += caixas[i].getNome() + "|";
            }
        }
        resp += "\nEspera: [";
        //for(Pessoa qualquer : fila) {
        //    resp+= qualquer.getNome() + ", ";
        //}
        // resp[resp.size()-2] = ']';

        for(int i = 0; i < fila.size(); i++) {
            if(i == fila.size() - 1) {
                resp += fila.get(i).getNome() + "]";  //get(i) pega a pessoa do array naquela posição // getNome pela o nome da pessoa do get(i)

            }
            else {
            resp+= fila.get(i).getNome() + ", ";
            }
        }
        if(fila.isEmpty()) {
            resp += "]";
        }

        return resp;
    }

}