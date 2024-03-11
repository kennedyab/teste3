package assist;

public class Tuple {
	private double price;
	private int qtd;

	public Tuple(double p, int q) {
		this.price = p;
		this.qtd = q;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
