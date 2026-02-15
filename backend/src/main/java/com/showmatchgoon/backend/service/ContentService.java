package com.showmatchgoon.backend.service;

import com.showmatchgoon.backend.entity.Content;
import com.showmatchgoon.backend.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContentService {
    @Autowired
    private ContentRepository contentRepository;

    public List<Content> getAllContent() {
        return contentRepository.findAll();
    }

    public List<Content> getContentByType(String type) {
        return contentRepository.findByType(type);
    }

    public Content saveContent(Content content) {
        return contentRepository.save(content);
    }
}
