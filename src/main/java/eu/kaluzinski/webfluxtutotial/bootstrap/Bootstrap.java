package eu.kaluzinski.webfluxtutotial.bootstrap;

import eu.kaluzinski.webfluxtutotial.domain.Category;
import eu.kaluzinski.webfluxtutotial.domain.Vendor;
import eu.kaluzinski.webfluxtutotial.repository.CategoryRepository;
import eu.kaluzinski.webfluxtutotial.repository.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {


    private final VendorRepository vendorRepository;
    private final CategoryRepository categoryRepository;

    public Bootstrap(VendorRepository vendorRepository, CategoryRepository categoryRepository) {
        this.vendorRepository = vendorRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        new Category("F", "d");

        if (categoryRepository.count().block() == 0) {
            System.out.println("Bootstraping data");
            categoryRepository.save(Category.builder().description("Fruits").build()).block();

            categoryRepository.save(Category.builder().description("Nuts").build()).block();

            categoryRepository.save(Category.builder().description("Breads").build()).block();

            categoryRepository.save(Category.builder().description("Meats").build()).block();

            categoryRepository.save(Category.builder().description("Eggs").build()).block();


            vendorRepository.save(Vendor.builder().firstName("John").lastName("Wick").build()).block();

            vendorRepository.save(Vendor.builder().firstName("Jon").lastName("Snow").build()).block();

            vendorRepository.save(Vendor.builder().firstName("Marian").lastName("Tajny").build()).block();


        }

        System.out.println("Categories: " + categoryRepository.count().block());

        System.out.println("Vendors: " + vendorRepository.count().block());
    }


}
