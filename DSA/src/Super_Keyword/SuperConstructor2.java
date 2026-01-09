package Super_Keyword;

public class SuperConstructor2 {

	public static void main(String[] args) {
		
		Lion l = new Lion("Simba");
		IO.print(l.getName());

	}

}

class An{
	protected String name;
	
	public An(String name) {
		this.name = name;
	}
	
}

class Lion extends An{
	
	//protected String lionName;
	
	public Lion(String lionName) {
		super(lionName);
	}
	
	public String getName() {
		return super.name;
	}
}
