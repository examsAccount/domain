package za.ac.cput.factory.staff;

import za.ac.cput.domain.staff.StaffDemography;

import java.util.Date;

public class StaffDemographyFactory {
    public static StaffDemography createStaffDemography(String staffNum, String genderId, String raceId, String staffTitle, Date dob){
        return new StaffDemography(staffNum,genderId,raceId,staffTitle,dob);
    }
}
