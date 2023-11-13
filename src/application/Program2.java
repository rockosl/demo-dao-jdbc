package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: department FindById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TESTE 2: department FindByAll ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);

		System.out.println("\n=== TESTE 3: department Insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TESTE 4: department update ===");
		department = departmentDao.findById(1);
		department.setName("Logistics");
		departmentDao.update(department);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TESTE 5: department delete ===");
		departmentDao.deleteById(5);
		System.out.println("Deleted!");
	}

}
