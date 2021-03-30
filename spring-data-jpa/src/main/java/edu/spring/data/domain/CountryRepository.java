package edu.spring.data.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    List<Country> findCountryByNameStartsWith(String name);

    Country findCountryByCodeName(String codeName);
}
