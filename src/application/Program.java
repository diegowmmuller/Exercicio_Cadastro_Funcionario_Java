package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Declaração da quantidades de empregados cadastrados
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		// Declaração da lista
		List<Employee> list = new ArrayList<>();
		
		// Looping investigativo
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();				
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			// Cria um objeto 
			Employee emp = new Employee(id, name, salary);
			list.add(emp);		// Adiciona a lista
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);	
			if (pos == null) {
				System.out.println("This id does not exist!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				list.get(pos).increaseSalary(percent);
			}
			
			System.out.println();
			System.out.println("List of employees: ");
			for (Employee emp : list) {
				System.out.println(emp);
			}
			
			
			
			sc.close();
	}
	// metodo hasId recebe como parametro uma lista de funcionarios e o id
		public static Integer position(List<Employee> list, int id) {
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
	}
	
}
