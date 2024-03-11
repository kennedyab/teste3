import assist.Tuple;

public class Pagamento {
	private double total;
	
	public Pagamento(Tuple[] itens) {
		this.total = this.calcTotal(itens);
	}

	private double calcTotal(Tuple[] itens) {
		double resp = 0;
		for(Tuple i : itens) {
			double price = i.getPrice();
			int qtd = i.getQtd();
			double finalPrice = qtd * price;
			 
			if (qtd >= 100) finalPrice = finalPrice * 0.9;
			
			resp += finalPrice;
		}
		return resp;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
