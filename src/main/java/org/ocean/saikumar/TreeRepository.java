package org.ocean.saikumar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Integer> {
}
