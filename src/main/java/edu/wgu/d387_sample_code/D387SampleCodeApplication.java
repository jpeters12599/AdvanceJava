package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		Welcome WelcomeEnglish = new Welcome(Locale.US);
		Thread englishWelcomeThread = new Thread(WelcomeEnglish);
		englishWelcomeThread.start();

		Welcome WelcomeFrench = new Welcome(Locale.CANADA_FRENCH);
		Thread frenchWelcomeThread = new Thread(WelcomeFrench);
		frenchWelcomeThread.start();

	}
}