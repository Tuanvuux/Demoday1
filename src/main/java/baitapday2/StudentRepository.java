package baitapday2;

import java.util.List;

public interface StudentRepository {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void addStudent(Student student);
    void updateStudent(int id, Student updatedStudent);
    void deleteStudent(int id);
}
