import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;

        int choice;
        do {
            System.out.println("======== MENU ========");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllStudents(students, studentCount);
                    break;
                case 2:
                    addStudent(students, studentCount);
                    studentCount++;
                    break;
                case 3:
                    updateStudent(students, studentCount);
                    break;
                case 4:
                    deleteStudent(students, studentCount);
                    studentCount--;
                    break;
                case 5:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    public static void displayAllStudents(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            for (int i = 0; i < studentCount; i++) {
                System.out.println("Học sinh thứ " + (i + 1) + ":");
                students[i].displayData();
                System.out.println();
            }
        }
    }

    public static void addStudent(Student[] students, int studentCount) {
        if (studentCount == students.length) {
            System.out.println("Danh sách học sinh đã đầy. Không thể thêm mới.");
        } else {
            Student student = new Student();
            student.inputData();
            students[studentCount] = student;
            System.out.println("Thêm học sinh thành công.");
        }
    }

    public static void updateStudent(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã học sinh cần sửa: ");
            String studentId = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getStudentId().equals(studentId)) {
                    System.out.println("Thông tin học sinh cần sửa:");
                    students[i].displayData();

                    System.out.println("Nhập thông tin học sinh mới:");
                    students[i].inputData();

                    System.out.println("Sửa thông tin học sinh thành công.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy học sinh có mã " + studentId + " trong danh sách.");
            }
        }
    }

    public static void deleteStudent(Student[] students, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách học sinh trống.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã học sinh cần xoá: ");
            String studentId = scanner.nextLine();

            boolean found = false;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getStudentId().equals(studentId)) {
                    System.out.println("Thông tin học sinh cần xoá:");
                    students[i].displayData();

                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }

                    System.out.println("Xoá học sinh thành công.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy học sinh có mã " + studentId + " trong danh sách.");
            }
        }
    }
}
