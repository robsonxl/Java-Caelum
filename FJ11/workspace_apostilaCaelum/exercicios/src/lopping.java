
public class lopping {
	

	public static void main (String[] args){
		
		int idade = 15;
		int i = 18;
		//laço while 
		while(idade <= i ){
			
			System.out.println("A idade é "+ idade);
			
			idade++;
		}
		// laço for 
		idade = 15;
		for(;idade< i; idade+=1){
			System.out.println("A idade será "+ idade);
		}
	  //  break 

		for (int contador=1; contador<=1000; contador++){

		//	System.out.println("Esta é a repetição nr: "+contador);

				if (contador==10)

						break;

		}
		
			for (int contador=1; contador<=100; contador++){

				if (contador%5==0)

					System.out.println("Contador: "+contador);

					continue;
						

				}

			}

		}
