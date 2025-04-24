public class Aviao {
    private double altitude; 
    private boolean tremDePousoBaixado;

    public Aviao(String marca, String modelo, int ano, double velocidadeAtual, double combustivel, boolean motorLigado, double limiteLitros) {
        super(marca, modelo, ano, combustivel);
        this.altitude = 0;
        this.tremDePousoBaixado = false;
    }
    @Override
    public void acelerar(){
        super.acelerar();
        super.setVelocidadeAtual(240);
    }
    public void decolar(){
        if(this.altitude == 0 ){
            this.altitude = 10000;
            this.tremDePousoBaixado = false;
            System.out.println("Avião decolou.");
        } else {
            System.out.println("Avião já está em voo.");
        }
    }

    public void subir(){
        if( this.altitude > 0){
            this.altitude += 1000;
            System.out.println("Avião subiu para " + this.altitude + " pés.");
        } else {
            System.out.println("Avião não pode subir, pois está no solo.");
        }
    }

    public void descer(){
        if(this.altitude > 0){
            this.altitude -= 1000;
            System.out.println("Avião desceu para " + this.altitude + " pés.");
        } else {
            System.out.println("Avião já está no solo.");
        }
    }

    public void aterrissar(){
        if(this.altitude > 0 ){
            for(;this.altitude > 0; this.altitude -= 1000){
                if(this.altitude <= 1000 ){
                    this.tremDePousoBaixado = true; 
                    System.out.println("Trem de pouso baixado.");
                }
            }
        } else {

        }
    }
}