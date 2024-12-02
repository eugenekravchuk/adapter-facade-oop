package lab.task3;

public class BrandfetchAPI {
    public String fetchBrandingDetails(String companyName) {
        return String.format("Brandfetch Info: Branding details for %s.", companyName);
    }
}

