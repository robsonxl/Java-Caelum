
public class casting {
	
	public static void main (String[] args){

		// Fazendo Casting pagina  30 
				//O casting foi feito para moldar a variável d3 como um int. O valor de i agora é 3.
					double d3 = 3.14;
					int i = (int) d3;		
					long x = 10000;
					int j  = (int) x;
				//float y = 0.0; esta de forma errada pois pode haver perda de dados, abaixo segue a fora correta
					float xy =0.0f;
				// outro exemplo de casting comun 
					double d = 5;
					float f = 3;
					float soma1 = f+ (float)d;
					System.out.println("soma dos casting "+soma1);
					System.out.println("soma dos casting "+i);
					System.out.println("soma dos casting "+x);
					System.out.println("soma dos casting "+j);
					System.out.println("soma dos casting "+xy);
			}


}
