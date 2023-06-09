public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Create employee objects and calculate salary
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].inputData();
            employees[i].calSalary();
        }

        // Display employee data
        System.out.println("\nEmployee Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1) + " details:");
            employees[i].displayData();
        }
    }
}
