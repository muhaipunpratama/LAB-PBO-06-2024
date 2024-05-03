package No1.Dog;


public class Bulldog extends Dog{

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.setPosition(this.getPosition() + 1);
        System.out.println("Bulldog berpindah posisi ke posisi " + this.getPosition());
    }
    
    @Override
    public void describe() {
        System.out.println("""
            Jenis doggy yang dikenal dengan wajahnya yang khas 
            dan tubuh yang kekar. Mereka memiliki kepala yang 
            besar dengan rahang yang kuat, hidung pesek, dan 
            lipatan-lipatan kulit di wajah mereka yang memberikan 
            ekspresi yang unik. Memiliki tubuh yang kompak dan 
            kuat, dengan kaki yang pendek dan tubuh yang rendah.
            """);
    }
}