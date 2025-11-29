package git.jogindermikael.SpringSecExa.service;

import git.jogindermikael.SpringSecExa.model.Users;
import git.jogindermikael.SpringSecExa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    public Users registerUser(Users user) {
        return repo.save(user);
    }
}
