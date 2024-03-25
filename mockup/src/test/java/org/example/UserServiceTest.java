package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;

    @Captor
    private ArgumentCaptor<Utilisateur> utilisateurArgumentCaptor;
//exercice2
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du comportement du mock
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'appel à l'API
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);
    }
//exercice3
    @Test
    public void testCreerUtilisateur_Exception() throws ServiceException {
        // Configuration du comportement du mock pour lever une exception
        doThrow(new ServiceException("Echec de la création de l'utilisateur")).when(utilisateurApiMock).creerUtilisateur(any(Utilisateur.class));

        UserService userService = new UserService(utilisateurApiMock);
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Vérification que l'exception ServiceException est bien levée et que son message est correct
            assert e.getMessage() != null && e.getMessage().equals("Echec de la création de l'utilisateur");
        }
    }

    @Test
    public void testCreerUtilisateur_Validation_Error() throws ServiceException {
        // Configuration du comportement du mock pour lancer une exception lors de la validation
        doThrow(new ServiceException("Erreur de validation")).when(utilisateurApiMock).creerUtilisateur(any(Utilisateur.class));

        UserService userService = new UserService(utilisateurApiMock);
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Vérification que l'exception ValidationException est bien levée et que son message est correct
            assert e.getMessage() != null && e.getMessage().equals("Erreur de validation");
            // Vérification que la méthode creerUtilisateur n'a jamais été appelée
            verify(utilisateurApiMock, never()).creerUtilisateur(utilisateur);
        }
    }

    @Test
    public void testCreerUtilisateur_ID_After_Creation() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Configuration du mock pour renvoyer un ID après la création
        int idUtilisateur = 123;
        doAnswer(invocation -> {
            Utilisateur capturedUtilisateur = invocation.getArgument(0);
            capturedUtilisateur.setId(idUtilisateur);
            return null;
        }).when(utilisateurApiMock).creerUtilisateur(utilisateur);

        // Appel de la méthode à tester
        UserService userService = new UserService(utilisateurApiMock);
        userService.creerUtilisateur(utilisateur);

        // Vérification de l'ID de l'utilisateur après l'envoi à l'API
        assert utilisateur.getId() == idUtilisateur;
    }

    @Test
    public void testCreerUtilisateur_Arguments_Captured() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Capture des arguments passés à la méthode creerUtilisateur du mock
        ArgumentCaptor<Utilisateur> argumentCaptor = ArgumentCaptor.forClass(Utilisateur.class);

        // Mock du comportement de la méthode creerUtilisateur pour retourner true
        doNothing().when(utilisateurApiMock).creerUtilisateur(any(Utilisateur.class));

        // Appel de la méthode à tester
        UserService userService = new UserService(utilisateurApiMock);
        userService.creerUtilisateur(utilisateur);

        // Capture de l'argument
        verify(utilisateurApiMock).creerUtilisateur(argumentCaptor.capture());
        Utilisateur utilisateurCapture = argumentCaptor.getValue();

        // Vérification des arguments capturés
        assert utilisateurCapture.getNom().equals(utilisateur.getNom());
        assert utilisateurCapture.getPrenom().equals(utilisateur.getPrenom());
        assert utilisateurCapture.getEmail().equals(utilisateur.getEmail());
    }
}
