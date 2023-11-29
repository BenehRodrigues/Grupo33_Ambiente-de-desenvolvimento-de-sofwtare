public class Carro {
  private String marca, modelo;
  private int ano;

  public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void ligar() {
    System.out.println("Ligando o veículo...");
  }

  public void subirMarcha(){
    System.out.println("Aumentando a Marcha");
  }

  public void descerMarcha(){
    System.out.println("Diminuindo a marcha");
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

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }


  @Override
  public String toString() {
    return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
  }
}
