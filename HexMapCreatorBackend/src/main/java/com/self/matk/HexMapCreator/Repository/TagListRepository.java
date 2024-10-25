package com.self.matk.HexMapCreator.Repository;

import com.self.matk.HexMapCreator.Entities.TagList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagListRepository extends JpaRepository<TagList,Integer> {
}
