package prototype;

public class Funcionario implements Cloneable {
    private String nome;
    private Cargo cargo;
    private int id;

    public Funcionario(String nome, Cargo cargo, int id){
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException{
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.cargo = (Cargo) funcionarioClone.cargo.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}
