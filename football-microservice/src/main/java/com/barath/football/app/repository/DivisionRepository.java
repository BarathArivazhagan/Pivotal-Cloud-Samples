package com.barath.football.app.repository;

import com.barath.football.app.entity.Division;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * Created by barath on 18/03/18.
 */
public interface DivisionRepository extends ReactiveMongoRepository<Division,Integer> {

    Mono<Division> findByDivisionName(Mono<String> divisionName);
}
