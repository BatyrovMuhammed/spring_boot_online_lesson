package legensoft.spring_boot_online_lesson.service.impl;

import legensoft.spring_boot_online_lesson.model.House;
import legensoft.spring_boot_online_lesson.repository.HouseRepository;
import legensoft.spring_boot_online_lesson.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    @Override
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    @Override
    public House getByIdHouse(Long id) {
        return houseRepository.findById(id).get();
    }

    @Override
    public void saveHouse(House house) {
     houseRepository.save(house);
    }
}
