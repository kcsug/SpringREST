package travel.flights;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Override
	@PreAuthorize("#oauth2.hasScope('read')")
	List<Flight> findAll();
	
	// TODO: How to get the authorizing user's name passed as the traveler parameter???
	@PreAuthorize("#oauth2.hasScope('read')")
	List<Flight> findByTraveler(@Param(value="traveler") String traveler);
	
}
