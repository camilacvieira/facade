import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPendenciaBandoDeHorasPromocao() {
        Funcionario funcionario = new Funcionario();
        BancoDeHoras.getInstancia().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.promover());
    }

    @Test
    void deveRetornarPendenciaRecursosHumanosPromocao() {
        Funcionario funcionario = new Funcionario();
        RecursosHumanos.getInstancia().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.promover());
    }

    @Test
    void deveRetornarFuncionarioSemPendenciaPromocao() {
        Funcionario funcionario = new Funcionario();

        assertEquals(true, funcionario.promover());
    }

}