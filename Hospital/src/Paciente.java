import java.util.Collection;
import java.util.TreeMap;

class Paciente implements IPaciente {
    protected String sender;
    protected String diagnostico;
    protected TreeMap<String, IMedico> medicos = new TreeMap<>();
    
    public Paciente(String sender, String diagnostico) {
        this.sender = sender;
        this.diagnostico = diagnostico;
    }
    
    public String getId(){
        return this.sender;
    }
    
    public void addMedico(IMedico medico) {
        medicos.put
    }

    public void removerMedico(String idMedico){
        medicos.remove(idMedico);
    }
    
    public Collection<IMedico> getMedicos() {
        
    }

    public String getDiagnostico()  {
        return this.diagnostico;
    }
    
    public String toString() {
        
    }
}