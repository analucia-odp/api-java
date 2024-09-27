package com.eventostec.api.repositories;

import com.eventostec.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//Deve passar o tipo da Entidade e o tipo da chave primária
public interface EventRepository extends JpaRepository<Event, UUID> {

}
