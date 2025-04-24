public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;
    private double combustivel;
    private boolean motorLigado;


    public Veiculo(String marca, String modelo, int ano, double velocidadeAtual, double combustivel, boolean motorLigado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.combustivel = combustivel;
        this.motorLigado = false;
    }
    public boolean getMotorLigado(){
        
    }

    public void ligarMotor() {
        if(this.motorLigado){
            System.out.println("O motor já está ligado.");
        } else {
            motorLigado = true;
            System.out.println("Motor ligado.");
        }
    }

    public void desligarMotor() {
        if(this.motorLigado){
            this.motorLigado = false;
            System.out.println("Motor desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public void acelerar() {
        if(!this.motorLigado){
            System.out.println("Não é possível acelerar com o motor desligado.");
        } else {
            if(this.combustivel <= 0){
                System.out.println("Não há combustivel :<");
            } else {
                this.velocidadeAtual = this. velocidadeAtual + 10;
                this.combustivel -= 0.5; // this.combustivel = this.combustivel + 0.5;
                System.out.println("Velocidade atual é " + this.velocidadeAtual);
            }
        }
    }

    public void frear() {
        if(this.velocidadeAtual > 0){
            this.velocidadeAtual = this.velocidadeAtual - 10;
            if(velocidadeAtual < 0){
                this.velocidadeAtual = 0;
            }
            System.out.println("A velocdiade atual é " + this.velocidadeAtual);
        } else {
            System.out.println("o carro já está parado.");
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + this.marca +"\n"
                            + "Modelo: " + this.modelo + "\n"
                            + "Ano: " + ano + "\n"
                            + "velocidade atual: " + velocidadeAtual + " km/h \n"
                            + "Motor ligado: " + (this.motorLigado? "sim":"não") + "\n" 
                            + "Combustivel: " + this.combustivel
                            );
    }

    public void abastecer(double combustivel){
        if(this.velocidadeAtual <= 0){
            if(!this.motorLigado){
                this.combustivel = this.combustivel + combustivel;
                System.out.println("Abastecer com " + combustivel + " litros.");
                System.out.println("Combustivel atual: " + this.combustivel + " litors.");
            }    
        }
    }

    public double statusCombustivel(){
        return this.combustivel;
    }



} 