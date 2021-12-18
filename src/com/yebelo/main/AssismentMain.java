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
		if(inputOption==1) {
			getAllCategories();
		}	
		sc.close();
	}
	
	public static void getAllCategories() {
		String response  = AssesmentService.getAllCategories();
		System.out.println("reponse data "+response);
	}
	}


