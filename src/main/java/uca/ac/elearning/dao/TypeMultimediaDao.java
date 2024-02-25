package uca.ac.elearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uca.ac.elearning.bean.TypeMutimedia;

@Repository
public interface TypeMultimediaDao extends JpaRepository<TypeMutimedia,Long> {

   TypeMutimedia FindByLibelle(String libelle);
   TypeMutimedia FindByCode(String code);
   int DeleteByCode(String code);
   int DeleteByLibelle(String libelle);



}
