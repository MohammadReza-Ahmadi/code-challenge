import java.awt.event.TextListener;
import java.util.*;

public class BookingDotComFlightCodeChallenge {

    public static class Flight{

        public Flight(Long id, String name, String source, String dest, Date flightDate) {
            this.id = id;
            this.name = name;
            this.source = source;
            this.dest = dest;
            this.flightDate = flightDate;
        }

        public Long id;
        public String name;
        public String source;
        public String dest;
        public Date flightDate;

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;

            if (o == null || getClass() != o.getClass())
                return false;

            Flight that = (Flight) o;
            return  (id == null || that.id == null || Objects.equals(id, that.id)) &&
              (name == null || that.name == null || name.equalsIgnoreCase(that.name)) &&
              (source == null || that.source == null || source.equalsIgnoreCase(that.source)) &&
              (dest == null || that.dest == null || dest.equalsIgnoreCase(that.dest)) &&
              (flightDate == null || that.flightDate == null || Objects.equals(flightDate, that.flightDate));
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
            Flight f = new Flight(null, null, source, null, null);
            return mapFlight.get(f);
        }

        public List<Flight> searchBySourceAndDest(String source, String dest){
            if (source == null || source.isEmpty() || dest==null || dest.isEmpty()){
                return new ArrayList<>();
            }

            Flight f = new Flight(null, null, source, dest, null);
            return mapFlight.get(f);
        }
    }


    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(201,2);
        map.put(200,3);
        map.get(201);
/*        Integer key = 10;
        System.out.println("key= "+key);
        int h;
        h = key.hashCode();
        System.out.println("keyHashCode= "+h);
        int a = h >>> 16;
        System.out.println("h >>> 16= "+a);
        int ret = h ^ (h >>> 16);
        System.out.println("ret= "+ret);*/


    }



}
