package com.packege.project.repository;

import com.packege.project.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByName(String name);
    List<Cliente> findByNameContaining(String name);


}
