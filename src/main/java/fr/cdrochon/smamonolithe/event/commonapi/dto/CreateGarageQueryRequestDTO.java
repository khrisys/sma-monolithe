package fr.cdrochon.smamonolithe.event.commonapi.dto;

import fr.cdrochon.smamonolithe.event.commonapi.enums.GarageStatus;
import lombok.*;

import java.time.Instant;

/**
 * permet de faire le lien entre les services command (et query ??) de l'appli et le monde exteieur
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CreateGarageQueryRequestDTO {
//    private String id;
    private String nomClient;
    private String mailResponsable;
//    private GarageStatus garageStatus;
//    private Instant dateQuery;
}
