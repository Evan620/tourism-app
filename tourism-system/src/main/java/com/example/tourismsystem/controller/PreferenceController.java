package com.example.tourismsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.tourismsystem.entity.Preference;
import com.example.tourismsystem.service.PreferenceService;

import java.util.List;

@RestController
@RequestMapping("/preferences")
public class PreferenceController {

    @Autowired
    private PreferenceService preferenceService;

    @GetMapping("/user/{userId}")
    public List<Preference> getPreferencesByUserId(@PathVariable Integer userId) {
        return preferenceService.getPreferencesByUserId(userId);
    }

    @PostMapping
    public void savePreference(@RequestBody Preference preference) {
        preferenceService.savePreference(preference);
    }

    @PutMapping("/{id}")
    public void updatePreference(@PathVariable Integer id, @RequestBody Preference preference) {
        preference.setId(id); // Explicitly set the ID
        preferenceService.updatePreference(preference);
    }

    @DeleteMapping("/{id}")
    public void deletePreference(@PathVariable Integer id) {
        preferenceService.deletePreference(id);
    }
}