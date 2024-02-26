package uca.ac.elearning.webService.dto;

import lombok.Data;
import uca.ac.elearning.bean.GroupeEtudiantDetail;
import uca.ac.elearning.bean.StudentInscription;
import uca.ac.elearning.bean.Parcours;
import uca.ac.elearning.bean.Prof;

import java.time.LocalDate;

@Data
public class GroupeEtudiantDto {
    private long id;
    private String libelle;
    private LocalDate date;
    private Prof prof;
    private GroupeEtudiantDetail groupeEtudiantDetail;
    private StudentInscription inscriptionEtudiant;
    private Parcours parcours;
}

