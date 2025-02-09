package com.example.tourismsystem.service;

import com.example.tourismsystem.mapper.PreferenceMapper;
import com.example.tourismsystem.entity.Preference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService {

    @Autowired
    private PreferenceMapper preferenceMapper;

    public List<Preference> getPreferencesByUserId(Integer userId) {
        return preferenceMapper.getPreferencesByUserId(userId);
    }

    public void savePreference(Preference preference) {
        preferenceMapper.insertPreference(preference);
    }

    public void updatePreference(Preference preference) {
        preferenceMapper.updatePreference(preference);
    }

    public void deletePreference(Integer id) {
        preferenceMapper.deletePreference(id);
    }
}