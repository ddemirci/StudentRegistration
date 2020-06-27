package com.demo.StudentRegistration;
import com.demo.StudentRegistration.entity.Student;
import com.demo.StudentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner{

    private StudentRepository _studentRepository;

    @Autowired
    public DataInit(StudentRepository studentRepository) {
        this._studentRepository = studentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = _studentRepository.count();

        if (count == 0) {
            Student s1 = new Student("Doruk","Demirci",4);
            Student s2 = new Student("Alinda","Aga",3);

            _studentRepository.save(s1);
            _studentRepository.save(s2);
        }

    }
}
