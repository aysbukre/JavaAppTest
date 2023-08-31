package aysenurbukre.gokdogan.project.coffe_order_app;

public class Coffee {

    private String name;
    private String[] ingredients;

    public Coffee(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}
