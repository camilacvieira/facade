public class BancoDeHoras extends Setor {

    private static BancoDeHoras bancodehoras = new BancoDeHoras();

    private BancoDeHoras() {};

    public static BancoDeHoras getInstancia() {
        return bancodehoras;
    }
}
