import java.awt.event.TextListener;
import java.util.*;

public class BookingDotComFlightCodeChallenge {

    public static class Flight{

        public Flight(long id, String name, String source, String dest) {
            this.id = id;
            this.name = name;
            this.source = source;
            this.dest = dest;
        }

        public long id;
        public String name;
        public String source;
        public String dest;

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;

            if (o == null || getClass() != o.getClass())
                return false;

            Flight flight = (Flight) o;
            return id == flight.id &&
                    Objects.equals(name, flight.name) &&
                    Objects.equals(source, flight.source) &&
                    Objects.equals(dest, flight.dest);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, source, dest);
        }
    }

    static class FlightSearch{

        Map<String, List<Flight>> map = new HashMap<>();
        Map<Flight, List<Flight>> mapFlight = new HashMap<>();

        public FlightSearch(List<Flight> flights) {
            if (flights == null || flights.isEmpty()){
                return;
            }

            for (Flight f: flights){
                if (map.get(f.source) != null){
                    map.get(f.source).add(f);
                } else {
                    List<Flight> fs = new ArrayList<>();
                    fs.add(f);
                    map.put(f.source,fs);
                }


                if (mapFlight.get(f) != null){
                    mapFlight.get(f).add(f);
                } else {
                    List<Flight> fs = new ArrayList<>();
                    fs.add(f);
                    mapFlight.put(f,fs);
                }
            }
        }

        public List<Flight> searchBySource(String source){
            if (source == null || source.isEmpty() || map.get(source)==null){
                return new ArrayList<>();
            }
            return map.get(source);
        }

        public List<Flight> searchBySourceAndDest(String source, String dest){
            if (source == null || source.isEmpty() || dest==null || dest.isEmpty()){
                return new ArrayList<>();
            }

            Flight f = new Flight(1, "F1", source, dest);
            return mapFlight.get(f);
        }
    }




}
