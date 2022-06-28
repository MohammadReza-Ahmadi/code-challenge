import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookingDotComFlightCodeChallengeTest {

    @Test
    public void test1(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","SA","DA", null),
                new BookingDotComFlightCodeChallenge.Flight(2L,"F2","SB","DB", null)
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        Assertions.assertEquals(1,search.searchBySource("SA").size());
    }

    @Test
    public void test2(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","SA","DA", null),
                new BookingDotComFlightCodeChallenge.Flight(2L,"F2","SA","DB", null)
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        Assertions.assertEquals(2,search.searchBySource("SA").size());
    }

    @Test
    public void testSearchByFlightKey1(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","S1","D1", null),
                new BookingDotComFlightCodeChallenge.Flight(2L,"F2","S2","D2", null)
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        List<BookingDotComFlightCodeChallenge.Flight> actual = search.searchBySourceAndDest("S1", "D1");
        Assertions.assertEquals(1,actual.size());
        Assertions.assertEquals(1,actual.get(0).id);
        Assertions.assertEquals("S1",actual.get(0).source);
        Assertions.assertEquals("D1",actual.get(0).dest);
    }

    @Test
    public void testSearchByFlightKey2(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","S2","D1", null),
                new BookingDotComFlightCodeChallenge.Flight(2L,"F2","S2","D2", null)
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        List<BookingDotComFlightCodeChallenge.Flight> actual = search.searchBySource( "S2");
        Assertions.assertEquals(2,actual.size());
    }

    @Test
    public void testSearchBySourceAndDest1(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","S1","D1", null),
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","S1","D2", null)
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        List<BookingDotComFlightCodeChallenge.Flight> actual = search.searchBySourceAndDest( "S1","D1");
        Assertions.assertEquals(1,actual.size());
        Assertions.assertEquals(1,actual.get(0).id);
        Assertions.assertEquals("S1",actual.get(0).source);
        Assertions.assertEquals("D1",actual.get(0).dest);
    }

//    @Test
    public void testSearchBySource1(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","S1","D1", null),
                new BookingDotComFlightCodeChallenge.Flight(1L,"F1","S1","D2", null)
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        List<BookingDotComFlightCodeChallenge.Flight> actual = search.searchBySource( "S1");
        Assertions.assertEquals(2,actual.size());
    }

}