package Design_Patterns_And_Priciples.prototype.assignment;

public class Configuration implements ClonableObject <Configuration>{
    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;


    public Configuration(Configuration con){
        this.themeColor = con.themeColor;
        this.autoSave = con.autoSave;
        this.language = con.language;
        this.darkMode = con.darkMode;
        this.fontSize = con.fontSize;
        this.fontFamily = con.fontFamily;
        this.type = con.type;
    }



    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }



    @Override
    public Configuration cloneObject() {
        return new Configuration(this);
    }
}
