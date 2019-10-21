package com.chhaichivon.aesencryption;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AesEncryptionExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AesEncryptionExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		String  password = "123";

		String encryptedPrivateKey  = AESUtils.encrypt("ABC",password);
		System.out.println("encryptedPrivateKey => "+ encryptedPrivateKey);

		String decryptedPrivateKey = AESUtils.decrypt(encryptedPrivateKey,password);
		System.out.println("decryptedPrivateKey => "+ decryptedPrivateKey);

	}
}
