package com.ifood.service;

import com.ifood.domain.Entregador;
import com.ifood.dto.EntregadorDTO;
import com.ifood.exception.ResourceNotFoundException;
import com.ifood.repository.EntregadorRepository;
import java.util.UUID;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EntregadorService {

  private final EntregadorRepository repository;

  public void create(@Valid EntregadorDTO dto) {
    var entregador = Entregador.builder().mail(dto.getMail()).name(dto.getName()).build();
    repository.save(entregador);

    log.info("customer has been created id {}", entregador.getId());
  }

  public EntregadorDTO get(UUID id) {
    var entityOpt = repository.findById(id);
    var entregador =
        entityOpt.orElseThrow(
            () -> new ResourceNotFoundException("Não foi encontrado o entregador"));

    return EntregadorDTO.of(entregador);
  }

  public void delete(UUID id) {
    var exists = repository.existsById(id);

    if (exists) {
      throw new ResourceNotFoundException("Não foi encontrado o entregador");
    }

    repository.deleteById(id);
  }

  public void update(UUID id, EntregadorDTO request) {
    var entityOpt = repository.findById(id);
    var entregador =
        entityOpt.orElseThrow(
            () -> new ResourceNotFoundException("Não foi encontrado o entregador"));

    entregador.updateInfo(request.getName(), request.getMail());

    repository.save(entregador);
  }
}
