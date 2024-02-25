package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.Cours;
import uca.ac.elearning.bean.Etudiant;

import java.util.Date;

@Data
public class InscriptionEtudiantDto {
    private long id;
    private Date dateInscription;
    private Cours coursActuel;
    private Etudiant etudiant;
}
