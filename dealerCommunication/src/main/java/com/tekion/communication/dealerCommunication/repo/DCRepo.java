package com.tekion.communication.dealerCommunication.repo;

import com.mongodb.client.result.UpdateResult;
import com.tekion.communication.dealerCommunication.DealerCommunication.DealerCommunication;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface DCRepo {
    public DealerCommunication save(DealerCommunication dm);

    public DealerCommunication findById(String id);
    public List<DealerCommunication> findByIds();
    public UpdateResult update(String id, Map<Object, Object> request);
    public String findAndReplace(String id, String find, String replace) throws IOException;


}
