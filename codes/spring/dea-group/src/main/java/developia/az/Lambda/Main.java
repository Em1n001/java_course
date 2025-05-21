package developia.az.Lambda;

public class Main {
	
	public static void main(String[] args) {
		Blockable user=new Blockable() {
			
			@Override
			public void block() {
			System.out.println("Istifadeci bloklandi");
			}
		};
		
		 Blockable user11 = () -> System.out.println("Istifadeci bloklandi");
		
		user11.block();
	}
}
