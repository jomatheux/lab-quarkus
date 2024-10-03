package infrastructure.repositories;

import domain.Candidate;
import domain.CandidateRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class SQLCandidateRepository implements CandidateRepository {
    @Override
    public void save(List<Candidate> candidate) {

    }

    @Override
    public List<Candidate> findAll() {
        return List.of();
    }
}
