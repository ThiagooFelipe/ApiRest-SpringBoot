package med.voll.api.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if(logradouro != null){
            this.logradouro = dados.logradouro();
        }
        if(bairro != null){
            this.bairro = dados.bairro();
        }
        if(cep != null){
            this.cep = dados.cep();
        }
        if(uf != null) {
            this.uf = dados.uf();
        }
        if(cidade != null){
            this.cidade = dados.cidade();
        }
        if(numero != null){
            this.numero = dados.numero();
        }
        if(complemento != null){
            this.complemento = dados.complemento();
        }
    }
}
