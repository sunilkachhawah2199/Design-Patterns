package machine_coding.parking_lot.models;

public class Gate extends BaseModel{
    private String name;
    private GateType gateType;

    public Gate(int id, String name, GateType gateType){
        super.setId(id);
        this.name=name;
        this.gateType=gateType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
