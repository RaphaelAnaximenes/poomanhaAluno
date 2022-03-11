
public class Produto {
	public long codigo;
	public String nome;
	public String fornecedor;
	public int quantDisp;
	public double preco;

	

	public void imprimir() {
		System.out.println("[PRODUTO]: " + nome + " ----");
		System.out.println("Código: " + codigo);
		
		System.out.println("Fornecedor: " + fornecedor);
		System.out.println("Quant. Disponivel: " + quantDisp);
		System.out.println("Preço: " + preco);
				
	}
	
	public int saida (int valor){
		if(valor <= quantDisp) {
			quantDisp -= valor;
			System.out.println("Baixar valor do estoque[SUCESSO]");	
		return 1;
		}
		
		System.out.println("Baixar valor do estoque[FALHOU - VALOR INFERIOR AO DISPONIVEL]");
		return 1;
	}
	
	public int entrada (int valor){
		if(valor > 0) {
			quantDisp += valor;
			System.out.println("Inserir valor no estoque[SUCESSO]");
		return 1;
		}
		System.out.println("Inserir valor no  estoque[FALHOU]");
		return 0;
	}
	
	public void bonificar(double valor) {
			preco += (preco*(valor/100));
	}
}