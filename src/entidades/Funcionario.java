package entidades;

public class Funcionario {
    private String nome;
    private Integer hours;
    private Double valorPorHora;

    public Funcionario(){
    }

    public Funcionario(String nome, Integer hours, Double valorPorHora) {
        this.nome = nome;
        this.hours = hours;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double pagamento(){
        return hours * valorPorHora;
    }
}
