import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookingDotComFlightCodeChallengeTest {

    @Test
    public void test1(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1,"F1","SA","DA"),
                new BookingDotComFlightCodeChallenge.Flight(2,"F2","SB","DB")
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        Assertions.assertEquals(1,search.searchBySource("SA").size());
    }

    @Test
    public void test2(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1,"F1","SA","DA"),
                new BookingDotComFlightCodeChallenge.Flight(2,"F2","SA","DB")
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        Assertions.assertEquals(2,search.searchBySource("SA").size());
    }

    @Test
    public void testByObjectKey(){
        List<BookingDotComFlightCodeChallenge.Flight> flights = List.of(
                new BookingDotComFlightCodeChallenge.Flight(1,"F1","S1","D1"),
                new BookingDotComFlightCodeChallenge.Flight(1,"F2","S2","D2")
        );

        BookingDotComFlightCodeChallenge.FlightSearch search = new BookingDotComFlightCodeChallenge.FlightSearch(flights);
        Assertions.assertEquals(1,search.searchBySourceAndDest("S1","D1").size());
    }

}