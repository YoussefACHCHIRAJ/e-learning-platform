package uca.ac.elearning.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import uca.ac.elearning.bean.users.Role;
import uca.ac.elearning.bean.users.User;
import uca.ac.elearning.dao.users.UserDao;
import uca.ac.elearning.service.facade.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Override
    public List<User> findAllProfs(){
        return userDao.findByRole(Role.PROF);
    }
    @Override
    public List<User> findAllStudents(){
        return userDao.findByRole(Role.STUDENT);
    }

    

}
