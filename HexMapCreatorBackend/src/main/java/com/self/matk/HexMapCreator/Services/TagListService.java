package com.self.matk.HexMapCreator.Services;

import com.self.matk.HexMapCreator.Repository.TagListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagListService {
    TagListRepository tagListRepository;

    @Autowired
    public TagListService(TagListRepository tagListRepository){
        this.tagListRepository = tagListRepository;
    }

}
