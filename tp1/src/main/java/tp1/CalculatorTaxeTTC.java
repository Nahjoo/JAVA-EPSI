package tp1;

public class CalculatorTaxeTTC extends ConsoleService<String[], Void> {
	
	
	

  public void run(String[] args) {
    // TODO
	double userNumber;
	double userTaxe;
	double taxe;
	double reponse = 0;
	char resume = 'O';
	
	
	System.out.println("Saississez le montant HT : ");
	userNumber = this.readDouble();
	
	while(resume == 'O')
	{
		System.out.println(" 1. Taxe à 5.5% \n 2. Taxe à 10% \n 3. Taxe à 20% \n Choissisez la taxe : ");
		userTaxe = this.readInt();
			
		if(userTaxe == 1){
			taxe = 5.5 / 100;
			System.out.println(taxe);
			reponse = (userNumber * taxe) + userNumber;
			resume = ' ';
		}else if(userTaxe == 2) {
			taxe = 10.0 / 100;
			reponse = (userNumber * taxe) + userNumber;
			System.out.println(taxe);
			resume = ' ';
		}else if(userTaxe == 3) {
			taxe = 20.0 / 100;
			System.out.println(taxe);
			reponse = (userNumber * taxe) + userNumber; ;
			resume = ' ';
		}else {
			System.out.println("Choix impossible");
		};
		System.out.println("Montant TTC :" + reponse);
		
	};
  }
 
public static void main(String[] args) {
    CalculatorTaxeTTC cal = new CalculatorTaxeTTC();
    cal.run(args);
  }
  
}
