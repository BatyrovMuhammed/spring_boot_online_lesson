package legensoft.spring_boot_online_lesson.api;

import legensoft.spring_boot_online_lesson.model.House;
import legensoft.spring_boot_online_lesson.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class HouseController {

    private final HouseService houseService;
//    private final CommentService commentService;

    @GetMapping("/allHouses")
    private String getAllHouse(Model model){
        model.addAttribute("allHouses", houseService.getAllHouses());
        return "mainPage";
    }
    @GetMapping("/getHouse/{houseId}")
    private String getHouseById(@PathVariable("houseId") Long id, Model model){
        model.addAttribute("house", houseService.getByIdHouse(id));
//        model.addAttribute("comments", commentService.getCommentByHouseId(id));
        return "innerPage";
    }
    @GetMapping("/new")
    private String  newHouse(Model model){
        model.addAttribute("newHouse", new House());
        return "newHouse";
    }
    @PostMapping("/save")
    private String saveHouse(@ModelAttribute("newHouse") House house){
        houseService.saveHouse(house);
        return "redirect:/allHouses";
    }
}
