package packageHackerRankPriorityQueue;

public class Students {
    
    private int id;
    private String name;
    protected double cgpa;
    
    public Students(int id, String name, double cgpa) {     
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;	        
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    
    public double getCGPA() {
        return this.cgpa;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.cgpa;
    }
}