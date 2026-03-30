package com.example.tattoo.repository;
//类型不是java而是Interface的原因是实现代码由spring在运行时自动生成
//是一种动态代理机制代理数据库的几个基本操作（增Create查Read改Update删Delete）
//Repository 仓库 数据访问层   作用：负责和数据库交互 crud操作 不写业务规则
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tattoo.domain.Reservation;
public interface ReservationRepository
     extends JpaRepository<Reservation, Long> {

    }
    //JpaRepository是Spring Data JPA框架提供的窗口
    // 它里面定义好了：
    //sava（） findAll() findByld() deleteByld() 分页查询 排序查询 这些功能
    // 写了extends JpaRepository<Reservation, Long>就集成了Spring提供的数据库操作能力