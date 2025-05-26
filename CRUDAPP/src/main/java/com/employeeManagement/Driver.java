package com.employeeManagement;

import java.util.List;
import java.util.Scanner;

import com.employeeManagement.entity.Entity;
import com.employeeManagement.service.EmpService;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpService emp = new EmpService();

        boolean flag=false;
        while (!flag) {
            System.out.println("\nWELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("2. UPDATE EMPLOYEE");
            System.out.println("3. FETCH EMPLOYEE");
            System.out.println("4. DELETE EMPLOYEE");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    emp.save();
                    break;
                case 2:
                    int res1=emp.update();
                    if (res1 != 0) {
						System.out.println("employee data updated !!!!!");
					}
                    break;
                case 3:
                  List<Entity> li=emp.fetch();
                  if (li != null) {
					System.out.println(li);
				}
                   
                    break;
                case 4:
                    int res3=emp.delete();
                    if (res3 != 0) {
						System.out.println("Record deleted successfully");
					}
                    else {
                    	
                    	System.out.println("id can't find inside database");
                    }
                    break;
                case 5:
                    System.out.println(" Thank you For Using Our App!");
                    flag=true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
