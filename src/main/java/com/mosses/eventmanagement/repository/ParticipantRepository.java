package com.mosses.eventmanagement.repository;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.mosses.eventmanagement.entity.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
