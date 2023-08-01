import java.util.Collection;
import java.util.TreeMap;

class Medico implements IMedico{
    String sender;
    String classe;
    TreeMap<String, IPaciente> pacientes = new TreeMap<>();
    
    public Medico(String sender, String classe){
        this.sender = sender;
        this.classe = classe;    
    }
    
    public String getId(){
        return this.sender;
    }
    
    public void addPaciente(IPaciente paciente){
        pacientes.put(classe, paciente);
    }

    public void removerPaciente(String idPaciente) {
        pacientes.remove(idPaciente);
    }

    public Collection<IPaciente> getPacientes() {
        

    }

    public String getClasse(){
        return this.classe;
    }

    public String toString(){

    }
}