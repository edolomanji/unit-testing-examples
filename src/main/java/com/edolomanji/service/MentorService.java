package com.edolomanji.service;

import java.util.List;
import java.util.Optional;

import com.edolomanji.domain.Intern;
import com.edolomanji.domain.Mentor;

public interface MentorService {

    List<Mentor> getAll();

    Optional<Mentor> findByEmail(String email);

    void update(Mentor mentor);
}
