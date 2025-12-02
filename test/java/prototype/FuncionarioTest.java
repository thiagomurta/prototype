package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Funcionario funcionario = new Funcionario("Thiago", new Cargo("Desenvolvedor", "Junior"), 123);

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setNome("Maria");
        funcionarioClone.setId(456);
        funcionarioClone.getCargo().setNivel("Pleno");

        assertEquals("Funcionario{id=123, nome='Thiago', cargo=Cargo{funcao='Desenvolvedor', nivel=Junior}}", funcionario.toString());
        assertEquals("Funcionario{id=456, nome='Maria', cargo=Cargo{funcao='Desenvolvedor', nivel=Pleno}}", funcionarioClone.toString());
    }

}