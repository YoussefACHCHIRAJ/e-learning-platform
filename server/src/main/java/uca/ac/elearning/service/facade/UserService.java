package uca.ac.elearning.service.facade;

import java.util.List;

import uca.ac.elearning.bean.users.User;

public interface UserService {
 List<User> findAllProfs();
List<User> findAllStudents();
    
}