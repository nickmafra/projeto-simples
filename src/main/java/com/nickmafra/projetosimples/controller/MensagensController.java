package com.nickmafra.projetosimples.controller;

import com.nickmafra.projetosimples.dto.MensagemDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensagens")
public class MensagensController {

    private static final List<MensagemDto> MENSAGENS = new ArrayList<>(Arrays.asList(
            new MensagemDto(1, "Nicolas Mafra", "Mensagem inicial",
                    "Olá pessoal, sejam bem vindos a este projeto simples de Spring Boot.",
                    LocalDateTime.of(2021, 5, 1, 22, 25, 0)),
            new MensagemDto(2, "Fulano da Silva", "Teste",
                    "Esta é uma mensagem de teste.",
                    LocalDateTime.of(1970, 12, 31, 23, 59, 59)),
            new MensagemDto(3, "Jogador de Warzone", "A NASA destruiu o mundo!",
                    "Estou falando do futuro, onde o mundo foi devastado por acidente.",
                    LocalDateTime.of(2100, 1, 1, 22, 0, 0))
    ));

    @GetMapping
    public List<MensagemDto> getList(String filtro) {
        if (filtro == null) {
            return MENSAGENS;
        } else {
            return MENSAGENS.stream()
                    .filter(m -> m.getTitulo().toUpperCase().contains(filtro.toUpperCase())
                            || m.getConteudo().toUpperCase().contains(filtro.toUpperCase()))
                    .collect(Collectors.toList());
        }
    }

    @GetMapping("/{id}")
    public MensagemDto getById(@PathVariable Integer id) {
        return MENSAGENS.stream()
                .filter(m -> Objects.equals(id, m.getId()))
                .findAny().orElse(null);
    }

    @PostMapping
    public MensagemDto post(@RequestBody MensagemDto mensagemDto) {
        if (mensagemDto.getTitulo() == null || mensagemDto.getNomeAutor() == null)
            throw new IllegalArgumentException();

        synchronized (MENSAGENS) {
            mensagemDto.setId(maiorId() + 1);
            mensagemDto.setDataPostagem(LocalDateTime.now());
            MENSAGENS.add(mensagemDto);
            return mensagemDto;
        }
    }

    private Integer maiorId() {
        return MENSAGENS.stream()
                .mapToInt(MensagemDto::getId)
                .max().orElse(0);
    }
}
