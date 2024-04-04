package uca.ac.elearning.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uca.ac.elearning.bean.path.Course;
import uca.ac.elearning.dao.studentDao.StudentInscriptionDao;
import uca.ac.elearning.dao.users.UserDao;
import uca.ac.elearning.service.facade.StudentService;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentInscriptionDao studentInscriptionDao;
    public Course findCurrentCourse(String studentEmail){
        var studentInscription = studentInscriptionDao.findByStudent_email(studentEmail);
        if(studentInscription == null){
            return null;
        }
        return studentInscription.getCurrentCourse();
    }
}
