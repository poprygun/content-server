package io.microsamples.content.contentserver.view;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String jobTitle;
    private String company;
    private String address;
    private String city;
    private String country;
    private String phoneNumber;
    private float[] columnCount = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

}
