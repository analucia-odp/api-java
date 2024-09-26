package com.eventostec.api.domain.address;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name ="address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private UUID IdAddress;

    private String Street;
    private Integer Number;
    private String City;
    private String State;
    private String Country;
    private String PostalCode;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
