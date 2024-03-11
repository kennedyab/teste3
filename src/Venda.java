import java.util.HashMap;
import java.util.Map;

public class Venda {
	private Map<String, Integer> itens;
	
	public Map<String, Integer> getItens() {
		return itens;
	}

	public Venda(HashMap<String, Integer> m) {
		this.itens = m;
	}
	
	public Venda() {
		this.itens = new HashMap<String, Integer>();
	}
	
	// o controller vai receber o id do item e envi[a-lo para cá
	public void addItem(int qtd, String item) {
		this.itens.put(item, qtd);
	}

	public void setItens(Map<String, Integer> itens) {
		this.itens = itens;
	}
}
