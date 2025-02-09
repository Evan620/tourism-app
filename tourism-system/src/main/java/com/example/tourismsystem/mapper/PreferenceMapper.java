package com. example. tourismsystem.mapper;

import com.example.tourismsystem.entity.Preference;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PreferenceMapper {
    List<Preference> getPreferencesByUserId(Integer userId);
    void insertPreference(Preference preference);
    void updatePreference(Preference preference);
    void deletePreference(Integer id);
}