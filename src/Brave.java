public class Brave {
	public static void main(String[] args) {
		LinePrinter lp = new LinePrinter("Hello, world!");
		for(int i = 1; i<=3; i++) {
			lp.multiPrint(i);
			System.out.println();
		}
	}
}
