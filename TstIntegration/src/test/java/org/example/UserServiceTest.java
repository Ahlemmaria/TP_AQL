package org.example;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
    private UserService userService;
    private UserRepository userRepositoryMock;

    @Before
    public void setUp() {
        userRepositoryMock = mock(UserRepository.class);
        userService = new UserService(userRepositoryMock);
    }

    @Test
    public void testGetUserById() {
        long userId = 2024L;
        User expectedUser = new User(userId, "Nom Prenom");

        // Définir le comportement attendu du mock
        when(userRepositoryMock.findUserById(userId)).thenReturn(expectedUser);

        // Appeler la méthode à tester
        User actualUser = userService.getUserById(userId);

        // Vérifier que la méthode du mock a été appelée avec le bon argument
        verify(userRepositoryMock).findUserById(userId);

        // Vérifier que la méthode renvoie le bon utilisateur
        assertSame(expectedUser, actualUser);
    }
}
