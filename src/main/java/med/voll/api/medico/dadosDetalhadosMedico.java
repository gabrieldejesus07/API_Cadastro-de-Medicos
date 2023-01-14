package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record dadosDetalhadosMedico(Long id, String nome, String email, String crm, String telephone, Especialidade especialidade, Endereco endereco) {

    public dadosDetalhadosMedico(Medico medico){

        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelephone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
