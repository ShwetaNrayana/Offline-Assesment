package com.yebelo.main;

import java.util.Scanner;

import com.yebelo.service.AssesmentService;

public class AssismentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the given option by selecting the options number");
		System.out.println("1: Get All Categories");
		System.out.println("2: Get Category By Id");

		int inputOption = sc.nextInt();
		if (inputOption == 1) {
			getAllCategories();
		} else if (inputOption == 2) {
			System.out.println("Enter the category id");
			String inputId = sc.next();
			getCategorieByCategoryId(inputId);
		}
		sc.close();
	}

	public static void getAllCategories() {
		String response = AssesmentService.getAllCategories();
		System.out.println("reponse data " + response);
	}

	public static void getCategorieByCategoryId(String catId) {
		
		String response2 = AssesmentService.getCategorieByCategoryId(catId);
		System.out.println("reponse data " + response2);
	}

}
