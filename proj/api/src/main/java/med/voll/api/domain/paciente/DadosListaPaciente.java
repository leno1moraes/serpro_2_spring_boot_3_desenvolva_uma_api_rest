package med.voll.api.domain.paciente;

public record DadosListaPaciente(String nome, String email, String cpf, String telefone) {

    public DadosListaPaciente(Paciente paciente){
        this(paciente.getNome(), 
                paciente.getEmail(), 
                paciente.getCpf(), 
                paciente.getTelefone());
    }
}
