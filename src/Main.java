/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-03-2021
 *   Time: 19:51
 *   File: Main.java
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        LinkedList list = new LinkedList();

        for(int i = 0; i< employees.length; i++)
            employees[i] = new Employee();

        for(int i =0; i< employees.length; i++){
            System.out.println( i+ "Enter employee name");
            employees[i].setEmpName(sc.next());
            sc.nextLine();
            System.out.println(i + "Enter employee id");
            employees[i].setEmpId(sc.nextInt());
            System.out.println(i + "Enter employee designation");
            employees[i].setEmpDesignation(sc.next());
            sc.nextLine();
            System.out.println(i + "Enter employee salary");
            employees[i].setEmpSalary(sc.nextInt());
        }

        for(int i =0; i< employees.length; i++){
            list.insertInSortedOrder(employees[i]);
        }

        list.display();
    }
}
