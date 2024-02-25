package uca.ac.elearning.webService.dto;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import uca.ac.elearning.bean.GroupeEtudiantDetail;
import uca.ac.elearning.bean.InscriptionEtudiant;
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
    private InscriptionEtudiant inscriptionEtudiant;
    private Parcours parcours;
}

