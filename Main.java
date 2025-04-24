public class Main {
    public static void main(String[] args){
        Carro FType75 = new Carro("mclaren", "Senna", 2017, 39, 28, false, 45);
        // HRV = new Veiculo("Honda", "suv", 2023, 15, 20, false);

        FType75.ligarMotor();
        FType75.acelerar();
        FType75.acelerar();
        FType75.acelerar();
        FType75.exibirInfo();

        
    }
}
