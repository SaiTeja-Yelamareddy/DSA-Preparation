/*
 * Platform: CodeChef
 * Problem ID: EXUKSR08
 * Problem: Worked Example - Employee Hierarchy in OOPs using Java
 * Problem Link: https://www.codechef.com/learn/course/oops-java/YXOJPP/problems/EXUKSR08
 * Language: Java
 * Concept: OOP
 * Difficulty: Medium
 * Status: ACCEPTED
 */

        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }

    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    String department;

    void displayDepartment() {
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    int teamSize;

    void displayTeamSize() {
        System.out.println("Team Size: " + teamSize);
    }
}

class Codechef {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager();
        sm.name = "Alice";