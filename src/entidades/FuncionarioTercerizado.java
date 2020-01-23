package entidades;

public class FuncionarioTercerizado extends Funcionario {
    private Double adicionalSalario;

    public FuncionarioTercerizado() {
       super();
    }

    public FuncionarioTercerizado(String nome, Integer hours, Double valorPorHora, Double adicionalSalario) {
        super(nome, hours, valorPorHora);
        this.adicionalSalario = adicionalSalario;
    }

    public Double getAdicionalSalario() {
        return adicionalSalario;
    }

    public void setAdicionalSalario(Double adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + adicionalSalario * 1.1;
    }
}
