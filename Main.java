
public class Main {
    public static void main(String[] args) {

        Motor motorbom = new Motor("Diesel", 1022);
        Condutor condutor1 = new Condutor("Joao", 123);

        Carro carro1 = new Carro("FORD", "Fiesta", "ABC1234", motorbom, condutor1);
        System.out.println("Carro 1:\n" + carro1);

        // fazendo carro sem condutor
        Carro carro2 = new Carro("Fiat", "Uno", "XYZ9876", new Motor("eletrico", 123));
        System.out.println("Carro 2:\n" + carro2);

        // botando o condutor depois
        carro2.setCondutor(new Condutor("Maria", 87766));

        // trocando motor
        carro2.setMotor("Diesel", 130);
        System.out.println("Carro 2 atualizado:\n" + carro2);

        // se era pra pedir pro usuario eu nao sei, so sei q nao entendi rs
        // bjos de luz gratidao tmj
    }
}