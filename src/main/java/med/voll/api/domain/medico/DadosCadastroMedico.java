package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

/*A classe do tipo record é bem mais simples que a classe normal, atributos e metodos
são todos feitos por debaixo dos panos*/
public record DadosCadastroMedico(

        //Bean validation se utiliza de anotações para validadar os campos de acordo com regras específicas de preenchimento

        @NotBlank
        String nome,

        @NotBlank(message = "{email.obrigatorio}")
        @Email
        String email,

        @NotBlank(message = "{telefone.obrigatorio}")
        String telephone,

        @NotBlank(message = "{crm.obrigatorio}")
        @Pattern(regexp = "\\d{4,6}", message ="{crm.invalido}")
        String crm,

        @NotNull(message = "{especialidade.obrigatoria}")
        Especialidade especialidade,

        @NotNull(message = "{endereco.obrigatorio}")
        @Valid
        DadosEndereco endereco ) {
}
