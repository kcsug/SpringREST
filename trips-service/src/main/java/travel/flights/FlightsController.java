package travel.flights;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Flight> flights() {
		return flightRepository.findAll();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Flight flightById(@PathVariable("id") Long id) {
		return flightRepository.findOne(id);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void deleteFlight(@PathVariable("id") Long id) {
		flightRepository.delete(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Flight addFlight(@RequestBody Flight flight) {
		flight.setTraveler("anonymous");
		return flightRepository.save(flight);
	}
	
}
