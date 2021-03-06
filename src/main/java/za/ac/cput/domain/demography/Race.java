package za.ac.cput.domain.demography;

import java.util.Objects;

public class Race {
    private String raceId,raceDescription;

    public Race(Builder builder) {
        this.raceId = builder.raceId;
        this.raceDescription = builder.raceDescription;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getRaceDescription() {
        return raceDescription;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", raceDescription='" + raceDescription + '\'' +
                '}';
    }
    public static class Builder{
        private String raceId,raceDescription;
        public Builder raceId(String id){
            this.raceId = id;
            return this;
        }
        public Builder raceDescription(String raceDescription){
            this.raceDescription = raceDescription;
            return this;
        }
        public Race build(){
            return new Race(this);
        }
    }
}
