public class Contador {

    private float valor;
    private float desconto;

    public Contador(float valor, float desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(valor, desconto);
    }
}