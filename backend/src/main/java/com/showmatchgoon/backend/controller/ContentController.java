package com.showmatchgoon.backend.controller;

import com.showmatchgoon.backend.entity.Content;
import com.showmatchgoon.backend.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping
    public List<Content> getAllContent() {
        return contentService.getAllContent();
    }

    @GetMapping("/type/{type}")
    public List<Content> getContentByType(@PathVariable String type) {
        return contentService.getContentByType(type);
    }

    @PostMapping
    public Content createContent(@RequestBody Content content) {
        return contentService.saveContent(content);
    }
}
