public class Moto {
    private String marca, modelo;
    private int cilindrada, ano;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cilindrada = cilindrada;
    }



    public void ligar() {
        System.out.println("Ligando o veículo...");
    }


    public void ligarSeta() {
        System.out.println("Seta ligada");
    }

    public void desligarSeta() {
        System.out.println("Seta desligada");
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


    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


        public int setAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }



    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + "Ano: " + ano;
    }
}