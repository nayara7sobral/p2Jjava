import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        List <Item> itens = new ArrayList <> ();
        int opcao;
        Double inserirValor = 0.0;
        Double soma = 0.0;
        String inserirDesc;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar um item a colecao.\n2. Exibir colecao de itens.\n3. Exibir valor da colecao.\n0-Sair"));
            switch(opcao){
                case 1:
                    int inserirItem = Integer.parseInt(JOptionPane.showInputDialog("1. Adicionar Moeda\n2-Adicionar SeloRegular\n3-Adicionar SeloComemorativo"));
                    switch(inserirItem){
                        case 1:
                            inserirValor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da moeda"));
                            itens.add(new Moeda(inserirValor));
                            JOptionPane.showMessageDialog(null,"Moeda armazenada");
                            break;
                        case 2:
                            inserirValor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do SeloRegular"));
                            inserirDesc = JOptionPane.showInputDialog("Insira a descricao do SeloRegular");
                            itens.add(new SeloRegular(inserirDesc,inserirValor));
                            JOptionPane.showMessageDialog(null,"SeloRegular armazenado");
                            break;
                        case 3:
                        inserirValor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do SeloComemorativo"));
                        inserirDesc = JOptionPane.showInputDialog("Insira a descricao do SeloComemorativo");
                        itens.add(new SeloComemorativo(inserirDesc,inserirValor));
                        JOptionPane.showMessageDialog(null,"SeloComemorativo armazenado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcao invalida");
                    }
                case 2:
                    for(int i=0; i < itens.size(); i++){
                        itens.get(i).exibir();
                    }
                    break;
                case 3:
                    for(int i=0; i < itens.size(); i++){
                        soma = soma + itens.get(i).getValor();
                    }
                    System.out.printf("A somatoria e -> %f", soma);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Ate logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
            }
        }while(opcao != 0);
    }
}
