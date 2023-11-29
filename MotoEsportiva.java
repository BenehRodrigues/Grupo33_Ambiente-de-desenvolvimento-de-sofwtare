public class MotoEsportiva extends Moto {
public MotoEsportiva(String marca, String modelo, int ano, int cilindrada){
super( marca, modelo, ano, cilindrada);
}

    public void Acelerar() {
        System.out.println("Acelerando moto");
    }

    public void Frear() {
        System.out.println("Freando moto");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
