package entities;

/**
 *
 * @author User
 */
public class Rendimento {
    private String categoria;
    private String nome;
    private Double mensal;
    private Double ocasional;

    public Rendimento(String categoria, String nome, Double mensal, Double ocasional) {
        this.categoria = categoria;
        this.nome = nome;
        this.mensal = mensal;
        this.ocasional = ocasional;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMensal() {
        return mensal;
    }

    public void setMensal(Double mensal) {
        this.mensal = mensal;
    }

    public Double getOcasional() {
        return ocasional;
    }

    public void setOcasional(Double ocasional) {
        this.ocasional = ocasional;
    }
    
}
