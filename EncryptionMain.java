
public class EncryptionMain {

	public static void main(String[] args) {

		String input = "Discover the text you see in front of you. ".toLowerCase()
				+ "Texte in dieser Laenge finden Sie z. B. bei Wikipedia, Fachblogs und als ausführliche Pressemitteilung. "
						.toLowerCase()
				+ "Bei letzteren Achthundert Woerter Texten wuenscht man sich als Unternehmen, die komplette Uebernahme des Textes."
						.toLowerCase();
		System.out.println("INPUT-TEXT:   " + input);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.print("Encrypted:    ");
		char[] alphabet1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ' && (input.charAt(i) != '.') && (input.charAt(i) != ',')) {
				if (alphabet.indexOf(input.charAt(i)) < 21) {
					int output = alphabet.indexOf(input.charAt(i)) + 5;
					System.out.print(Character.toString(alphabet1[output]).toLowerCase());
				} else {
					int output = alphabet.indexOf(input.charAt(i)) - 21;
					System.out.print(Character.toString(alphabet1[output]).toLowerCase());
				}
			} else {
				System.out.print(input.charAt(i));
			}
		}
		System.out.println("");
	}

}
