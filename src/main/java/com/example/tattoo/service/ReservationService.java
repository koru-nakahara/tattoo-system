package com.example.tattoo.service;
import com.example.tattoo.domain.Reservation;
import com.example.tattoo.repository.ReservationRepository;
import org.springframework.stereotype.Service;
//Service 让Spring在启动时自动创建这个类的对象，并交给Spring处理
import java.util.List;

    @Service
    public class ReservationService {

        private final ReservationRepository reservationRepository;

        public ReservationService(ReservationRepository reservationRepository) {
            this.reservationRepository = reservationRepository;
        }

        public Reservation save(Reservation reservation) {
            return reservationRepository.save(reservation);
        }

        public List<Reservation> findAll() {
            return reservationRepository.findAll();
        }

        public void deleteById(long id){
            reservationRepository.deleteById(id);
        }
    }

