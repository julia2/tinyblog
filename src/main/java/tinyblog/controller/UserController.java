package tinyblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tinyblog.model.entity.User;
import tinyblog.service.UserService;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    // GET /User/{Name}
    public String userInfo(String name) {
        return null;
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        User user = new User();

        model.addAttribute("user", user);

        return "/registrationForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String reqisterUser(@ModelAttribute("user") User user) throws Exception {
        userService.add(user);

        return "redirect:/";
    }
}
