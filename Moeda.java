public class Moeda extends Item{
    public Moeda(Double valor){
        super("Moeda: R$",valor);
    }

@Override
public void exibir(){
    System.out.printf("Moeda: R$%f\n", getValor());
}
}

