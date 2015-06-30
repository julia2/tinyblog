package tinyblog.controller;

import org.hibernate.metamodel.source.annotations.xml.mocker.MockHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tinyblog.model.entity.Post;
import tinyblog.service.PostService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PostController {

    @Resource(name = "postService")
    private PostService postService;

    // Возвращает все посты
    // GET /
    // GET /Post/All/
    @RequestMapping(value = {"/", "/post/all"}, method = RequestMethod.GET)
    public String index(Model model) {

        List<Post> posts = postService.getAll();

        model.addAttribute("posts", posts);

        return "index";
    }

    // Показывает определенный пост с комментариями
    // GET /Post/{id}/
    public String Index(int id) {
        return null;
    }

    // GET /Post/All/{userName}
    public String UserPosts(String Name) {
        return null;
    }

    @RequestMapping(value = "/post/add", method = RequestMethod.GET)
    public String addNew(Model model) {
        model.addAttribute("post", new Post());

        return "addNewPost";
    }

    @RequestMapping(value = "/post/add", method = RequestMethod.POST)
    public String addNew(Post post) {

        //все посты пока создает пользователь User c id = 1
        post.setAuthorId(1L);

        postService.save(post);

        return "redirect:/";
    }
}
