package com.example.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
public class User {

    @Getter
    private String name;
}
