package eu.kaluzinski.webfluxtutotial.repository;

import eu.kaluzinski.webfluxtutotial.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
