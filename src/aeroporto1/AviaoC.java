
package aeroporto1;

public class AviaoC extends VeiculoC {
    float tamanhoAsa;
    
    public AviaoC(String placa, String empresa, int capacidade) {
        super(placa, empresa, capacidade);
    }

    public AviaoC(float tamanhoAsa, String placa, String empresa, int capacidade) {
        super(placa, empresa, capacidade);
        this.tamanhoAsa = tamanhoAsa;
    }
    

    public float getTamanhoAsa() {
        return tamanhoAsa;
    }

    public void setTamanhoAsa(float tamanhoAsa) {
        this.tamanhoAsa = tamanhoAsa;
    }
    
    
}
