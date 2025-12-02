package prototype;

public class Cargo implements Cloneable {
    private String funcao;
    private String nivel;

    public Cargo(String funcao, String nivel){
        super();
        this.funcao = funcao;
        this.nivel = nivel;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "funcao='" + funcao + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
