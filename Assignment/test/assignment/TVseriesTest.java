
package assignment;

import org.junit.jupiter.api.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TVseriesTest {

    private ArrayList<TVseries> seriesList;

    @BeforeEach
    void setUp() {
        seriesList = new ArrayList<>();
        seriesList.add(new TVseries(1, "Breaking Bad", 18, 62));
        seriesList.add(new TVseries(2, "Stranger Things", 16, 34));
    }

    //Test Search Series
    @Test
    void TestSearchSeries() {
        String searchName = "Breaking Bad";
        TVseries result = null;

        for (TVseries s : seriesList) {
            if (s.getSeriesName().equalsIgnoreCase(searchName)) {
                result = s;
                break;
            }
        }

        assertNotNull(result);
        assertEquals(1, result.getSeriesId());
        assertEquals(18, result.getSeriesAge());
    }

    //Test Search Series if Series Not Found
    @Test
    void TestSearchSeries_SeriesNotFound() {
        String searchName = "Nonexistent Series";
        TVseries result = null;

        for (TVseries s : seriesList) {
            if (s.getSeriesName().equalsIgnoreCase(searchName)) {
                result = s;
                break;
            }
        }

        assertNull(result);
    }

    //Test Update Series
    @Test
    void TestUpdateSeries() {
        int updateId = 1;
        String newName = "Better Call Saul";
        int newAge = 17;
        int newEpisodes = 50;

        for (TVseries s : seriesList) {
            if (s.getSeriesId() == updateId) {
                s.setSeriesName(newName);
                s.setSeriesAge(newAge);
                s.setSeriesNumberOfEpisodes(newEpisodes);
            }
        }

        TVseries updated = null;
        for (TVseries s : seriesList) {
            if (s.getSeriesId() == updateId) {
                updated = s;
            }
        }

        assertNotNull(updated);
        assertEquals("Better Call Saul", updated.getSeriesName());
        assertEquals(17, updated.getSeriesAge());
        assertEquals(50, updated.getSeriesNumberOfEpisodes());
    }

    //Test Delete Series
    @Test
    void TestDeleteSeries() {
        int deleteId = 2;
        boolean removed = seriesList.removeIf(s -> s.getSeriesId() == deleteId);

        assertTrue(removed);
        assertEquals(1, seriesList.size());
    }

    //Test Delete Series For Where Series Not Found
    @Test
    void TestDeleteSeries_SeriesNotFound() {
        int deleteId = 99;
        boolean removed = seriesList.removeIf(s -> s.getSeriesId() == deleteId);

        assertFalse(removed);
        assertEquals(2, seriesList.size());
    }

    //TestSerie Age Restriction If AgeValid()
    @Test
    void TestSeriesAgeRestriction_AgeValid() {
        TVseries s = seriesList.get(0); // Breaking Bad, age 18
        int userAge = 20;

        assertTrue(userAge >= s.getSeriesAge());
    }

    //Test Series Age Restriction If Series Age Invalid
    @Test
    void TestSeriesAgeRestriction_SeriesAgeInvalid() {
        TVseries s = seriesList.get(0); // Breaking Bad, age 18
        int userAge = 16;

        assertFalse(userAge >= s.getSeriesAge());
    }
}