import java.util.Scanner;

public class GerenciarProduto {

    public Produto cc = new Produto();

    public static void main(String[] args){
    	System.out.println("Alunos:\n"
    			+ " Raphael Anaximenes - Código \n"
    			+ " Rodrigo Ribeiro - Modelagem  \n ");
        Scanner input = new Scanner(System.in);
        GerenciarProduto gerenciar = new GerenciarProduto();
        int opcao;
        do{
        	 //menu
        	
        
        	
            System.out.println("[Menu Principal]");
            System.out.println("1.. Cadastrar Produto\n");
            System.out.println("2.. Registrar entrada\n");
            System.out.println("3.. Registrar saida\n");
            System.out.println("4.. Consultar\n");
            System.out.println("5.. Bonificar\n");
            System.out.println("9.. Sair\n");
            System.out.println("Escolha sua opção: " + "\n -->");
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execRegistrarEntrada();
                    break;
                case 3:
                    gerenciar.execRegistrarSaida();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 5:
                	gerenciar.execBonificar();
                	break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);

    }

	public void execCadastrar() {
		
		Scanner input = new Scanner(System.in);
        System.out.println("Digite o Codigo: ");
        cc.codigo = Long.parseLong(input.nextLine());
        System.out.println("Digite o nome do produto: ");
        cc.nome = input.nextLine();
        System.out.println("Digite o nome do fornecedor: ");
        cc.fornecedor = input.nextLine();
   
        System.out.println("\n [ATENÇÃO]");
        System.out.println("Digite a quantidade para [CADASTRAR]: ");
        cc.quantDisp = Integer.parseInt(input.nextLine());
        System.out.println("Digite o preço unitário: ");
        cc.preco = Integer.parseInt(input.nextLine());
      
        System.out.println(" Produto Cadastro com [SUCESSO]");
        
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execRegistrarSaida(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de retirada: ");
        int valor = Integer.parseInt(input.nextLine());
        if(cc.saida(valor)==1) {
            System.out.println("Removido do inventario [SUCESSO]");
        }else{
            System.out.println("Removido do inventario [FALHOU]");
        }
    }
    public void execRegistrarEntrada(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade para [ADICIONAR]: ");
        int valor = Integer.parseInt(input.nextLine());
        cc.entrada(valor);
        
        System.out.println("[Fim do registro de entrada]");
    }
    public void execBonificar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o percentual da bonificação (1 = 1%, 100 = 100%)");
        int valor = Integer.parseInt(input.nextLine());
        System.out.println("[Bonificado valor deste produto]");
        System.out.println("De: " + cc.preco);
        cc.bonificar(valor);
        System.out.println("\n Para: "+ cc.preco);
        
    }

}