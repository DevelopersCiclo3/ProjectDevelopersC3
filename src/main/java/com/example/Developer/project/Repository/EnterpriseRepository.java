package com.example.Developer.project.Repository;


import com.example.Developer.project.Entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise, String> {
}
