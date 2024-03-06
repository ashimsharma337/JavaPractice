// Covariant Varibale Assingnment in java

public class Store {
    
    public static void main(String[] args) {
		// here reference type is furniture and object type is chair 
		Furniture chair = new Chair();
		Furniture table = new Table();
		System.out.println(chair);   //prints Chair@515f550a which is store on a heap
		
		sell(chair);
		sell(table);

	}
	
	public static void sell(Furniture furn) {
		System.out.println(furn);
	}
}

class Furniture {}
class Chair extends Furniture{}
class Table extends Furniture{}
