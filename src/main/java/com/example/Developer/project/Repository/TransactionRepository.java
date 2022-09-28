package com.example.Developer.project.Repository;


import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
