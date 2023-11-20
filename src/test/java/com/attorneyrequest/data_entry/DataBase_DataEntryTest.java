package com.attorneyrequest.data_entry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Samnang Thorn
 */
class DataBase_DataEntryTest {

    @Test
    void testGetCounter() {
        // given
        DataBase_DataEntry.resetDataBase();
        DataBase_DataEntry.firstName = "Reap";
        DataBase_DataEntry.lastName = "Milk";
        // then
        assertEquals(9, DataBase_DataEntry.getCounter());
    }

    @Test
    void testResetDataBase() {
        // given
        DataBase_DataEntry.firstName = "Reap";
        DataBase_DataEntry.lastName = "Milk";
        // when
        DataBase_DataEntry.resetDataBase();
        // then
        assertEquals("", DataBase_DataEntry.firstName);
        assertEquals("", DataBase_DataEntry.lastName);
    }
}
