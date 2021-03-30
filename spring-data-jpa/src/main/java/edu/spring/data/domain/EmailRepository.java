package edu.spring.data.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmailRepository extends JpaRepository<Email, Integer>, JpaSpecificationExecutor<Email> {
}
