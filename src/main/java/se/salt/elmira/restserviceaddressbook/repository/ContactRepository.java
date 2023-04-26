package se.salt.elmira.restserviceaddressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.salt.elmira.restserviceaddressbook.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
