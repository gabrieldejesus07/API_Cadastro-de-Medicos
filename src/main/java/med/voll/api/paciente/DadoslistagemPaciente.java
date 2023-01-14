package med.voll.api.paciente;

public record DadoslistagemPaciente(Long id, String nome, String email, String cpf) {

    public DadoslistagemPaciente(Paciente paciente) {

           this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
