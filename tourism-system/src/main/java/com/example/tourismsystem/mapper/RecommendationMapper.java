package com.example.tourismsystem.mapper;

import com.example.tourismsystem.entity.Recommendation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecommendationMapper {
    List<Recommendation> getRecommendationsByUserId(Integer userId);
    void insertRecommendation(Recommendation recommendation);
    void updateRecommendation(Recommendation recommendation);
    void deleteRecommendation(Integer id);
}