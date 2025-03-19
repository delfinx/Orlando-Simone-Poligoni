class Poligono{
    public int altezza;
    public int base;
    public int perimetro;
    public int area;
    
    public Poligono(int altezza, int base){
        this.altezza = altezza;
        this.base = base;
    }

    void area(){
        area = altezza * base;     
        System.out.println("Il perimetro è: " + area); 
    }

    void perimetro(){
        perimetro = (altezza + base) * 2; 
        System.out.println("L'area è: " + perimetro);      
    }
    
}