package com.example.tattoo.domain;
//ReservationStatus：Reservation:预约 Status:状态
public enum ReservationStatus {
    WAITING,//等待 待确认
    CONFIRMED,//已确认 预约被接收
    DONE,//已完成
    CANCELED//取消
}
