package com.ifood.api;

import com.ifood.dto.EntregadorDTO;
import com.ifood.service.EntregadorService;
import java.util.UUID;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/entregadorers")
public class EntregadorController {

  private final EntregadorService service;

  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public void create(@Valid @RequestBody EntregadorDTO request) {
    service.create(request);
  }

  @DeleteMapping("/{entregadorId}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable UUID entregadorId) {
    service.delete(entregadorId);
  }

  @PutMapping(
      path = "/{entregadorId}",
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public void update(@Valid @RequestBody EntregadorDTO request, @PathVariable UUID entregadorId) {
    service.update(entregadorId, request);
  }

  @GetMapping(path = "{customerId}/", produces = MediaType.APPLICATION_JSON_VALUE)
  public EntregadorDTO find(@PathVariable UUID customerId) {
    return service.get(customerId);
  }
}
