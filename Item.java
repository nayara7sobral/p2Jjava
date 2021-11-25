public abstract class Item{
    private String descricao;
    private Double valor;

    public Item(String descricao, Double valor){
        setDescricao(descricao);
        setValor(valor);
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Double getValor(){
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }

    public void exibir(){
        System.out.printf("%s: %f\n", getDescricao(), getValor());
    }
}