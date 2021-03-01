/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-03-2021
 *   Time: 19:33
 *   File: LinkedList.java
 */

public class LinkedList {

    Node head;

    public LinkedList(){
        head = null;
    }

    void insertInSortedOrder(Employee data){
        Node newNode = new Node(data);
        if(head == null || head.data.getEmpSalary() > data.getEmpSalary()){
            newNode.next = head;
            head = newNode;
            return;
        }else{
            Node temp = head;
            while (temp.next != null && temp.next.data.getEmpSalary() < newNode.data.getEmpSalary()) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            }
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println("Emp name: " + temp.data.getEmpName() +
                    " Emp ID: " + temp.data.getEmpId() +
                    "Emp designation: " + temp.data.getEmpDesignation() +
                    "Emp salary: " + temp.data.getEmpSalary());
        temp = temp.next;
        }
    }
}
