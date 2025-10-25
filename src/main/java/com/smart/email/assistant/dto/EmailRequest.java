package com.smart.email.assistant.dto;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class EmailRequest {

    private String emailContent;
    private String tone;
}
