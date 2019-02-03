package joy.web;

import joy.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import joy.repository.HotelRepository;

import java.util.List;

@RestController
public class HotelController {

@Autowired
    private HotelRepository hotelRepository;

    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public List<Hotel> retreiveAllHotels(){

        List<Hotel> hotelList = hotelRepository.findAll();

        ResponseEntity<List<Hotel>> responseEntity = new ResponseEntity<>(hotelList, null, HttpStatus.OK);

        return hotelList;

    }

}
