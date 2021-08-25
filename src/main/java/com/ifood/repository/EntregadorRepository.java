package com.ifood.repository;

import com.ifood.domain.Entregador;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface EntregadorRepository extends CrudRepository<Entregador, UUID> {

  boolean existsByMail(String mail);

  boolean existsByMailAndIdNot(String mail, UUID uuid);
}
