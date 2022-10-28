package co.com.smartworkout.model.plannutricional.gateways;

import co.com.smartworkout.model.plannutricional.PlanNutricional;

public interface PlanNutricionalRepository {

        void agregar(PlanNutricional planNutricional);

        PlanNutricional consultar(String idCliente);

        void actualizar(String idPlanNutricional, PlanNutricional planNutricional);

        void eliminar(String idPlanNutricional);

        //calcular sumatoria de pliegues
        double calcularSumatoriaPliegues(String idCliente);
        //calcular porcentaje yuhasz
        double calcularPorcentajeYUHASZ(String idCliente);
        //calcular MLG
        double calcularMLG(String idCliente);
}
