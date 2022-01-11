import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Funcionario> funcionarioComPendencia = new ArrayList<Funcionario>();

    public void addFuncionarioPendente(Funcionario funcionario) {
        this.funcionarioComPendencia.add(funcionario);
    }

    public boolean verificarFuncionarioComPendencia(Funcionario funcionario) {
        return this.funcionarioComPendencia.contains(funcionario);
    }

}