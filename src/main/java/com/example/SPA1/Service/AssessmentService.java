package com.example.SPA1.Service;

import com.example.SPA1.Entity.Assessment;
import com.example.SPA1.Repositories.AssessmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private AssessmentRepository assessmentRepository;

    public AssessmentService(){

    }

    public Assessment getAssessmentById(Long id) {
        return assessmentRepository.findById(id).orElse(null);
    }

    public Assessment createAssessment(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    public void deleteAssessment(Long id) {
        assessmentRepository.deleteById(id);
    }

    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }
    // Add more methods for updating, deleting, and listing assessments
}
