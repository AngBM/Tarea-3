public class Triangulo extends Figura implements Comparable<Triangulo>{
    private double base;
    private double altura;

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    //Se implementa el metodo abstracto
    public double calcularArea(){
        return (base * altura) / 2;
    }

    public double numeroLados() {
        return 3;
    }

    @Override
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

    public int compareTo(Rectangulo rectPorComparar) {
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
}
