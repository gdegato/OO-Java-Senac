
public class Ponto {
	
	//atributos da classe
	
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//construtores
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Ponto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	//metodos
	
	public double CalculaDistancia(Ponto ponto) {
		return Math.sqrt(Math.pow(ponto.x - this.x, 2) + Math.pow(ponto.y - this.y, 2));		
	}
	 
	public boolean VerificaPontosIguais (Ponto ponto) {
		return (ponto.x == this.x && ponto.y == this.y);		 
	 }
}






