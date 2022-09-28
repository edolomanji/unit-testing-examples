package com.edolomanji.service;

import java.util.List;
import java.util.stream.Collectors;

import com.edolomanji.domain.EducationStage;
import com.edolomanji.domain.Intern;
import com.edolomanji.domain.InternCandidate;
import com.edolomanji.domain.Mentor;
import com.edolomanji.execution.validator.MentorAssignmentValidator;

public class InternshipServiceImpl implements InternshipService {

    private final MentorService mentorService;

    private final InternService internService;

    private final MentorAssignmentValidator mentorAssignmentValidator;

    public InternshipServiceImpl(MentorService mentorService, InternService internService, MentorAssignmentValidator mentorAssignmentValidator) {
        this.mentorService = mentorService;
        this.internService = internService;
        this.mentorAssignmentValidator = mentorAssignmentValidator;
    }

    @Override
    public List<Intern> handleInternCandidates(List<InternCandidate> internCandidates) {
        return internCandidates.stream()
                .filter(internCandidate -> internCandidate.getEducationStage() != EducationStage.NONE)
                .map(internCandidate -> new Intern(internCandidate.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Mentor> getAvailableMentors() {
        return mentorService.getAll().stream()
                .filter(Mentor::isFree)
                .collect(Collectors.toList());
    }

    @Override
    public void assignInternToMentor(Mentor mentor, Intern intern) {
        mentorAssignmentValidator.validate(mentor);

        mentor.setIntern(intern);

        mentorService.update(mentor);
    }
}
