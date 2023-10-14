package legensoft.spring_boot_online_lesson.service;

import legensoft.spring_boot_online_lesson.model.House;

import java.util.List;

public interface HouseService {

    List<House> getAllHouses();

    House getByIdHouse(Long id);

    void saveHouse(House house);


}
