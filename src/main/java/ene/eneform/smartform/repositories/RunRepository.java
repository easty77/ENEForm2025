package ene.eneform.smartform.repositories;

import ene.eneform.smartform.entities.Run;
import ene.eneform.smartform.entities.RunId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RunRepository extends CrudRepository<Run, RunId> {

    List<Run> findByName(String name);

        @Query("FROM Run u JOIN FETCH u.race JOIN FETCH u.dailyRunner WHERE u.name = :name")
        List<Run> findRunsByName(@Param("name") String name);

    List<Run> findByRunnerId(Integer runnerId);
}
