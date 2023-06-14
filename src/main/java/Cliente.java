public class Cliente {

    private float imposto;

    public float getImposto() {
        return imposto;
    }

    public void calcularPis(float nota1, float nota2) {
        Contador contador = new Contador(nota1, nota2);
        this.imposto = contador.calcular(new OperacaoPis());
    }

    public void calcularCofins(float nota1, float nota2) {
        Contador contador = new Contador(nota1, nota2);
        this.imposto = contador.calcular(new OperacaoCofins());
    }
}