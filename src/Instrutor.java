public class Instrutor {
    String nome;
    String cpf;
    String cnh;

    public Instrutor(String nome, String cpf, String cnh) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public String toString() {
        return nome + " - CPF: " + cpf;
    }
}
