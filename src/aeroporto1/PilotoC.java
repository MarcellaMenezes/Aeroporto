
package aeroporto1;

public class PilotoC extends PessoaC {
    
    String tipoPiloto, empresa;
    
    public PilotoC(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
    }

    public PilotoC(String tipoPiloto, String empresa, String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
        this.tipoPiloto = tipoPiloto;
        this.empresa = empresa;
    }
    
    public String getTipoPiloto() {
        return tipoPiloto;
    }

    public void setTipoPiloto(String tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
}
