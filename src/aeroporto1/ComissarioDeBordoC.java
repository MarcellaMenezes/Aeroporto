
package aeroporto1;


public class ComissarioDeBordoC extends PessoaC{
    String empresa;
    
    public ComissarioDeBordoC(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
    }

    public ComissarioDeBordoC(String empresa, String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
}
