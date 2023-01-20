package med.voll.api.domain.medico;

public record DadosListagemMedido(Long id, String nome, String email, String crm, Especialidade especialidade) {



    public DadosListagemMedido(Medico medico){
        //Nesse trecho o construtor está chamando o primeiro construtor principal.
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
