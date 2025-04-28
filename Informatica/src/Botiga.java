import java.util.ArrayList;

public class Botiga {
    private ArrayList<Article> estoc;

    public Botiga() {
        estoc = new ArrayList<>();
    }

    public boolean afegirArticle(Article a) {
        return estoc.add(a);
    }

    public boolean eliminarArticle(Article a) {
        return estoc.remove(a);
    }

    public float valorEstoc() {
        float total = 0f;
        for (Article a : estoc) {
            total += a.preu() * a.getUnitats();
        }
        return total;
    }

    public void llistarEstoc() {
        int discs = 0;
        int cpus = 0;

        for (Article a : estoc) {
            System.out.println(a);
            if (a instanceof DiscDur) discs += a.getUnitats();
            if (a instanceof Cpu) cpus += a.getUnitats();
        }

        System.out.println(discs);
        System.out.println(cpus);
    }
}
