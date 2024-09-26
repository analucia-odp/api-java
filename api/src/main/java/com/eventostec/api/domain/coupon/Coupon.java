package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name ="coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID IdCoupon;

    private Integer Value;
    private String CodeCoupon;
    private Date ExpireDate;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
