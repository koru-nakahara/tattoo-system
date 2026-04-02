package com.example.tattoo.controller;
//HTTP是浏览器和服务器之间的沟通媒介（传话人）
//常见的HTTP有四种
//@GetMapping=接收GET请求 读取查看数据
//@PostMapping=接收POST请求 新建新增数据
//@Putmapping=接收PUT请求 修改/更新已有数据
//@DeleteMapping=接收DELETE请求 删除数据
import com.example.tattoo.domain.ReservationStatus;
import org.springframework.web.bind.annotation.*;
import com.example.tattoo.domain.Reservation;
import com.example.tattoo.service.ReservationService;
import com.example.tattoo.dto.CreateReservationRequest;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/reservations")
    public class Controller
    //Controller  控制层 控制器 ;
    {

        private final ReservationService reservationService;

        public Controller(ReservationService reservationService) {
            this.reservationService = reservationService;
        }

        @PostMapping
        public Reservation create(@RequestBody CreateReservationRequest request) {
            Reservation reservation = new Reservation();
            reservation.setCustomerName(request.getCustomerName());
            reservation.setPhone(request.getPhone());
            reservation.setDesign(request.getDesign());
            reservation.setReservationTime(request.getReservationTime());
            reservation.setStatus(ReservationStatus.WAITING);
            return reservationService.save(reservation);
        }
        @GetMapping
        public List<Reservation>findALL(){
            return reservationService.findAll();

        }
        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            reservationService.deleteById(id);
        }
        @PutMapping("/{id}")
        public Reservation update(@PathVariable Long id, @RequestBody Reservation reservation) {
            reservation.setId(id);
            return reservationService.save(reservation);
        }

    }

