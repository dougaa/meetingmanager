package com.crud.saladereuiniao.saladereuniao.repository;

import com.crud.saladereuiniao.saladereuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
