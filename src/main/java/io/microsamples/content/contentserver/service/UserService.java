package io.microsamples.content.contentserver.service;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;
import io.microsamples.content.contentserver.view.User;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class UserService {

    private EnhancedRandom random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
            .seed(123L)
            .objectPoolSize(10)
            .randomizationDepth(3)
            .exclude(Float.class)
            .charset(Charset.forName("UTF-8"))
            .stringLengthRange(5, 10)
            .collectionSizeRange(1, 10)
            .scanClasspathForConcreteTypes(false)
            .overrideDefaultInitialization(false)
            .build();

    public List<User> findAllUsers() {

        List<User> users = Collections.nCopies(10, null).stream()
                .map(o -> random.random(User.class))
                .collect(toList());


        return users;
    }
}
