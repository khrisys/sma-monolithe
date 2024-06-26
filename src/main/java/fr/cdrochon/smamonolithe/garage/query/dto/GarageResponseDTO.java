package fr.cdrochon.smamonolithe.garage.query.dto;

import fr.cdrochon.smamonolithe.garage.command.enums.GarageStatus;
import fr.cdrochon.smamonolithe.garage.query.entities.AdresseGarage;
import lombok.*;

import javax.persistence.Embedded;

@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class GarageResponseDTO {
    private String id;
    private String nomGarage;
    private String mailResp;
    private GarageAdresseDTO adresse;
    private GarageStatus garageStatus;
}
