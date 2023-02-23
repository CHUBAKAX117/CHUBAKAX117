package com.portfolio.api.service;

import com.portfolio.api.model.Skills;
import com.portfolio.api.repository.SkillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService implements ISkillsService {

    @Autowired
    public SkillsRepo skillsRepo;

    @Override
    public List<Skills> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void crearSkills(Skills skills) {
        skillsRepo.save(skills);
    }

    @Override
    public void eliminarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }

    @Override
    public void buscarPorId(Long id) {
        skillsRepo.findById(id).get();
    }

}