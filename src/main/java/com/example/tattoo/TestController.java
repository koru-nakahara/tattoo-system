package com.example.tattoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tattoo.domain.Reservation;
import com.example.tattoo.repository.ReservationRepository;
    @RestController
    public class TestController {

        private final ReservationRepository repository;

        public TestController(ReservationRepository repository) {
            this.repository = repository;
        }

        @GetMapping("/test-insert")
        public String testInsert() {
            Reservation r = new Reservation();
            r.setCustomerName("Tom");
            r.setPhone("123456");
            r.setDesign("Dragon");

            repository.save(r);
            return "insert ok";
        }
    }

