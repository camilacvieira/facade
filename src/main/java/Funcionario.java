
import java.text.Normalizer;

public class Funcionario {

    public boolean promover() {
        return FuncionarioFacade.verificarPendenciasPromocao(this);
    }
}