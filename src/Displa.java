public class Displa {
    Pria pr =new Pria(10,20);
    Kolovkvadra kvk=new Kolovkvadra(pr.getWidth(), pr.getLenght(), 5);
    Angular ang =new Angular(pr.getWidth(), pr.getLenght(), kvk.getRadius(),90);
    Pria displa;
    void setMenu(int m){
        if(m==1){
            displa =pr;
            System.out.println(displa.square());
        } else if (m==2) {
            displa=kvk;
            System.out.println(displa.square());
        } else if (m==3) {
            displa=ang;
            System.out.println(displa.square());
        }
    }
}
