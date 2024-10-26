package com.self.matk.HexMapCreator.Services;

import com.self.matk.HexMapCreator.Repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagsService {
    TagsRepository tagsRepository;

    @Autowired
    public TagsService(TagsRepository tagsRepository){
        this.tagsRepository = tagsRepository;
    }
}
