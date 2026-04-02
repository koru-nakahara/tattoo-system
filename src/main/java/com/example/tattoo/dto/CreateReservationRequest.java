package com.example.tattoo.dto;
import java.time.LocalDateTime;
public class CreateReservationRequest {
    private String customerName;
    private String phone;
    private String design;
    private LocalDateTime reservationTime;

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDesign() { return design; }
    public void setDesign(String design) { this.design = design; }

    public LocalDateTime getReservationTime() { return reservationTime; }
    public void setReservationTime(LocalDateTime reservationTime) { this.reservationTime = reservationTime; }

}
