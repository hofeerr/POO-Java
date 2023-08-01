import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Empresa{
    
    ArrayList<Empregado> funcionarios = new ArrayList<Empregado>();

    Empresa(){
    
    }

    public void adicionaEmpregado(Empregado e){
        funcionarios.add(e);
        
    }

    public void mostraEmpregado(){
        System.out.println("Empresa: ");
        //for(Empregado i : funcionarios ){
        for(int i = 0; i < funcionarios.size(); i ++) {
            System.out.println(funcionarios.get(i).toString());
        }

    }
    public double calculaFolha(){
        double saldo = 0;
        for(int i = 0; i < funcionarios.size(); i ++) {
           saldo += funcionarios.get(i).pagamento();
        }
        return saldo;
    }

}