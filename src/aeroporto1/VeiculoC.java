
package aeroporto1;


public abstract class VeiculoC {
    String placa, empresa;
    int capacidade;

    public VeiculoC(String placa, String empresa, int capacidade) {
        this.placa = placa;
        this.empresa = empresa;
        this.capacidade = capacidade;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }   
    
}
