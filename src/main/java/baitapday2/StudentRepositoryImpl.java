package baitapday2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {
    private final Map<Integer, Student> students = new HashMap<>();

    // Khởi tạo dữ liệu mẫu
    public StudentRepositoryImpl() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Alice");
        student1.setAge(20);
        student1.setAddress("123 Main St");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Bob");
        student2.setAge(21);
        student2.setAddress("456 Elm St");

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void updateStudent(int id, Student updatedStudent) {
        if (students.containsKey(id)) {
            students.put(id, updatedStudent);
        }
    }

    @Override
    public void deleteStudent(int id) {
        students.remove(id);
    }
}
