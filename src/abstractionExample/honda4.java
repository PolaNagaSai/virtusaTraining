package abstractionExample;

public class honda4 extends bike {
	public static void run() {
		System.out.println("run the bike");
	}
	public static void main(String[] args) {
		bike b=new honda4();
		b.run();
	}

}
