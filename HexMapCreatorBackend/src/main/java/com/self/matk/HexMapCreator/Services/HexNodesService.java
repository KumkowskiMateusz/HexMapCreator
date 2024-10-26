package com.self.matk.HexMapCreator.Services;

import com.self.matk.HexMapCreator.Repository.HexNodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HexNodesService {
    HexNodesRepository hexNodesRepository;

    @Autowired
    public HexNodesService(HexNodesRepository hexNodesRepository){
        this.hexNodesRepository = hexNodesRepository;
    }
}
