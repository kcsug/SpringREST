package travel.flights;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightsController {

	private FlightRepository flightRepository;

	@Autowired
	public FlightsController(FlightRepository flightRepository) {
		this.flightRepository = flightRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@PreAuthorize("#oauth2.hasScope('read')")
	public List<Flight> flights(Principal principal) {
		return flightRepository.findByTraveler(principal.getName());
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@PreAuthorize("#oauth2.hasScope('write')")
	public Flight addFlight(@RequestBody Flight flight, Principal principal) {
		flight.setTraveler(principal.getName());
		return flightRepository.save(flight);
	}
	
}
