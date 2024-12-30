package com.gitpod.SpringbootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MyClass {

    @GetMapping("posts")
    public List<Post> getPosts() {
        return Arrays.asList(
                new Post(1, 1, "sunt aut facere repellat ",
                        "quia et suscipit\nsuscipit recusandae consequuntur expedita et "),
                new Post(1, 2, "qui est esse",
                        "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor"),
                new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                        "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus")
        );
    }

    @GetMapping("users")
    public List<User> getUsers() {
        return Arrays.asList(
                new User() {{
                    setId(1);
                    setName("Leanne Graham");
                    setUsername("Bret");
                    setEmail("Sincere@april.biz");
                    setStreet("Kulas Light");
                    setSuite("Apt. 556");
                    setCity("Hongkong");
                    setZipcode("92998-3874");
                }},
                new User() {{
                    setId(2);
                    setName("Ervin Howell");
                    setUsername("Antonette");
                    setEmail("Shanna@melissa.tv");
                    setStreet("Victor Plains");
                    setSuite("Suite 879");
                    setCity("Mumbai");
                    setZipcode("90566-7771");
                }},
                new User() {{
                    setId(3);
                    setName("Clementine Bauch");
                    setUsername("Samantha");
                    setEmail("Nathan@yesenia.net");
                    setStreet("Douglas Extension");
                    setSuite("Suite 847");
                    setCity("Singapore");
                    setZipcode("59590-4157");
                }}
        );
    }
}
