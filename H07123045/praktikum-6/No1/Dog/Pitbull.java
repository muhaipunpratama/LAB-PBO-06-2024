package No1.Dog;

public class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.setPosition(this.getPosition() + 3);
        System.out.println("Pitbull berpindah posisi ke posisi " + this.getPosition());
    }
    
    @Override
    public void describe() {
        System.err.println("""
            Jenis doggy yang diturunkan dari bulldog dan terrier. 
            Sering dianggap kuat dan tangguh, dengan tubuh yang 
            kekar dan otot yang kuat. Mereka biasanya memiliki 
            kepala yang lebar dengan rahang yang kuat. Memiliki 
            bulu pendek dan padat dengan berbagai warna, seperti 
            putih, cokelat, atau hitam.
            """);
    }
}