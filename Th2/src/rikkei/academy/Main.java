package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn A", true, "JV-03", 19, "Hà Nội");
        Student student2 = new Student(2, "Nguyễn Văn B", false, "JV-03", 18, "Nghệ An");
        Student student3 = new Student(3, "Nguyễn Văn C", true, "JV-03", 17, "HCM");
        System.out.println("--------------------THông tin của student1-------------------");
        student1.display();
        System.out.println("--------------------THông tin của student2-------------------");
        student2.display();
        System.out.println("--------------------THông tin của student3-------------------");
        student3.display();
    }
}
