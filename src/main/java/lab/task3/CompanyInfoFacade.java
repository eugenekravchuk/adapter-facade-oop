package lab.task3;

public class CompanyInfoFacade {
    private final PDLReader pdlReader;
    private final WebScraper webScraper;
    private final BrandfetchAPI brandfetchAPI;

    public CompanyInfoFacade() {
        this.pdlReader = new PDLReader();
        this.webScraper = new WebScraper();
        this.brandfetchAPI = new BrandfetchAPI();
    }

    public String getCompanyInformation(String companyName) {
        String pdlInfo = pdlReader.getCompanyDetails(companyName);
        String scrapingInfo = webScraper.scrapeCompanyInfo(companyName);
        String brandingInfo = brandfetchAPI.fetchBrandingDetails(companyName);

        return String.join("\n", pdlInfo, scrapingInfo, brandingInfo);
    }
}