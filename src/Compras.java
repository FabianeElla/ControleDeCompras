

public class Compras implements Comparable<Compras> {
    private String produto;
    private double valor;

    public Compras(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public int compareTo(Compras proximaCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(proximaCompra.getValor()));
        }

    @Override
    public String toString() {
        return this.produto + " - " + this.valor;
    }
}
