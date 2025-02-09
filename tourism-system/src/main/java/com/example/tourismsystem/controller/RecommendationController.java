package com.example.tourismsystem.controller;


import com.example.tourismsystem.entity.Recommendation;
import com.example.tourismsystem.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/user/{userId}")
    public List<Recommendation> getRecommendationsByUserId(@PathVariable Integer userId) {
        return recommendationService.getRecommendationsByUserId(userId);
    }

    @PostMapping
    public void saveRecommendation(@RequestBody Recommendation recommendation) {
        recommendationService.saveRecommendation(recommendation);
    }

    @PutMapping("/{id}")
    public void updateRecommendation(@PathVariable Integer id, @RequestBody Recommendation recommendation) {
        recommendation.setId(id); // Explicitly set the ID
        recommendationService.updateRecommendation(recommendation);
    }

    @DeleteMapping("/{id}")
    public void deleteRecommendation(@PathVariable Integer id) {
        recommendationService.deleteRecommendation(id);
    }
}
