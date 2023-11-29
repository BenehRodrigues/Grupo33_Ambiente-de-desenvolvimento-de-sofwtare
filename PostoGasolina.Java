public class PostoGasolina {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla Cross", 2024);
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo("Ferrari", "488 GTB", 2023);
        Moto minhaMoto = new Moto("Honda", "Biz", 125, 2010);
        MotoEsportiva minhaMotoEsportiva = new MotoEsportiva("Yamaha", "R1", 999, 2012);

        System.out.println("Carro!");
        meuCarro.ligar();
        meuCarro.subirMarcha();
        meuCarro.descerMarcha();

        System.out.println("Carro Esportivo!");
        meuCarroEsportivo.ligar();
        meuCarroEsportivo.AbrirTurbina();
        meuCarroEsportivo.FecharTurbina();

        System.out.println("Moto!");
        minhaMoto.ligar();
        minhaMoto.ligarSeta();
        minhaMoto.desligarSetar();

        System.out.println("Moto Esportiva!");
        minhaMotoEsportiva.ligar();
        minhaMotoEsportiva.Acelerar();
        minhaMotoEsportiva.Frear();
    }
}