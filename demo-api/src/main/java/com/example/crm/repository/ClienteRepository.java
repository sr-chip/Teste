package com.example.crm.repository;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.crm.model.Cliente;

@Repository
//@EnableJpaRepositories(basePackages = "com.techprimers.db.repository")
//@SpringBootApplication
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
