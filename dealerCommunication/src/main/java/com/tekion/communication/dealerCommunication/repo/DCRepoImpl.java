package com.tekion.communication.dealerCommunication.repo;

import com.mongodb.client.result.UpdateResult;
import com.tekion.communication.dealerCommunication.DealerCommunication.DealerCommunication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Component
public class DCRepoImpl implements DCRepo {
    MongoTemplate mongoTemplate;

    public DCRepoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public DealerCommunication save(DealerCommunication dm) {
        return mongoTemplate.save(dm);
    }

    @Override
    public DealerCommunication findById(String id) {
        Query qr = new Query();
        qr.addCriteria(Criteria.where("_id").is(id));
        qr.addCriteria(Criteria.where("isActive").is(true));
        return mongoTemplate.findById(id,DealerCommunication.class);
    }

    @Override
    public List<DealerCommunication> findByIds() {
        return mongoTemplate.findAll(DealerCommunication.class);
    }

    @Override
    public UpdateResult update(String id, Map<Object,Object> request) {
        Update update = new Update();

        for(Map.Entry<Object,Object> entry:request.entrySet()) {
            update.set(""+entry.getKey(),entry.getValue());
        }
        Query qr = new Query();
        qr.addCriteria(Criteria.where("_id").is(id));
        qr.addCriteria(Criteria.where("isActive").is(true));
        return mongoTemplate.updateFirst(qr,update,DealerCommunication.class);
    }
    @Override
    public String findAndReplace(String id, String find, String replace) throws IOException {
//        DealerCommunication communication=new DealerCommunication();
//        for(Field field:communication){
//
//        }
        return null;
    }
}
