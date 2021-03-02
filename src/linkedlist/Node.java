package linkedlist;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 01-03-2021
 *   Time: 19:24
 *   File: linkedlist.Node.java
 */

import employee.Employee;

public class Node {

    Employee data;
    Node next;

    public Node(Employee data){
        this.data = data;
        this.next = null;
    }

}
