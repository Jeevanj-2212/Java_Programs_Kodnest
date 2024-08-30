package inheritence;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }
    void attendMeeting() {
        System.out.println("Employee is attending a meeting");
    }
}

class Manager extends Employee {
    // Overridden method
    void attendMeeting() {
        System.out.println("Manager is leading a meeting");
    }

    // Child-specific method
    void conductReview() {
        System.out.println("Manager is conducting a performance review");
    }
}

public class TypesofMethods {
    public static void main(String[] args) {
        Manager myManager = new Manager();
        
        // Calling the inherited method
        myManager.work();   // Output: Employee is working

        // Calling the overridden method
        myManager.attendMeeting(); // Output: Manager is leading a meeting

        // Calling the child-specific method
        myManager.conductReview();  // Output: Manager is conducting a performance review
        Employee e = new Employee();
        e.attendMeeting();
    }
}
