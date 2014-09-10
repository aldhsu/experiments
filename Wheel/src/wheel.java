import java.util.Arrays;

class Wheel {
	public static void main(String[] args) {
		String phrase[]= {
				"A STITCH IN TIME SAVES NINE",
				"DON'T EAT YELLOW SNOW",
				"JUST DO IT",
				"EVERY GOOD BOY DOES FINE",
				"I WANT MY MTV",
				"I LIKE IKE",
				"PLAY IT AGAIN SAM",
				"FROSTY THE SNOMAN",
				"ONE MORE FOR THE ROAD",
				"HOME FIELD ADVANTAGE",
				"VALENTINE'S DAY MASSACRE",
				"GROVER CLEVELAND OHIO",
				"SPAGHETTI WESTERN",
				"AQUA TEEN HUNGER FORCE",
				"IT'S A WONDERFUL LIFE"
		};
		int[] letterCount = new int[26];
		for(int count =0; count < phrase.length;count++) {
			char[] letters = phrase[count].toCharArray();
			for (int j = 0; j < letters.length; j++) {
				char letter = letters[j];
				if ( (letter >= 'A') & (letter <= 'Z')) {
					letterCount[letter -'A']++;
				}
			}	
		}
		for(char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count +": " +
					letterCount[count-'A'] +
					" ");	
		}
		System.out.println();
	
	}
}