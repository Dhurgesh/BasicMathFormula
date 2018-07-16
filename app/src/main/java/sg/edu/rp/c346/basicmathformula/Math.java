package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 16033265 on 7/16/2018.
 */

public class Math {

    private String formula;
    private String title;
    private String type;

    public Math(String formula, String title, String type) {
        this.formula = formula;
        this.title = title;
        this.type = type;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Math{" +
                "formula='" + formula + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
