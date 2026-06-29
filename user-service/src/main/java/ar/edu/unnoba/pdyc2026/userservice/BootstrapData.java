package ar.edu.unnoba.pdyc2026.userservice;

import ar.edu.unnoba.pdyc2026.userservice.model.User;
import ar.edu.unnoba.pdyc2026.userservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final UserRepository userRepository;

    public BootstrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            userRepository.save(new User("alice", "Alice Santos"));
            userRepository.save(new User("bob", "Bob Díaz"));
        }
    }
}
