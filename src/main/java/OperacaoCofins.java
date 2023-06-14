public class OperacaoCofins implements Operacao {

    public float calcular(float valor, float desconto) {
        return (valor - desconto) * 1.76f;
    }
}