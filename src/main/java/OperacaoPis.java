public class OperacaoPis implements Operacao {

    public float calcular(float valor, float desconto) {
        return (valor - desconto) * 1.165f;
    }
}