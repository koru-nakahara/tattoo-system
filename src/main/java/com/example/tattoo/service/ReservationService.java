package com.example.tattoo.service;
import com.example.tattoo.domain.Reservation;
import com.example.tattoo.domain.ReservationStatus;
import com.example.tattoo.dto.CreateReservationRequest;
import com.example.tattoo.repository.ReservationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class ReservationService {
        //@Service 是把这个类注册进Spring容器 类ReservationService在其他地方被需要的时候就会自动把创建好的放进去
        private final ReservationRepository reservationRepository;

        public ReservationService(ReservationRepository reservationRepository) {
            this.reservationRepository = reservationRepository;
        }

        public Reservation create(CreateReservationRequest request) {
            Reservation reservation = new Reservation();
            reservation.setCustomerName(request.getCustomerName());
            reservation.setPhone(request.getPhone());
            reservation.setDesign(request.getDesign());
            reservation.setReservationTime(request.getReservationTime());
            reservation.setStatus(ReservationStatus.WAITING);
            return reservationRepository.save(reservation);
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
        public Reservation findById(Long id) {
            return reservationRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Reservation not found"));
        }
    }

