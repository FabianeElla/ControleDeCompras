import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cartao {
    private double credito;
    private double saldo;
    private List<Compras> listaCompras;

    public Cartao(double credito) {
        this.credito = credito;
        this.saldo = credito;
        this.listaCompras = new ArrayList<>();
    }

    public boolean verificaLimite(Compras compra){
        if(compra.getValor() <= this.saldo){
            this.saldo = saldo - compra.getValor();
            listaCompras.add(compra);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getListaCompras() {
        return listaCompras;
    }
}
