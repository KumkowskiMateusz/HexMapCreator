package com.self.matk.HexMapCreator.Repository;

import com.self.matk.HexMapCreator.Entities.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends JpaRepository<Tags,Integer> {
}
