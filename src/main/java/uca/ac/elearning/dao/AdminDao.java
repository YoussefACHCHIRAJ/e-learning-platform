package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {

    Admin findByUsername(String username);
    Admin findByEmail(String email);
}
