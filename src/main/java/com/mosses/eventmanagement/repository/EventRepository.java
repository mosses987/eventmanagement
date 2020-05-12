package com.mosses.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mosses.eventmanagement.entity.Event;

import java.util.List;


public interface EventRepository extends PagingAndSortingRepository<Event, Long> {


    List<Event> findByName(@Param("name") String name);
}
