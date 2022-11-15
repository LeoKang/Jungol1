package q105;

public class Main {
	public static void main(String[] args) {
		// 3rd
		String[] str2 = { "Seoul", "10,312,545", "+91,375", "Pusan", "3,567,910", "+5,868", "Incheon", "2,758,296",
				"+64,888", "Daegu", "2,511,676", "+17,230", "Gwangju", "1,454,636", "+29,774" };
		for (int i = 0; i < str2.length; i++) {
			if(i % 3 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%15s", str2[i]);
		}
		System.out.println("\n-------------------------");
		
		// 2nd
		String[] str = { "Seoul", "10,312,545", "+91,375", "Pusan", "3,567,910", "+5,868", "Incheon", "2,758,296",
				"+64,888", "Daegu", "2,511,676", "+17,230", "Gwangju", "1,454,636", "+29,774" };
		System.out.printf("%15s%15s%15s\n", str[0], str[1], str[2]);
		System.out.printf("%15s%15s%15s\n", str[3], str[4], str[5]);
		System.out.printf("%15s%15s%15s\n", str[6], str[7], str[8]);
		System.out.printf("%15s%15s%15s\n", str[9], str[10], str[11]);
		System.out.printf("%15s%15s%15s\n", str[12], str[13], str[14]);
		System.out.println("\n-------------------------");

		// 1st
		System.out.println("          Seoul     10,312,545        +91,375");
		System.out.println("          Pusan      3,567,910         +5,868");
		System.out.println("        Incheon      2,758,296        +64,888");
		System.out.println("          Daegu      2,511,676        +17,230");
		System.out.println("        Gwangju      1,454,636        +29,774");
	}
}
