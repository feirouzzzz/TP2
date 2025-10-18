package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier") // Déclare cette classe comme un bean Spring avec l'identifiant "metier"
public class MetierImpl implements IMetier {

    // Injection de dépendance : Spring injectera automatiquement une implémentation
    // de IDao
    @Autowired
    private IDao dao; // Par défaut, Spring injectera le premier bean compatible trouvé

    @Override
    public double calcul() {
        // Utilise la méthode getValue() de l'implémentation injectée de IDao
        // et multiplie le résultat par 2
        return dao.getValue() * 2;
    }

    // Setter pour l'injection par setter (alternative à l'injection par champ)
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}