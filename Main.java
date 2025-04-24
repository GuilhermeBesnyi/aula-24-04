public class Main {
    public static void main(String[] args){
        Carro Senna = new Carro("mclaren", "Senna", 2017, 39, 28, false, 45);

        Senna.ligarMotor();
        Senna.acelerar();
        Senna.acelerar();
        Senna.acelerar();
        Senna.exibirInfo();

        
    }
}
