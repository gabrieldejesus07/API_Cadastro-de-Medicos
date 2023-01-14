package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

/*A classe do tipo record é bem mais simples que a classe normal, atributos e metodos
são todos feitos por debaixo dos panos*/
public record DadosCadastroMedico(

        //Bean validation se utiliza de anotações para validadar os campos de acordo com regras específicas de preenchimento

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telephone,

        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull //Não é notblank pois o not blank é só para strings
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco ) {
}
