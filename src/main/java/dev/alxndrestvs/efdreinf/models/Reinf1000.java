package dev.alxndrestvs.efdreinf.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "reinf_1000")
@NoArgsConstructor
@Data
public class Reinf1000 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String iniValid;
    private String fimValid;
    @NotBlank
    private String classTrib;
    @NotNull
    private Integer indEscrituracao;
    @NotNull
    private Integer indDesoneracao;
    @NotNull
    private Integer indAcordoIsenMulta;
    private Integer indSitPJ;
    private Integer indUniao;
    private Date dtTransfFinsLucr;
    private Date dtObito;
    private String nmCtt;
    private String cpfCtt;
    private String foneFixo;
    private String foneCel;
    private String email;
    private String ideEFR;
    private String cnpjEFR;

}
