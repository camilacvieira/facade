public class FuncionarioFacade {

    public static boolean verificarPendenciasPromocao(Funcionario funcionario) {
        if (RecursosHumanos.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        if (BancoDeHoras.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarFuncionarioComPendencia(funcionario)) {
            return false;
        }
        return true;
    }
}
