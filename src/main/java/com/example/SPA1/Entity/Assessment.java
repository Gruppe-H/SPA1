package com.example.SPA1.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Assessments")
    public class Assessment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "assessment_id")
        private Long assessmentId;

        @Column(name = "assessment_boundary")
        private String assessmentBoundary;

        @Column(name = "assessment_link")
        private String assessmentLink;

        @Column(name = "link_confirmation")
        private String linkConfirmation;

        @Column(name = "assessment_factors")
        private String assessmentFactors;

        @Column(name = "assessment_authors")
        private String assessmentAuthors;

        @Column(name = "adaptation_plan")
        private String adaptationPlan;

        @Column(name = "organization_id")
        private Long organizationId;

}

