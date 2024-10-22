package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * Create a mock list for my citylist
     * @return list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        assertEquals(0, list.getCount());

        City mockCity = new City("Estevan", "SK");
        assertFalse(list.hasCity(mockCity));

        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
        assertEquals(1, list.getCount());
    }

    @Test
    void testDelete() {
        list = MockCityList();
        assertEquals(0, list.getCount());

        City mockCity = new City("Estevan", "SK");
        list.addCity(mockCity);
        assertEquals(1, list.getCount());
        assertTrue(list.hasCity(mockCity));

        list.delete(mockCity);
        assertEquals(0, list.getCount());
        assertFalse(list.hasCity(mockCity));
    }

    @Test
    void testCount() {
        list = MockCityList();
        assertEquals(0, list.getCount());

        City mockCity = new City("Estevan", "SK");
        list.addCity(mockCity);
        assertEquals(1, list.getCount());
        assertTrue(list.hasCity(mockCity));

        assertEquals(2, list.countCities());
    }
}
