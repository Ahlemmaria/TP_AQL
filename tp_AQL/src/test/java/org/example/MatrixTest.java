package org.example;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;

public class MatrixTest {
    private Matrix matrix1;
    private Matrix matrix2;

    @Before
    public void setUp() {
        matrix1 = new Matrix(3);
        matrix2 = new Matrix(3);
        // Initialiser les valeurs des matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1.set(i, j, i * 3 + j);
                matrix2.set(i, j, i * 3 + j + 1);
            }
        }
    }

    @Test
    public void testAdd() throws Exception {
        Matrix expectedResult = new Matrix(3);
        // Remplir la matrice de résultats attendus
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                expectedResult.set(i, j, 2 * (i * 3 + j) + 1);
            }
        }
        matrix1.add(matrix1); //


        Field field = Matrix.class.getDeclaredField("array");
        field.setAccessible(true);
        int[][] resultArray = (int[][]) field.get(matrix1);

        assertArrayEquals(expectedResult.array, resultArray);
    }

}
