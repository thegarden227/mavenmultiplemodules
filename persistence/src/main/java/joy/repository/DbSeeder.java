package joy.repository;

import joy.domain.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class DbSeeder implements CommandLineRunner {


    private HotelRepository hotelRepository;

    public DbSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Hotel marriot = new Hotel("Marriot" , true, 5);
        Hotel ibis = new Hotel("iBis", true, 5);
        Hotel goldenTulip = new Hotel("Golden Tulip", false, 5);

        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(marriot);
        hotelList.add(ibis);
        hotelList.add(goldenTulip);

        hotelRepository.saveAll(hotelList);
    }
}
