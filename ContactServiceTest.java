///////////////////////////////
//Name: Astrid French        //
//CS 320, Project One        //
//Professor 0mar Toledo      //
//8 April 2024               //
//////////////////////////////


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactServiceTest {


    @Test
    void testAddContactDuplicateIdFail() {
        ContactService contactService= new ContactService();
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        Contact contact2 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        assertTrue(contactService.addContact(contact1));
        assertFalse(contactService.addContact(contact2));
    }

    @Test
    void testAddContactSuccess(){
        ContactService contactService= new ContactService();
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        assertTrue(contactService.addContact(contact1));
    }



    @Test
    void testGetContactAndDeleteWithIDSuccess() {
        // Create an instance of ContactService
        ContactService contactService = new ContactService();
        // Create a contact
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        // Add the contact to the contact service
        assertTrue(contactService.addContact(contact1));
        // Delete the contact using its contactID
        assertTrue(contactService.deleteContact("AstridF"));
    }

    @Test
    void testUpdateContactFirstNameSuccess(){
        ContactService contactService = new ContactService();
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        // Add the contact to the contact service
        assertTrue(contactService.addContact(contact1));
        // Update the firstName using its contact ID
        assertTrue(contactService.updateContactFirstName("AstridF", "Paul"));
    }

    @Test
    void testUpdateContactLastNameSuccess(){
        ContactService contactService = new ContactService();
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        // Add the contact to the contact service
        assertTrue(contactService.addContact(contact1));
        // Update the lastName using its contact ID
        assertTrue(contactService.updateContactLastName("AstridF", "SNHU"));
    }

    @Test
    void testUpdatePhoneNumberSuccess(){
        ContactService contactService = new ContactService();
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        // Add the contact to the contact service
        assertTrue(contactService.addContact(contact1));
        // Update the phoneNumber using its contact ID
        assertTrue(contactService.updateContactPhone("AstridF", "1111111111"));
    }

    @Test
    void testUpdateAddessSuccess(){
        ContactService contactService = new ContactService();
        Contact contact1 = new Contact("AstridF", "Astrid", "French", "5208692224", "9361 N Moon View");
        // Add the contact to the contact service
        assertTrue(contactService.addContact(contact1));
        // Update the address using its contact ID
        assertTrue(contactService.updateContactAddress("AstridF", "8888 South Ln Carolina"));
    }

    }

