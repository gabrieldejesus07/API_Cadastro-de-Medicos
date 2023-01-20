package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record dadosDetalhadosPaciente(Long id, String nome, String email, String cpf, String telefone, Endereco endereco) {

    public dadosDetalhadosPaciente(Paciente paciente){

        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }

}
