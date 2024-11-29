package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}

	@Override
	public String toString() {
		return String.format(
	            "ID: %d\n" +
	                    "Name: %s\n" +
	                    "Salary: R$ %.2f", // Formata o salário com 2 casas decimais
	                    id, name, salary
	                );
	}
	
	

}
