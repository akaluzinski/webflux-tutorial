package eu.kaluzinski.webfluxtutotial.repository;

import eu.kaluzinski.webfluxtutotial.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
