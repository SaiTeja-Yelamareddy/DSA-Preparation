/*
 * Platform: CodeChef
 * Problem ID: EXUKSR13
 * Problem: Worked Example - Employee Roles in OOPs using Java
 * Problem Link: https://www.codechef.com/learn/course/oops-java/YXOJPP/problems/EXUKSR13
 * Language: Java
 * Concept: OOP
 * Difficulty: Medium
 * Status: ACCEPTED
 */

class Employee {
    String name;

    void work() {
        System.out.println(name + " is working.");
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void code() {
        System.out.println("Coding in " + programmingLanguage);
    }
}

class Designer extends Employee {
    String designTool;

    void design() {
        System.out.println("Designing using " + designTool);
    }
}

class Codechef {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Alice";