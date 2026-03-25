package com.example.tattoo;
//HTTP是浏览器和服务器之间的沟通媒介（传话人）
//常见的HTTP有四种
//@GetMapping=接收GET请求 读取查看数据
//@PostMapping=接收POST请求 新建新增数据
//@Putmapping=接收PUT请求 修改/更新已有数据
//@DeleteMapping=接收DELETE请求 删除数据
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.tattoo.domain.Reservation;
import com.example.tattoo.repository.ReservationRepository;
    @RestController
    public class Controller {

        private final ReservationRepository repository;

        public Controller(ReservationRepository repository) {
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

