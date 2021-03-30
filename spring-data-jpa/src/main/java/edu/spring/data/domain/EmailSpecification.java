package edu.spring.data.domain;

import org.springframework.data.jpa.domain.Specification;

public class EmailSpecification {
    public static Specification<Email> all() {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.isTrue(criteriaBuilder.literal(Boolean.TRUE));
    }

    public static Specification<Email> hasEmailEquals(String email) {
        return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("email"), email);
    }
}
