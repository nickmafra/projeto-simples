package com.nickmafra.projetosimples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    private static final String STATUS_OK = "Aplicação no ar.";

    @GetMapping
    public String getStatus() {
        return STATUS_OK;
    }
}
