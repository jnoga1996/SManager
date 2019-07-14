package com.smanager.dao.repositories;

import com.smanager.dao.models.Assignment;
import com.smanager.dao.models.AssignmentSolution;
import com.smanager.dao.models.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AssignmentSolutionRepository extends JpaRepository<AssignmentSolution, Long> {
    @Query(value = "select * from ASSIGNMENTS_SOLUTIONS as a_s " +
            "join ASSIGNMENTS as a on a_s.assignment_id = a.id " +
            "join SOLUTIONS as s on a_s.solution_id = s.id " +
            "order by assignment_id", nativeQuery = true)
    List<AssignmentSolution> findAllAssignmentSolutions();
    
}
