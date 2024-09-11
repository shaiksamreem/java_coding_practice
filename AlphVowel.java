package kodnest;
import java.util.Scanner;
public class AlphVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character: ");
		char vowel =scan.next().charAt(0);
		Vowels vol = new Vowels();
		vol.vowelAlp(vowel);

	}

}
/*class Vowels{
	void vowelAlp(char vowel){
		if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'){
			System.out.println("vowels");
			
		}
		else{
			System.out.println("constant");
		}*/

class Vowels{
	void vowelAlp(char vowel){
		switch(vowel){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowels");
			break;
			default:
				System.out.println("constant");
		}

	}
}
