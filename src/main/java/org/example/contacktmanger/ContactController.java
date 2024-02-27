package org.example.contacktmanger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping
    public ResponseEntity<String> addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body("Contact added successfully");
    }

    @DeleteMapping
    public ResponseEntity<String> deleteContact(@RequestBody Contact contact) {
        contactService.deleteContact(contact);
        return ResponseEntity.status(HttpStatus.OK).body("Contact deleted successfully");
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveContactsToFile(@RequestParam String fileName) {
        contactService.saveContactsToFile(fileName);
        return ResponseEntity.status(HttpStatus.OK).body("Contacts saved to file successfully");
    }

    @PostMapping("/load")
    public ResponseEntity<String> loadContactsFromFile(@RequestParam String fileName) {
        contactService.loadContactsFromFile(fileName);
        return ResponseEntity.status(HttpStatus.OK).body("Contacts loaded from file successfully");
    }
}
