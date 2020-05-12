package com.mosses.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mosses.eventmanagement.entity.Organizer;



public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
