package org.bridgelabz;

/**
 * @author Dhruv
 * @project CabInvoiceGenerator
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripHistory {
    private final Map<String, List<Trip>> trips;

    public TripHistory() {
        this.trips = new HashMap<>();
    }
    public List<Trip> getTripsForUser(String userId) {
        return trips.getOrDefault(userId, new ArrayList<>());
    }
    public void addTripsForUser(String userId, List<Trip> tripList) {
        if(!trips.containsKey(userId))
            trips.put(userId,new ArrayList<Trip>());
        trips.get(userId).addAll(tripList);
    }

}