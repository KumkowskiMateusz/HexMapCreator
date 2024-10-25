package com.self.matk.HexMapCreator.Repository;


import com.self.matk.HexMapCreator.Entities.HexNodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HexNodesRepository extends JpaRepository<HexNodes,Integer> {
}
