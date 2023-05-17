package com.ayoub.avions.dto;
import java.util.Date;
import java.util.List;

import com.ayoub.avions.entities.Company;
import com.ayoub.avions.entities.Image;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AvionDTO {
    private Long idAvions;
    private String nomAvions;
    private Double prixAvions;
    private Date dateCreation;
    private Company company;
    private String nomCom;
    private List<Image> images;
    private String imagePath;
}