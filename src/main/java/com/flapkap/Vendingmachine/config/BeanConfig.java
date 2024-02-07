package com.flapkap.Vendingmachine.config;

import com.flapkap.Vendingmachine.model.User;
import com.flapkap.Vendingmachine.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Configuration
public class BeanConfig {


        private final UserRepository userRepository;

        public BeanConfig(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

//        @Bean
//        CommandLineRunner commandLineRunner(
//                UserRepository repository
//        ){
//            return args -> {
//                User mariam= new User(
//                        "felix",
//                        "loophole",
//                        10,
//                        1
//
//
//                );
//
//                repository.save(mariam);
//            };
//        }
//        public UserDetailsService userDetailsService(){
//            return username -> userRepository.findByUsername(username)
//                    .orElseThrow(()-> new UsernameNotFoundException("User not found"));
//        }
//    }

}
