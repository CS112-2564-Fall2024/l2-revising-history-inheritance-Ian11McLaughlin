public class RevisedEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;
    
    public RevisedEvent() {
        super();

        this.revisedDescription = "None";
        this.citation = "None";
    }

    public RevisedEvent(String description, Date date, String revisedDescription, String citationString) {
        super(description, date);

        this.revisedDescription = revisedDescription;
        this.citation = citationString;

    }
    
    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;

    }

    public void setCitation(String citation) {
        this.citation = citation;
    }
    
    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }
    
    @Override
    public String toString() {
        String superString = super.toString();

        return superString + '\n' + this.revisedDescription + '\n' + this.citation;
    }

    public void teach() {
        System.out.println("====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
        System.out.println(this);
    }
}
