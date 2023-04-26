package se.salt.elmira.restserviceaddressbook.service;

import se.salt.elmira.restserviceaddressbook.model.Contact;

public interface ContactService {
    Contact create(Contact contact);
    Contact get(long id);
    Contact update (Contact contact);
    void delete(long id);
}
