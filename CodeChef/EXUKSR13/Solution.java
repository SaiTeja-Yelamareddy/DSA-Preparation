/*
 * Problem: https://www.codechef.com/learn/course/oops-java/YXOJPP/problems/EXUKSR13
 * Language: {platform}/{problemId}/{filename}.{ext}
 * Saved via CodeSync Extension
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