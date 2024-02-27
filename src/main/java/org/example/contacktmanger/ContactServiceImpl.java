package org.example.contacktmanger;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    @Override
    public void saveContactsToFile(String fileName) {
        // Логіка для збереження контактів у файл JSON
    }

    @Override
    public void loadContactsFromFile(String fileName) {
        // Логіка для завантаження контактів з файлу JSON
    }
}
