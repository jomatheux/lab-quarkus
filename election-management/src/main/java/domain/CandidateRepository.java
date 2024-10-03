package domain;

import java.util.List;

public interface CandidateRepository {
    void save(List<Candidate> candidate);

    default void save(Candidate candidate){
        save(List.of(candidate));
    }

    List<Candidate> findAll();
}
