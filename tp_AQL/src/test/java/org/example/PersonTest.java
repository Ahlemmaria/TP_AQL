package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testGetFullName() {
        Person person = new Person("abc", "cba", 25);
        assertEquals("abc cbga", person.getFullName());
    }

    // Personne majeure
    @Test
    public void testIsAdult() {

        Person adultPerson = new Person("azert", "az", 30);
        assertTrue(adultPerson.isAdult());
    }

    @Test
    // Personne mineure
    public void testIsNotAdult() {

        Person minorPerson = new Person("azrt", "azert", 17);
        assertFalse(minorPerson.isAdult());
    }
}



