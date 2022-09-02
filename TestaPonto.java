
public class TestaPonto {

	public static void main(String[] args) {
		
		  Ponto calculaCoordenada1 = new Ponto(2,3);

          Ponto calculaCoordenada2 = new Ponto(4,5);
          
          double distancia = calculaCoordenada1.CalculaDistancia(calculaCoordenada2);
          System.out.printf("%.2f%n", distancia );

          boolean verificaIgualdade = calculaCoordenada1.VerificaPontosIguais(calculaCoordenada2);
          System.out.println(verificaIgualdade);
		
	}

}
