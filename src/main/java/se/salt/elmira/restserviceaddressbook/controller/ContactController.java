package se.salt.elmira.restserviceaddressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.salt.elmira.restserviceaddressbook.model.Contact;
import se.salt.elmira.restserviceaddressbook.service.ContactService;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable long id) {
        return ResponseEntity.ok().body(contactService.get(id));
    }

    @PostMapping("/contact")
    public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
        contactService.create(contact);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/contact")
    public ResponseEntity<Contact> updateContact(@RequestBody Contact contact) {
        contactService.update(contact);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/contact/{id}")
    public ResponseEntity deleteContact(@PathVariable long id) {
        contactService.delete(id);
        return ResponseEntity.ok().build();
    }
}
