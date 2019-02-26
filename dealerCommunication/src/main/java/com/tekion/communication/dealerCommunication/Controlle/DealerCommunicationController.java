package com.tekion.communication.dealerCommunication.Controlle;

import com.mongodb.client.result.UpdateResult;
import com.tekion.communication.dealerCommunication.DealerCommunication.DealerCommunication;
import com.tekion.communication.dealerCommunication.repo.DCRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class DealerCommunicationController {
    @Autowired
    DCRepo service;

    @GetMapping("/dc/find")
    public ResponseEntity<List<DealerCommunication>> findAll(){
        return ResponseEntity.ok(service.findByIds());
    }

    @GetMapping("/dc/find/{id}")
    public ResponseEntity<DealerCommunication> findById(@PathVariable String id){
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping("/dc/save")
    public ResponseEntity<DealerCommunication> save(@RequestBody DealerCommunication dc){
        return ResponseEntity.ok(service.save(dc));
    }

    @PutMapping("/dc/update/{id}")
    public ResponseEntity<UpdateResult> updateById(@PathVariable String id, @RequestBody Map<Object,Object> update){
        return  ResponseEntity.ok(service.update(id,update) );
    }

//    @DeleteMapping("/dc/delete/{id}")
//    public ResponseEntity deleteById(@PathVariable String id){
//        return ResponseEntity.ok(service.(id));
//    }

}
