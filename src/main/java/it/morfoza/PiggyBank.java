package it.morfoza;

public class PiggyBank {

    private Long id;
    private String name;
    private String date;
    private Money target;
    private Money current;
    private String description;
    private String long_description;
    private String url_image;
    private String type_piggybank;
    private String jakis_element;

    public PiggyBank(String name, String date, Money target, Money current, String description, String long_description,String url_image, String type_piggybank, String jakis_element) {
        this.name = name;
        this.date = date;
        this.target = target;
        this.current = current;
        this.description=description;
        this.long_description=long_description;
        this.url_image=url_image;
        this.type_piggybank=type_piggybank;
        this.jakis_element=jakis_element;
    }

    public String getName() {
        return name;
    }


    public String getDate() {
        return date;
    }

    public String toString() {
        return name  + date + " target: " + target;
    }

    public String getDescription(){ return description;}
    public String getLong_description(){ return long_description;}
    public String getUrl_image(){return  url_image; }
    public Money getTarget() {
        return (target);
    }

    public Money getCurrent() {
        return current;
    }

    public Long getId() {
        return id;
    }

    public String getJakis_element() {
        return jakis_element;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Money getMisingAmount(){
       return new Money(target.getDoubleValue() - current.getDoubleValue());
    }
    public int getPercentRaised() {
        return (int) (current.getDoubleValue() / target.getDoubleValue() * 100);
    }

    public void payIn(Money amount) {
        current = current.add(amount);
    }

    public void setTarget(Money target) {
        this.target = target;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public String getType_piggybank() {
        // Tu pobierz wartosc pola
        return type_piggybank;
    }

    public void setJakis_element(String jakis_element) {
        this.jakis_element = jakis_element;
    }

    public void setType_piggybank(String type_piggybank) {
        // Tu ustaw pole
        this.type_piggybank = type_piggybank;
    }
}


