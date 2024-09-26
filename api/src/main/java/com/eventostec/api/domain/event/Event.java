package com.eventostec.api.domain.event;

import com.eventostec.api.domain.address.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue
    private UUID IdEvent;

    private String Title;
    private String Description;
    private Date DateEvent;
    private Address Address;
    private String ImageUrl;
    private String EventUrl;
    private Boolean Type;

}
