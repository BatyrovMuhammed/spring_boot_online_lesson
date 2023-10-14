package legensoft.spring_boot_online_lesson.repository;

import legensoft.spring_boot_online_lesson.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {




}
