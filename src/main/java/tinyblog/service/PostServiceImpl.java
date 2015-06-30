package tinyblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tinyblog.model.entity.Post;
import tinyblog.repository.PostRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service("postService")
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    @Transactional
    public void delete(Post post) {
        postRepository.delete(post);
    }
}
