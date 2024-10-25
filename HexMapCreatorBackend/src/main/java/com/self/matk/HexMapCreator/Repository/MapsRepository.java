package com.self.matk.HexMapCreator.Repository;

import com.self.matk.HexMapCreator.Entities.Maps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface MapsRepository extends JpaRepository<Maps,Integer> {
}
