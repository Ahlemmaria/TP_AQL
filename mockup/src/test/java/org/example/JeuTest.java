package org.example;

import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

public class JeuTest {

    @Test
    public void testJeuFerme() {
        // Arrange
        Banque banqueMock = mock(Banque.class);
        Jeu jeu = new Jeu(banqueMock);
        jeu.fermer();

        // Act & Assert
        assertThrows(JeuFermeException.class, () -> jeu.jouer(mock(Joueur.class), mock(De.class), mock(De.class)));
    }

    @Test
    public void testJoueurInsolvable() throws DebitImpossibleException {
        // Arrange
        Banque banqueMock = mock(Banque.class);
        when(banqueMock.est_solvable()).thenReturn(true);

        Jeu jeu = new Jeu(banqueMock);

        Joueur joueurMock = mock(Joueur.class);
        when(joueurMock.mise()).thenReturn(100);
        doThrow(new DebitImpossibleException("Insolvable")).when(joueurMock).debiter(100); // Correction ici

        // Act & Assert
        assertThrows(JeuFermeException.class, () -> jeu.jouer(joueurMock, mock(De.class), mock(De.class)));
        verify(joueurMock).debiter(100);
    }


    @Test
    public void testJoueurGagne() throws DebitImpossibleException, JeuFermeException {
        // Arrange
        Banque banqueMock = mock(Banque.class);
        when(banqueMock.est_solvable()).thenReturn(true);

        Jeu jeu = new Jeu(banqueMock);

        Joueur joueurMock = mock(Joueur.class);
        when(joueurMock.mise()).thenReturn(100);

        De de1Mock = mock(De.class);
        when(de1Mock.lancer()).thenReturn(3);

        De de2Mock = mock(De.class);
        when(de2Mock.lancer()).thenReturn(4);

        // Act
        jeu.jouer(joueurMock, de1Mock, de2Mock);

        // Assert
        verify(joueurMock).crediter(200);
    }

    @Test
    public void testJoueurPerd() throws DebitImpossibleException, JeuFermeException {
        // Arrange
        Banque banqueMock = mock(Banque.class);
        when(banqueMock.est_solvable()).thenReturn(true);

        Jeu jeu = new Jeu(banqueMock);

        Joueur joueurMock = mock(Joueur.class);
        when(joueurMock.mise()).thenReturn(100);

        De de1Mock = mock(De.class);
        when(de1Mock.lancer()).thenReturn(2);

        De de2Mock = mock(De.class);
        when(de2Mock.lancer()).thenReturn(3);

        // Act
        jeu.jouer(joueurMock, de1Mock, de2Mock);

        // Assert
        verify(joueurMock).debiter(100);
    }
}
