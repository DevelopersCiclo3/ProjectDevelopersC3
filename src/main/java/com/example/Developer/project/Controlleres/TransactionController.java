package com.example.Developer.project.Controlleres;

import com.example.Developer.project.Entities.Employee;
import com.example.Developer.project.Entities.Enterprise;
import com.example.Developer.project.Entities.Transaction;
import com.example.Developer.project.Entities.objectResponse;
import com.example.Developer.project.Services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TransactionController {

    private TransactionService transactionService = new TransactionService();
    @GetMapping("/transactions")
    public ResponseEntity<ArrayList<Transaction>> getTransactions(){
        return new ResponseEntity<>(transactionService.getTransactions(), HttpStatus.OK);
    }

    @GetMapping("/transaction")
    public ResponseEntity<Object> getTransaction(@RequestParam String id){
        try{
            Transaction transaction1 = transactionService.getTransaction(id);
            return new ResponseEntity<>(transaction1, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/transaction/{id}")
    public ResponseEntity<Object> getTransactionPath(@PathVariable String id){
        try {
            Transaction transaction = transactionService.getTransaction(id);
            return new ResponseEntity<>(transaction, HttpStatus.OK);
        } catch (Exception e){
            return  new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/transaction")
    public ResponseEntity<String> postTransaction(@RequestBody Transaction transaction_parametro){
        try {
            String mensaje = transactionService.setTransaction(transaction_parametro);
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/transaction/{id}")
    public ResponseEntity<objectResponse> putTransaction(@RequestBody Transaction transaction_update, @PathVariable String id) {
        try {
            Transaction transaction_bd = transactionService.updateTransactionAll(transaction_update, id);
            return new ResponseEntity<>(new objectResponse("Registro de actualizacion exitoso", transaction_bd), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new objectResponse(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/transaction/{id}")
    public ResponseEntity<objectResponse> patchTransaction(@RequestBody Transaction transaction_update, @PathVariable String id ){

        try {
            Transaction transaction_bd = transactionService.updateTransaction(transaction_update, id);
            return new ResponseEntity<>(new objectResponse("ActualizaciÃ³n Exitosa",transaction_bd),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(new objectResponse(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/transaction/{id}")
    public ResponseEntity<objectResponse> deleteTransaction(@PathVariable String id) {

        try {
            String mensaje = transactionService.deleteTransaction(id);

            return new ResponseEntity<>(new objectResponse(mensaje, null), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new objectResponse(e.getMessage(), null), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
