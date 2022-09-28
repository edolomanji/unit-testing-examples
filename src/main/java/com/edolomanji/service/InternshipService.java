package com.edolomanji.service;

import java.util.List;

import com.edolomanji.domain.Intern;
import com.edolomanji.domain.InternCandidate;
import com.edolomanji.domain.Mentor;

public interface InternshipService {

    List<Intern> handleInternCandidates(List<InternCandidate> internCandidates);

    List<Mentor> getAvailableMentors();

    void assignInternToMentor(Mentor mentor, Intern intern);

}
