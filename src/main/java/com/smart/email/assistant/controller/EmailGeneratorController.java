package com.smart.email.assistant.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.smart.email.assistant.dto.EmailRequest;
import com.smart.email.assistant.service.EmailGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/email")
@RequiredArgsConstructor
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;


    @PostMapping("generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) throws JsonProcessingException {
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }

}
