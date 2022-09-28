package com.example.Developer.project.Services.TransactionService;

import com.example.Developer.project.Entities.Enterprise;
import com.example.Developer.project.Entities.Transaction;

import java.util.List;

public interface ServiceTransactionInterface {
    public List<Transaction> getTransactions();
    public Transaction getTransaction(String id) throws Exception;
    public String setTransaction(Transaction transaction_parametro);
    public Transaction updateTransactionAll(Transaction transaction_update, String id) throws Exception;
    public Transaction updateTransaction(Transaction transaction_update, String id) throws Exception;
    public String deleteTransaction(String id);
}
