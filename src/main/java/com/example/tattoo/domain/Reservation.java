package com.example.tattoo.domain;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity//实体层 暗示这个类不是普通java类 对应数据库里的一张表
public class Reservation {

    //Reservation 预约
    //ReservationStatus 预约状态
    @Id//设定主键 主键不能重复 主键的三个要素：1 唯一，不能重复 2 不会变化 3 尽量简单
    @GeneratedValue(strategy = GenerationType.IDENTITY)//对应数据库id BIGINT AUTO_INCREMENT
    //@的作用 如果后面紧跟着字段 会自动判定在紧挨着的那个程序元素上比如：
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id; 自动递增id这个元素
    private Long id;
    private String customerName;
    private String phone;
    private String design;
    private LocalDateTime reservationTime;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
    // 必须有无参构造
    public Reservation() {}

    @PrePersist
    //在数据第一次插入数据库前自动执行
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    //每次执行update的时候触发更新
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    // getter / setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDesign() { return design; }
    public void setDesign(String design) { this.design = design; }

    public LocalDateTime getReservationTime() { return reservationTime; }
    public void setReservationTime(LocalDateTime reservationTime) { this.reservationTime = reservationTime; }

    public ReservationStatus getStatus() {return status;}
    public void setStatus(ReservationStatus status){ this.status=status; }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


}


