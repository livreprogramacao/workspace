package com.javacodegeeks.mockitotutorial2.custormer.dao;

import com.javacodegeeks.mockitotutorial2.custormer.entity.Customer;
import java.util.Optional;
import javax.persistence.EntityManager;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerDAOTest {

    private CustomerDAO dao;

    @Mock
    private EntityManager mockEntityManager;

    @Before
    public void setUp() throws Exception {
        dao = new CustomerDAO(mockEntityManager);
    }

    @Test
    public void finding_existing_customer_should_return_customer() throws Exception {
        // Given
        long expectedId = 10;
        String expectedName = "John Doe";
        String expectedAddress = "21 Main Street";
        Customer expectedCustomer = new Customer(expectedId, expectedName, expectedAddress);

        when(mockEntityManager.find(Customer.class, expectedId)).thenReturn(expectedCustomer);

        // When
        Optional<Customer> actualCustomer = dao.findById(expectedId);

        // Then
        assertTrue(actualCustomer.isPresent());
        assertEquals(expectedId, actualCustomer.get().getId());
        assertEquals(expectedName, actualCustomer.get().getName());
        assertEquals(expectedAddress, actualCustomer.get().getAddress());
    }

    @Test
    public void invoking_mock_with_unexpected_argument_returns_null() throws Exception {
        // Given
        long expectedId = 10L;
        long unexpectedId = 20L;
        String expectedName = "John Doe";
        String expectedAddress = "21 Main Street";
        Customer expectedCustomer = new Customer(expectedId, expectedName, expectedAddress);

        when(mockEntityManager.find(Customer.class, expectedId)).thenReturn(expectedCustomer);

        // When
        Optional<Customer> actualCustomer = dao.findById(unexpectedId);

        // Then
        assertFalse(actualCustomer.isPresent());
    }

    @Test
    public void invoking_mock_with_different_argument_returns_different_customers() throws Exception {
        // Given
        long expectedId1 = 10L;
        String expectedName1 = "John Doe";
        String expectedAddress1 = "21 Main Street";
        Customer expectedCustomer1 = new Customer(expectedId1, expectedName1, expectedAddress1);

        long expectedId2 = 20L;
        String expectedName2 = "Jane Deer";
        String expectedAddress2 = "46 High Street";
        Customer expectedCustomer2 = new Customer(expectedId2, expectedName2, expectedAddress2);

        when(mockEntityManager.find(Customer.class, expectedId1)).thenReturn(expectedCustomer1);
        when(mockEntityManager.find(Customer.class, expectedId2)).thenReturn(expectedCustomer2);

        // When
        Optional<Customer> actualCustomer1 = dao.findById(expectedId1);
        Optional<Customer> actualCustomer2 = dao.findById(expectedId2);

        // Then
        assertEquals(expectedName1, actualCustomer1.get().getName());
        assertEquals(expectedName2, actualCustomer2.get().getName());
    }

    @Test
    public void invoking_mock_with_chained_stubs_returns_different_customers() throws Exception {
        // Given
        long expectedId1 = 10L;
        String expectedName1 = "John Doe";
        String expectedAddress1 = "21 Main Street";
        Customer expectedCustomer1 = new Customer(expectedId1, expectedName1, expectedAddress1);

        long expectedId2 = 20L;
        String expectedName2 = "Jane Deer";
        String expectedAddress2 = "46 High Street";
        Customer expectedCustomer2 = new Customer(expectedId2, expectedName2, expectedAddress2);

        when(mockEntityManager.find(Customer.class, expectedId1))
                .thenReturn(expectedCustomer1).thenReturn(expectedCustomer2);

        // When
        Optional<Customer> actualCustomer1 = dao.findById(expectedId1);
        Optional<Customer> actualCustomer2 = dao.findById(expectedId1);

        // Then
        assertEquals(expectedName1, actualCustomer1.get().getName());
        assertEquals(expectedName2, actualCustomer2.get().getName());
    }

}
