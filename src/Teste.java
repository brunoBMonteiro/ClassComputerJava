
public class Teste {
	
	public static void main(String[] args) {
		Computer pc1, pc2, pc3;
		Monitor m1, m2;
		
		pc1 = new Computer("i5 7-400u", "2.5GHz",  8, 500);
		pc1.exibeDados();
		
		pc2 = new Computer("i7 8-400u", "2.5GHz",  8, 1000);
		pc2.exibeDados();
		
		
		pc3 = new Computer("i9 9-900k", "2.5GHz",  16, 1000);
		pc3.exibeDados();
		
		
		m1 = new Monitor("ACER", "dsd4424", "32");
		m1.exibeDados();
		
		m1 = new Monitor("DELL", "d546454", "28");
		m1.exibeDados();
	}
}
