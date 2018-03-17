package co.lovelyme.lovelyme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LovelymeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LovelymeApplication.class, args);
		System.out.println("Hello World");
		int userInput;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your age ");
        userInput = sc.nextInt();

        System.out.println("You entered: --> \" " + userInput + "\" <--");
        System.out.println("Before the for");

        for(int i = 0; i <= userInput; i += 1){
            System.out.println("Hello " + i);
        }


    }
}
