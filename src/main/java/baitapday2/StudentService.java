package baitapday2;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void updateStudent(int id, Student updatedStudent) {
        studentRepository.updateStudent(id, updatedStudent);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }
}
