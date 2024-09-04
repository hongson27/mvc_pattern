package mvc_pattern.view;

import mvc_pattern.controller.StudentController;
import mvc_pattern.controller.TeacherController;
import mvc_pattern.model.Student;
import mvc_pattern.model.Teacher;

import java.time.LocalDate;
import java.util.Scanner;

public class CodeGymManagement {
    private static final Scanner sc = new Scanner(System.in);
    public static final StudentController studentController = new StudentController();
    public static final TeacherController teacherController = new TeacherController();

    public void displayMainMenu() {
        do {
            System.out.println("Quản lý CodeGym: \n" +
                    "1. Quản lý học viên. \n" +
                    "2. Quản lý giảng viên. \n" +
                    "3. Thoát chương trình. \n" +
                    "Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    displayStudentMainMenu();
                    break;
                case 2:
                    displayTeacherMainMenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại chức năng.");
                    displayMainMenu();
            }


        } while (true);
    }


    public void displayStudentMainMenu() {
        do {
            System.out.println("Quản lý học viên: \n" +
                    "1. Xem danh sách học viên. \n" +
                    "2. Thêm học viên. \n" +
                    "3. Sửa thông tin học viên. \n" +
                    "4. Xóa học viên. \n" +
                    "5. Trở về menu chính. \n" +
                    "Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("------------Hiển thị danh sách sinh viên---------------");
                    studentController.getStudentList();
                    break;
                case 2:
                    System.out.println("------------Thêm học viên---------------");
                    System.out.println("Nhập mã học viên: ");
//                    String code, String name, LocalDate localDate, String email, String className
                    String id = sc.nextLine();
                    System.out.println("Nhập tên học viên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày sinh học viên: ");
                    String time = sc.nextLine();
                    LocalDate localDate = LocalDate.parse(time);
                    System.out.println("Nhập email học viên: ");
                    String email = sc.nextLine();
                    System.out.println("Nhập lớp học viên: ");
                    String className = sc.nextLine();
                    Student student = new Student(id, name, localDate, email,  className);
                    studentController.addStudent(student);
                    break;
                case 3:
                    System.out.println("-------------Sửa thông tin học viên-------------------");
                    System.out.println("Nhập ID học viên cần sửa: ");
                    String idSV = sc.nextLine();
                    System.out.println("Nhập tên học viên mới: ");
                    String nameSV = sc.nextLine();
                    System.out.println("Nhập ngày sinh học viên mới:");
                    String timeSV = sc.nextLine();
                    LocalDate localDateSV = LocalDate.parse(timeSV);
                    System.out.println("Nhập email học viên mới: ");
                    String emailSV = sc.nextLine();
                    System.out.println("Nhập lớp học viên mới: ");
                    String classNameSV = sc.nextLine();
                    Student student1 = new Student(idSV, nameSV, localDateSV, emailSV, classNameSV);
                    studentController.updateStudent(idSV, student1);
                    break;
                case 4:
                    System.out.println("-------------------Xóa học viên---------------------");
                    System.out.println("Nhập ID học viên cần xóa: ");
                    String idHV = sc.nextLine();
                    studentController.deleteStudentById(idHV);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Vui lòng chọn lại chức năng.");

    }
        } while (true);
    }

    public void displayTeacherMainMenu() {
        do {
            System.out.println("Quản lý giáo viên: \n" +
                    "1. Xem danh sách giáo viên. \n" +
                    "2. Thêm giáo viên. \n" +
                    "3. Sửa thông tin giáo viên. \n" +
                    "4. Xóa giáo viên. \n" +
                    "5. Trở về menu chính. \n" +
                    "Nhập lựa chọn của bạn: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("------------Hiển thị danh sách giáo viên---------------");
                    teacherController.getTeacherList();
                    break;
                case 2:
                    System.out.println("--------------Thêm giáo viên------------------------");

                    System.out.println("Nhập mã giáo viên: ");
                    String id = sc.nextLine();
                    System.out.println("Nhập tên giáo viên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày sinh giáo viên: ");
                    String time = sc.nextLine();
                    LocalDate localDate = LocalDate.parse(time);
                    System.out.println("Nhập email giáo viên: ");
                    String email = sc.nextLine();
                    System.out.println("Nhập lương giáo viên: ");
                    int salary = Integer.parseInt(sc.nextLine());
                    Teacher teacher = new Teacher(id, name, localDate, email,  salary);
                    teacherController.addTeacher(teacher);
                    break;
                case 3:
                    System.out.println("--------------Sửa thông tin giáo viên----------------");
                    System.out.println("Nhập ID giáo viên cần sửa: ");
                    String idGV = sc.nextLine();
                    System.out.println("Nhập tên giáo viên mới: ");
                    String nameGV = sc.nextLine();
                    System.out.println("Nhập ngày sinh giáo viên mới: ");
                    String timeGV = sc.nextLine();
                    LocalDate localDateGV = LocalDate.parse(timeGV);
                    System.out.println("Nhập email giáo viên mới: ");
                    String emailGV = sc.nextLine();
                    System.out.println("Nhập lương giáo viên mới: ");
                    int salaryGV = Integer.parseInt(sc.nextLine());
                    Teacher teacher1 = new Teacher(idGV, nameGV, localDateGV, emailGV, salaryGV);
                    teacherController.updateTeacherById(idGV, teacher1);
                    break;
                case 4:
                    System.out.println("---------------------Xóa giáo viên--------------------");
                    System.out.println("Nhập ID giáo viên cần xóa: ");
                    String id1 = sc.nextLine();
                    teacherController.deleteTeacherById(id1);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Vui lòng chọn lại chức năng.");

            }
        } while (true);
    }
    }



