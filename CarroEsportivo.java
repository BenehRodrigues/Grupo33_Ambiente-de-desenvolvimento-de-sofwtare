public class CarroEsportivo extends Carro {
 public CarroEsportivo(String marca, String modelo, int ano){
  super( marca, modelo, ano);
 }
public void AbrirTurbina(){
  System.out.println("Modo turbo ativado");

 }
 public void FecharTurbina(){
  System.out.println("Modo turbo desativado");

 }
  @Override
  public String toString() {
    return super.toString();
 }
}
