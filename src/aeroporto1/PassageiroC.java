
package aeroporto1;


public class PassageiroC extends PessoaC{

    private CartaoDeEmbarqueC cE;
    boolean seguroDeVida;
    
    public PassageiroC(String nome, String cpf, int idade, char sexo) {
        super(nome, cpf, idade, sexo);
    }

    public PassageiroC(String nome, String cpf, int idade, char sexo, boolean seguroDeVida) {
        super(nome, cpf, idade, sexo);
        this.cE = cE;
        this.seguroDeVida = seguroDeVida;
    }

    public CartaoDeEmbarqueC getcE() {
        return cE;
    }

    public void setcE(CartaoDeEmbarqueC cE) {
        this.cE = cE;
    }

    public boolean getSeguroDeVida() {
        return seguroDeVida;
    }

    public void setSeguroDeVida(boolean seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }
       
}
