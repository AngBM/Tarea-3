//figura es abstract porque tiene al menos un m todo abstracto
public class Rectangulo extends Figura implements Comparable<Rectangulo> {
    private double base;
    private double altura;
    
    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
        }

    //Se implementa el metodo abstracto
    public double calcularArea(){
        return base*altura;
    }
    public double numeroLados(){
        return 4;
    }

    @Override
    //implementacion del metodo compareTo
    public int compareTo(Rectangulo rectPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladosPorComparar = rectPorComparar.numeroLados();
        double misLados = this.numeroLados();
                
        if(miArea==areaPorComparar){
            
            if(misLados == ladosPorComparar){
                return 0;
            }
            else if (misLados > ladosPorComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
    public int compareTo(Triangulo triPorComparar) {
        double areaPorComparar = triPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladosPorComparar = triPorComparar.numeroLados();
        double misLados = this.numeroLados();

        if(miArea==areaPorComparar){
            
            if(misLados == ladosPorComparar){
                return 0;
            }
            else if (misLados > ladosPorComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }

    public int compareTo(Circulo circPorComparar) {
        double areaPorComparar = circPorComparar.calcularArea();
        double miArea = this.calcularArea();
        double ladosPorComparar = circPorComparar.numeroLados();
        double misLados = this.numeroLados();

        if(miArea==areaPorComparar){

            if(misLados == ladosPorComparar){
                return 0;
            }
            else if (misLados > ladosPorComparar){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}