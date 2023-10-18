package com.devsuperior.userrequestsb.writer;

import com.devsuperior.userrequestsb.dto.UserDTO;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertUserDataDBWriterConfig {

    @Bean
    public ItemWriter<UserDTO> insertUserDataDBWriter() {

        return users -> users.forEach(System.out::println);
    }
}