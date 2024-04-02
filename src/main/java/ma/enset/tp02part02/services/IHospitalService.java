package ma.enset.tp02part02.services;

import ma.enset.tp02part02.entities.Consultation;
import ma.enset.tp02part02.entities.Medecin;
import ma.enset.tp02part02.entities.Patient;
import ma.enset.tp02part02.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
