package com.ifood.dto;

import com.ifood.domain.Entregador;
import java.util.UUID;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EntregadorDTO {

  private UUID uuid;
  @NotBlank @Email private String mail;
  @NotBlank private String name;

  public static EntregadorDTO of(Entregador entregador) {
    EntregadorDTO dto = new EntregadorDTO();
    dto.mail = entregador.getMail();
    dto.name = entregador.getName();
    dto.uuid = entregador.getId();
    return dto;
  }
}
