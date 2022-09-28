package com.edolomanji.execution.validator;

import com.edolomanji.domain.Mentor;
import com.edolomanji.execution.exception.MentorIsNotFreeException;

public class MentorAssignmentValidatorImpl implements MentorAssignmentValidator {

    @Override
    public boolean validate(final Mentor mentor) {
        if (!mentor.isFree()){
            throw new MentorIsNotFreeException(mentor.getEmail());
        }

        return true;
    }
}
