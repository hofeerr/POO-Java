import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class Robo {
    String palavra;

    public Robo(String palavra) {
        this.palavra = palavra;
    }

    public Collection<String> palavrasValidas(){
        return geraPalavras(palavra);
    }
    
    public int palavraCompleta(String palavra) {
        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i) == '?') {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<String> geraPalavras(String palavra) {
        int pos = palavraCompleta(palavra);
        ArrayList<String> palavras = new ArrayList<>();
        if(pos == -1) {
            palavras.add(palavra);
            return palavras;
        } 
        else {
            if((pos == 0) || (pos > 0 && palavra.charAt(pos -1) != 'a') &&
            ((pos == palavra.length()-1) || (pos < palavra.length() -1 && palavra.charAt(pos + 1) != 'a'))) {
                char[] chars = palavra.toCharArray(); // converte pro vetor de caractere
                chars[pos] = 'a'; //troca no vetor de caracteres
                String s = String.valueOf(chars); //trasnforma o vetor de char em string dnv
                palavras.addAll(geraPalavras(s)); //gero todas as palavras de s; adciono todos os elementos do array list no s;
            }
            char[] chars = palavra.toCharArray(); 
            chars[pos] = 'b'; 
            String s = String.valueOf(chars); 
            palavras.addAll(geraPalavras(s)); 
            return palavras;
        }
    }

}

class Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Robo r = new Robo(s);
        for(String palavra : r.palavrasValidas()){
            System.out.println(palavra);
        }

    }   
}

