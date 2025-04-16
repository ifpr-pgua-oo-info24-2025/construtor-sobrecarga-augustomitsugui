public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;

    public Carro(String marca, String modelo, String placa, Motor motor, Condutor condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = condutor;
    }

    public Carro(String marca, String modelo, String placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = null;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setMotor(String tipo, int potencia) {
        this.motor = new Motor(tipo, potencia);
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    @Override
    public String toString() {
        String dados = "Marca: " + marca + "\n";
        dados += "Modelo: " + modelo + "\n";
        dados += "Placa: " + placa + "\n";
        dados += "Motor: " + motor.getTipo() + " - " + motor.getPotencia() + " cv\n";

        if (condutor != null) {
            dados += "Condutor: " + condutor.getNome() + " (CNH: " + condutor.getCnh() + ")\n";
        } else {
            dados += "Condutor: Nenhum\n";
        }

        return dados;
    }

}
