package model;

public class Contract {
    private int Contractid;
    private String Contractstart_date;
    private String Contractend_date;
    private double Contractdeposit;
    private int Contractemployee_id;
    private int Contractcustomer_id;
    private int Contractfacility_id;

    public Contract() {
    }

    public Contract(int contractid, String contractstart_date, String contractend_date, double contractdeposit, int contractemployee_id, int contractcustomer_id, int contractfacility_id) {
        Contractid = contractid;
        Contractstart_date = contractstart_date;
        Contractend_date = contractend_date;
        Contractdeposit = contractdeposit;
        Contractemployee_id = contractemployee_id;
        Contractcustomer_id = contractcustomer_id;
        Contractfacility_id = contractfacility_id;
    }

    public int getContractid() {
        return Contractid;
    }

    public void setContractid(int contractid) {
        Contractid = contractid;
    }

    public String getContractstart_date() {
        return Contractstart_date;
    }

    public void setContractstart_date(String contractstart_date) {
        Contractstart_date = contractstart_date;
    }

    public String getContractend_date() {
        return Contractend_date;
    }

    public void setContractend_date(String contractend_date) {
        Contractend_date = contractend_date;
    }

    public double getContractdeposit() {
        return Contractdeposit;
    }

    public void setContractdeposit(double contractdeposit) {
        Contractdeposit = contractdeposit;
    }

    public int getContractemployee_id() {
        return Contractemployee_id;
    }

    public void setContractemployee_id(int contractemployee_id) {
        Contractemployee_id = contractemployee_id;
    }

    public int getContractcustomer_id() {
        return Contractcustomer_id;
    }

    public void setContractcustomer_id(int contractcustomer_id) {
        Contractcustomer_id = contractcustomer_id;
    }

    public int getContractfacility_id() {
        return Contractfacility_id;
    }

    public void setContractfacility_id(int contractfacility_id) {
        Contractfacility_id = contractfacility_id;
    }
}
