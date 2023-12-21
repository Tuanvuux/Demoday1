package baitapday2;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("baitapday2xml/beans.xml");

        // Lấy bean StudentController từ ApplicationContext
        StudentController studentController = (StudentController) context.getBean("studentController");

        // Sử dụng StudentController để hiển thị danh sách học sinh
        List<Student> students = studentController.getAllStudents();
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() +
                    ", Age: " + student.getAge() + ", Address: " + student.getAddress());
        }
    }
}
