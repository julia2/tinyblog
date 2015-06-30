package tinyblog.service;

import tinyblog.model.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAll();

    void save(Post post);

    void delete(Post post);
}
