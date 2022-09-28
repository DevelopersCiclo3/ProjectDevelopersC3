package com.example.Developer.project.Services.TransactionService;


        import com.example.Developer.project.Entities.Transaction;
        import com.example.Developer.project.Repository.TransactionRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;

@Service
public class ServiceTransaction implements ServiceTransactionInterface {
    @Autowired
    private TransactionRepository repositorio;
    @Override
    public List<Transaction> getTransactions() {
        return repositorio.findAll();
    }

    @Override
    public Transaction getTransaction(String id) throws Exception {
        Optional<Transaction> transactionBD = repositorio.findById(id);
        if(transactionBD.isPresent()){
            return transactionBD.get();
        }
        throw new Exception("Transaccion no existe");
    }

    @Override
    public String setTransaction(Transaction transaction_parametro) {
        repositorio.save(transaction_parametro);
        return "Empleado creado exitosamente";
    }

    @Override
    public Transaction updateTransactionAll(Transaction transaction_update, String id) throws Exception {
        repositorio.deleteById(id);
        repositorio.save(transaction_update);
        return null;
    }

    @Override
    public Transaction updateTransaction(Transaction transaction_update, String id) throws Exception {
        repositorio.deleteById(id);
        repositorio.save(transaction_update);
        return null;
    }

    @Override
    public String deleteTransaction(String id) {
        repositorio.deleteById(id);
        return "Transaccion eliminada";
    }
}
