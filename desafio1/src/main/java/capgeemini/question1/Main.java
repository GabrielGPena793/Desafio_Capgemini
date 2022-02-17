package capgeemini.question1;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the drawning: ");
		int number = scanner.nextInt();

		String word = "*";

		for (int i = number; i > 0; i--){
			System.out.println(StringUtils.leftPad(word, number, ' '));
			word = word + "*";
		}
	}

}
