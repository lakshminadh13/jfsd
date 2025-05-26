package com.example.newsapp.controller;

import java.util.List;

import com.example.newsapp.model.Summary;
import com.example.newsapp.service.SummaryService;

// controller/SummaryController.java
@RestController
@RequestMapping("/api/summaries")
public class SummaryController {

    @Autowired
    private SummaryService summaryService;

    @PostMapping
    public ResponseEntity<Summary> createSummary(@RequestBody Summary summary) {
        return new ResponseEntity<>(summaryService.saveSummary(summary), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Summary> getSummaries() {
        return summaryService.getAllSummaries();
    }
}
