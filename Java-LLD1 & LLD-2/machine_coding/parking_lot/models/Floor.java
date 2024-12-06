package machine_coding.parking_lot.models;

import java.nio.channels.FileLock;
import java.util.List;

public class Floor extends BaseModel {
    private int floorNumber;
    private List<Section> sections;
    private FloorStatus floorStatus;

    // getter and setters
    public Floor(int id, List<Section> sections, FloorStatus floorStatus){
        super.setId(id);
        this.sections=sections;
        floorStatus=this.floorStatus;
    }



    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
