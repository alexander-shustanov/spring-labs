package edu.spring.data;

import edu.spring.data.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.annotation.PostConstruct;

@SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
@SpringBootApplication
public class Main {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @PostConstruct
    public void init() {
        repository.save(new Person("Pushkin"));

        System.out.println(repository.findByName("Pushkin", Sort.by(Sort.Order.asc("id"))).getName());


        emailRepository.save(new Email("foo"));
        emailRepository.save(new Email("baz"));
        emailRepository.save(new Email("bar"));

        for (Email email : emailRepository.findAll(PageRequest.of(2, 1))) {
            System.out.println(email.getEmail());
        }


        emailRepository.findOne(EmailSpecification.hasEmailEquals("foo"))
                .ifPresent(System.out::println);


        countryRepository.save(new Country("Russia", "RU"));
        countryRepository.save(new Country("Romania", "RO"));

        System.out.println(countryRepository.findCountryByCodeName("RU"));
        countryRepository.findCountryByNameStartsWith("R").forEach(System.out::println);


    }
}
