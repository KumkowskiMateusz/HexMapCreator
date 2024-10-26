package com.self.matk.HexMapCreator.Services;

import com.self.matk.HexMapCreator.Repository.MapsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapsService {
    MapsRepository mapsRepository;

    @Autowired
    public MapsService(MapsRepository mapsRepository){
        this.mapsRepository = mapsRepository;
    }
}
