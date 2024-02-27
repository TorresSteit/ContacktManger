package org.example.contacktmanger;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    void addContact(Contact contact);
    void deleteContact(Contact contact);
    void saveContactsToFile(String fileName);
    void loadContactsFromFile(String fileName);
}
