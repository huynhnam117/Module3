package model;

public class Facility {
    private int FacilityId;
    private String FacilityName;
    private int FacilityArea;
    private double FacilityCost;
    private int FacilityMax_peopel;
    private int FacilityRen_type_id;
    private int FacilityFacility_type_id;
    private String FacilityStandar_room;
    private String FacilityDescription_other_convenience;
    private double FacilityPool_area;
    private int FacilityNumber_of_floors;
    private String Facility_free;

    public Facility() {
    }

    public Facility(int facilityId, String facilityName, int facilityArea, double facilityCost, int facilityMax_peopel, int facilityRen_type_id, int facilityFacility_type_id, String facilityStandar_room, String facilityDescription_other_convenience, double facilityPool_area, int facilityNumber_of_floors, String facility_free) {
        FacilityId = facilityId;
        FacilityName = facilityName;
        FacilityArea = facilityArea;
        FacilityCost = facilityCost;
        FacilityMax_peopel = facilityMax_peopel;
        FacilityRen_type_id = facilityRen_type_id;
        FacilityFacility_type_id = facilityFacility_type_id;
        FacilityStandar_room = facilityStandar_room;
        FacilityDescription_other_convenience = facilityDescription_other_convenience;
        FacilityPool_area = facilityPool_area;
        FacilityNumber_of_floors = facilityNumber_of_floors;
        Facility_free = facility_free;
    }

    public int getFacilityId() {
        return FacilityId;
    }

    public void setFacilityId(int facilityId) {
        FacilityId = facilityId;
    }

    public String getFacilityName() {
        return FacilityName;
    }

    public void setFacilityName(String facilityName) {
        FacilityName = facilityName;
    }

    public int getFacilityArea() {
        return FacilityArea;
    }

    public void setFacilityArea(int facilityArea) {
        FacilityArea = facilityArea;
    }

    public double getFacilityCost() {
        return FacilityCost;
    }

    public void setFacilityCost(double facilityCost) {
        FacilityCost = facilityCost;
    }

    public int getFacilityMax_peopel() {
        return FacilityMax_peopel;
    }

    public void setFacilityMax_peopel(int facilityMax_peopel) {
        FacilityMax_peopel = facilityMax_peopel;
    }

    public int getFacilityRen_type_id() {
        return FacilityRen_type_id;
    }

    public void setFacilityRen_type_id(int facilityRen_type_id) {
        FacilityRen_type_id = facilityRen_type_id;
    }

    public int getFacilityFacility_type_id() {
        return FacilityFacility_type_id;
    }

    public void setFacilityFacility_type_id(int facilityFacility_type_id) {
        FacilityFacility_type_id = facilityFacility_type_id;
    }

    public String getFacilityStandar_room() {
        return FacilityStandar_room;
    }

    public void setFacilityStandar_room(String facilityStandar_room) {
        FacilityStandar_room = facilityStandar_room;
    }

    public String getFacilityDescription_other_convenience() {
        return FacilityDescription_other_convenience;
    }

    public void setFacilityDescription_other_convenience(String facilityDescription_other_convenience) {
        FacilityDescription_other_convenience = facilityDescription_other_convenience;
    }

    public double getFacilityPool_area() {
        return FacilityPool_area;
    }

    public void setFacilityPool_area(double facilityPool_area) {
        FacilityPool_area = facilityPool_area;
    }

    public int getFacilityNumber_of_floors() {
        return FacilityNumber_of_floors;
    }

    public void setFacilityNumber_of_floors(int facilityNumber_of_floors) {
        FacilityNumber_of_floors = facilityNumber_of_floors;
    }

    public String getFacility_free() {
        return Facility_free;
    }

    public void setFacility_free(String facility_free) {
        Facility_free = facility_free;
    }
}
