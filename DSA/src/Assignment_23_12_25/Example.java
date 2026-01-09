package Assignment_23_12_25;


class Example {

    static int a = 10;
    static int b = 20;

    int x = 30;
    int y = 40;
    
    

    @Override
	public String toString() {
		return "Example [x=" + x+ " a="+a + ", y=" + y + "]";
	}



	public static void main(String[] args) {

        Example e1 = new Example();
         e1 = new Example();
         e1 = new Example();
        
        e1.a = 50;   // static variable
        e1.b = 60;   // static variable
        e1.x = 70;   // instance variable
        e1.y = 80;   // instance variable
        
        IO.println(e1);
        IO.println(e1);
        IO.print(e1);
    }
}
