package com.fr3nzy.financial_crisis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FinancialCrisisApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(FinancialCrisisApplication.class, args);
//		HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("https://query1.finance.yahoo.com/v10/finance/quoteSummary/INDU?modules=summaryProfile")).build();
//		HttpResponse httpResponse = HttpClient.newBuilder().build().send(httpRequest, HttpResponse.BodyHandlers.ofString());
//		System.out.println(httpResponse.body());
//		call();
    }

//	private static void call() throws IOException, InterruptedException {
//		HttpRequest response = HttpRequest.newBuilder(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/auto-complete?q=tesla&region=US"))
//				.header("x-rapidapi-key", "ac932d22b9msh06a508669bfac08p1e5ba9jsn2d833eb1c0b8")
//				.header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
//				.build();
//		HttpResponse httpResponse = HttpClient.newBuilder().build().send(response, HttpResponse.BodyHandlers.ofString());
//		System.out.println(httpResponse.body());
//	}
}
