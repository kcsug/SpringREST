package travel.flights;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	List<Flight> findByTraveler(String traveler);
	
}
