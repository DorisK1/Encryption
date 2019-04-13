
public class DecryptionMain {

	public static void main(String[] args) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] alphabet1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String input1 = "bpm mvotqap vium dqmvvi qa jwzzweml nzwu bpm pwuwvguwca qbitqiv dmzaqwv wn bpm kqbga vium wz bpm nzmvkp dqmvvm bpm mbguwtwog wn bpm kqbga vium qa abqtt acjrmkb bw akpwtiztg lqaxcbm awum ktiqu bpib bpm vium kwuma nzwu dmlcvqi umivqvo nwzmab abzmiu epqkp acjamycmvbtg xzwlckml bpm wtl pqop omzuiv ccmvqi emvqi qv uwlmzv ezqbqvo bpm vme pqop omzuiv eqmv ivl qba lqitmkbit dizqivb emiv";
		System.out.println("ENCRYPTED: " + input1);
		System.out.println("DECRYPTED: ");

		for (int j = 1; j < 27; j++) {
			System.out.println("Shift Number: " + (26-j));
			for (int i = 0; i < input1.length(); i++) {
				if (input1.charAt(i) != ' ' && (input1.charAt(i) != '.') && (input1.charAt(i) != ',')) {
					if ((alphabet.indexOf(input1.charAt(i)) + j) <= 25) {
						int output1 = alphabet.indexOf(input1.charAt(i)) + j;
						System.out.print(Character.toString(alphabet1[output1]).toLowerCase());
					} else {
						int output1 = alphabet.indexOf(input1.charAt(i)) - (26 - j);
						System.out.print(Character.toString(alphabet1[output1]).toLowerCase());
					}
				} else {
					System.out.print(input1.charAt(i));
				}
			}
			System.out.println();
		}
	}

	

}
