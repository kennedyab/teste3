import java.util.HashMap;
import java.util.Map;

import assist.Tuple;


public class Controller {
	Map<String, Item> itens;
	
	public Controller() {
		this.itens = new HashMap<>();
	}
	
	public void addItem(String n, String id, double p) {
		Item i = new Item(n,  id,  p);
		itens.put(id, i);
	}
	
	public void realizarVenda(HashMap<String, Integer> compras) {
		Venda v = new Venda(compras);
		
		int arraySize = Ven
		Tuple[] t = new Tuple[10];
		for 
		
		Pagamento p = new Pagamento(null)
	}
}
