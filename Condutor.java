public class Condutor {
    private String nome;
    private int cnh;

    public Condutor(String nome, int cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
}
