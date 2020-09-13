package com.myohanhtet.mypostalcode.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "postal_code")
public class PostalCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "State_Region")
    private String stateRegion;

    @Column(name = "State_Region_Mya")
    private String stateReqionMya;

    @Column(name = "SR_Pcode")
    private String srPCode;

    @Column(name = "District")
    private String district;

    @Column(name = "District_Mya")
    private String districtMya;

    @Column(name = "D_Pcode")
    private String DPcode;

    @Column(name = "Township")
    private String township;

    @Column(name = "Township_Mya")
    private String townshipMya;

    @Column(name = "TS_Pcode")
    private String tSPcode;

    @Column(name = "Place")
    private String place;

    @Column(name = "Postcode")
    private String postCode;

    @Column(name = "Remark")
    private String remark;

    public PostalCode(){

    }

    public PostalCode(String stateRegion, String stateReqionMya, String srPCode, String district, String districtMya, String DPcode, String township, String townshipMya, String tSPcode, String place, String postCode, String remark) {
        this.stateRegion = stateRegion;
        this.stateReqionMya = stateReqionMya;
        this.srPCode = srPCode;
        this.district = district;
        this.districtMya = districtMya;
        this.DPcode = DPcode;
        this.township = township;
        this.townshipMya = townshipMya;
        this.tSPcode = tSPcode;
        this.place = place;
        this.postCode = postCode;
        this.remark = remark;
    }
}
