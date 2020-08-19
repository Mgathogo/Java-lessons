package brainFeed;

//Run this one with GreetingMessage Interface

public class GreetingMain {

	public static void main(String[] args) {
		
		GreetingMessage gm = new GreetingMessage() {

			@Override
			public void greet(String name) {
				System.out.println("Hello "+ name);
				
			}
		
	};
	gm.greet("Michael");
	
	GreetingMessage gm2 = name -> System.out.println("Hello "+ name);
	
	gm2.greet("Catherine");
	
	MessagePrinter printer = () -> System.out.println("This is the functional Interface message");
	printer.printMesage();
	
}
}