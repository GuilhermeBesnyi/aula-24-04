public class Carro extends Veiculo {

    private double limiteLitros;

    
    public Carro(String marca, String modelo, int ano, double velocidadeAtual, double combustivel, boolean motorLigado, double limiteLitros) {
        super(marca, modelo, ano, velocidadeAtual, combustivel, motorLigado);
        this.limiteLitros = limiteLitros;
    }

    @Override
    public void abastecer(double combustivel){
        if((this.limiteLitros - super.statusCombustivel()) >= combustivel){
            super.abastecer(combustivel);
        }
    }
}
