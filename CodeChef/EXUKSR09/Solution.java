/*
 * Problem: https://www.codechef.com/learn/course/oops-java/YXOJPP/problems/EXUKSR09
 * Language: {platform}/{problemId}/{filename}.{ext}
 * Saved via CodeSync Extension
 */

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
        sm.employeeId = 2001;
        sm.department = "Computer Science";
        sm.teamSize = 12;

        sm.displayEmployeeInfo();   // Inherited from Employee Class
        sm.displayDepartment();     // Inherited from Manager Class
        sm.displayTeamSize();       // Defined in SeniorManager Class
        sm.work();                  // Inherited from Employee Class
    }
}