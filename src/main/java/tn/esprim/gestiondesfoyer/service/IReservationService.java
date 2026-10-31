package tn.esprim.gestiondesfoyer.service;

import tn.esprim.gestiondesfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation retrieveReservation(String id);

    Reservation addReservation(Reservation r);

    void removeReservation(String id);

    Reservation modifyReservation(Reservation r);
}