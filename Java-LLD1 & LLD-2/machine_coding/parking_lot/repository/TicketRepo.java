package machine_coding.parking_lot.repository;


import machine_coding.parking_lot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {
    private static int id=0;
    Map<Integer, Ticket> map;

    // 2 constructor for this map
    public TicketRepo(Map<Integer, Ticket> map){
        this.map=map;
    }

    public TicketRepo(){
        map=new HashMap<>();
    }


    public Ticket insertIcket(Ticket ticket){
        map.put(id, ticket);
        Ticket tt=map.get(id);
        id++;
        return tt;
    }

}
