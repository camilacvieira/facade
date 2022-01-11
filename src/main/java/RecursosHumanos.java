public class RecursosHumanos extends Setor {

    private static RecursosHumanos rh = new RecursosHumanos();

    private RecursosHumanos() {};

    public static RecursosHumanos getInstancia() {
        return rh;
    }

}
