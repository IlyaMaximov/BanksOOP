package edu.phystech.client;

import java.util.List;

import edu.phystech.address.Address;

public record Client(
        long clientId,
        List<Long> accountIds,
        String firstName,
        String secondName,
        String address,
        String passportData,
        boolean verified
) {
    public Client(long clientId, String firstName, String secondName, String address, String passportData, boolean verified) {
        this(clientId, null, firstName, secondName, address, passportData, verified);
    }

}
