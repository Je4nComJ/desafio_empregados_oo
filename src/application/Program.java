package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String nomeDpt = sc.nextLine();
		
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address ad = new Address(email, phone);
		Department dept = new Department(nomeDpt, payDay, ad);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados do funcionário " + (i+1) + ":");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			Employee emp = new Employee(name, salary);
			dept.addEmployee(emp);
		}
		
		showReport(dept);
		
		sc.close();
	}

	private static void showReport(Department dept) {
		
		System.out.println("\nFOLHA DE PAGAMENTO:");
		System.out.println("Departamento " + dept.getName() + " -  R$ " + dept.payroll());
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println("Funcionários:");

		for (Employee employee : dept.getEmployees()) {
			System.out.println(employee.getName());
		}
		
		System.out.println("Para dúvidas favor entrar em contato: " + Address.getEmail());
	}
}
