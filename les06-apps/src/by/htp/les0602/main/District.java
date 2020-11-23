package by.htp.les0602.main;

import java.util.List;

public class District {
    private City districtCenter;
    private List<City> cities;

    public District(City districtCenter, List<City> cities) {
        this.districtCenter = districtCenter;
        this.cities = cities;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getDistrictCenter(), getCities());
    }
}
