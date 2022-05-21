package batalhaDosExercitos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Exercito> exercitoUm = new ArrayList<>();
		ArrayList<Exercito> exercitoDois = new ArrayList<>();
		boolean fim = false;
		
		System.out.print("Qual exercito deseja comprar? \n"
				+ "1 - Infantaria\n"
				+ "2 - Cavalaria\n"
				+ "3 - Catapultas\n");
		
		// Cadastrando o primeiro exercito
		while (exercitoUm.size() < 12) {
			String exercito = scan.nextLine();
				switch(exercito) {
					case "1":
						exercitoUm.add(new Infantaria());
						System.out.println("adicionando infantaria ao exercito 1");
						break;
					case "2":
						exercitoUm.add(new Cavalaria());
						System.out.println("adicionando cavalaria ao exercito 1");
						break;
					case "3":
						exercitoUm.add(new Catapulta());
						System.out.println("adicionando catapulta ao exercito 1");
						break;
				}
			}
		
		System.out.println("Segundo exercito: ");
		System.out.print("Qual exercito deseja comprar? \n"
				+ "1 - Infantaria\n"
				+ "2 - Cavalaria\n"
				+ "3 - Catapultas\n");
		
		// Cadastrando o segundo exercito
		while (exercitoDois.size() < 12) {
			String exercito = scan.nextLine();
			switch(exercito) {
				case "1":
					exercitoDois.add(new Infantaria());
					System.out.println("adicionando infantaria ao exercito 2");
					break;
				case "2":
					exercitoDois.add(new Cavalaria());
					System.out.println("adicionando cavalaria ao exercito 2");
					break;
				case "3":
					exercitoDois.add(new Catapulta());
					System.out.println("adicionando catapulta ao exercito 2");
					break;
			}
		}
		
		while (!fim) {
			int randomUm = random.nextInt(exercitoUm.size());
			int randomDois = random.nextInt(exercitoDois.size());				
			System.out.println("\n----------------BATALHA DA RODADA: ----------------\n"
					+ exercitoUm.get(randomUm).toString() + " VS " + exercitoDois.get(randomDois).toString());
			
			if (exercitoUm.get(randomUm).ganhaQuandoAtacadoPor(exercitoDois.get(randomDois)) == true && (exercitoUm.get(randomUm).equals(exercitoDois.get(randomDois)) == false))
				exercitoDois.remove(randomDois);
			
			else if (exercitoUm.get(randomUm).equals(exercitoDois.get(randomDois)) == true) {
				exercitoUm.remove(randomUm);
				exercitoDois.remove(randomDois);	
			}
			
			else {
				exercitoDois.remove(randomDois);
			}
			
			if (exercitoUm.size() == 0 || exercitoDois.size() == 0)
				fim = true;
			}
		
		scan.close();
		
		}
	
	
	}
