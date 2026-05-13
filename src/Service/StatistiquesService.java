package Service;

import Model.Contrat;

public class StatistiquesService {

    public int totalHeures(Contrat contrat) {
        return contrat.getSessions()
                .stream()
                .mapToInt(s -> s.duree())
                .sum();
    }
}
