package se.salt.elmira.restserviceaddressbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.salt.elmira.restserviceaddressbook.model.Contact;
import se.salt.elmira.restserviceaddressbook.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact create(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact get(long id) {
        return contactRepository.findById(id).get();
    }

    @Override
    public Contact update(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void delete(long id) {
        contactRepository.deleteById(id);
    }
}
