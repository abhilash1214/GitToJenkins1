package Package1;

public class Class2 {
	public static void main(String[] args) {
		String x = "123abr%@jhui";

		char[] a = x.toCharArray();
		char[] out = new char[a.length];
		String str = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 'a' && a[i] <= 'z') {
				//System.out.println(a[i]);
				str = str + Character.toString(a[i]);
			}
			
		}
		System.out.println(str);
	}

}