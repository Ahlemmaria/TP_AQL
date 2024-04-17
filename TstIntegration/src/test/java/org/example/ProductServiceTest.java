package org.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {
    private ProductService productService;
    private ProductApiClient productApiClientMock;

    @BeforeEach
    public void setUp() {
        productApiClientMock = mock(ProductApiClient.class);
        productService = new ProductService(productApiClientMock);
    }

    @Test
    public void testGetProduct_Success() {
        // Définir le comportement du mock pour un scénario de récupération réussie
        String productId = "123";
        Product expectedProduct = new Product(productId, "Product Name", 10.0);
        when(productApiClientMock.getProduct(productId)).thenReturn(expectedProduct);

        // Appeler la méthode à tester
        Product actualProduct = productService.getProduct(productId);

        // Vérifier que la méthode du mock a été appelée avec le bon argument
        verify(productApiClientMock).getProduct(productId);

        // Vérifier que la méthode renvoie le bon produit
        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void testGetProduct_IncompatibleDataFormat() {
        // Définir le comportement du mock pour un scénario de format de données incompatible
        String productId = "456";
        when(productApiClientMock.getProduct(productId)).thenThrow(new IncompatibleDataFormatException());

        // Appeler la méthode à tester
        assertThrows(IncompatibleDataFormatException.class, () -> productService.getProduct(productId));
    }

    @Test
    public void testGetProduct_ApiCallFailed() {
        // Définir le comportement du mock pour un scénario d'échec de l'appel API
        String productId = "789";
        when(productApiClientMock.getProduct(productId)).thenThrow(new ApiCallFailedException());

        // Appeler la méthode à tester
        assertThrows(ApiCallFailedException.class, () -> productService.getProduct(productId));
    }
}
