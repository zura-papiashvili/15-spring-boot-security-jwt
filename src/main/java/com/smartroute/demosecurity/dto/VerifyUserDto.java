package com.smartroute.demosecurity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyUserDto {
    private String verificationCode;

    private String email;
}
