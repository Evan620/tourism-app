package com.example.tourismsystem.service;

import com.example.tourismsystem.mapper.RecommendationMapper;
import com.example.tourismsystem.entity.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class RecommendationService {

    @Autowired
    private RecommendationMapper recommendationMapper;

    public List<Recommendation> getRecommendationsByUserId(Integer userId) {
        return recommendationMapper.getRecommendationsByUserId(userId);
    }

    public void saveRecommendation(Recommendation recommendation) {
        recommendationMapper.insertRecommendation(recommendation);
    }

    public void updateRecommendation(Recommendation recommendation) {
        recommendationMapper.updateRecommendation(recommendation);
    }

    public void deleteRecommendation(Integer id) {
        recommendationMapper.deleteRecommendation(id);
    }
}