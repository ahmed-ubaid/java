import java.util.Scanner;

public class Atom {
    Scanner sc=new Scanner(System.in);
    private int electron;
    private int proton;
    private int neutron;
    private String name;

    public Atom(int e,int p,int n,String na){
        this.setProton(p);
        this.setElectron(e);
        this.setNeutron(n);
        this.setName(na);
    }
    public Atom(){
        System.out.println("Enter the Name of the element: ");
        this.setName(sc.next());
        System.out.println("Enter the number of Protons: ");
        this.setProton(sc.nextInt());
        System.out.println("Enter the number of Neutrons: ");
        this.setNeutron(sc.nextInt());
        System.out.println("Enter the number of Electron: ");
        this.setElectron(sc.nextInt());
    }
    public int atomicNumber(){
        return this.proton;
    };
    public int atomicMass(){
        return (this.neutron+this.proton);
    }
    public void printDetails(){
        System.out.println("Details of "+this.getName());
        System.out.println("Proton:"+this.getProton());
        System.out.println("Electron:"+this.getElectron());
        System.out.println("Neutron:"+this.getNeutron());
        System.out.println("Atomic Number:"+this.atomicNumber());
        System.out.println("Atomic Mass:"+this.atomicMass());

    }
    public void setElectron(int e){
        this.electron=e;
    }
    public int getElectron(){
        return this.electron;
    }
    public void setProton(int e){
        this.proton=e;
    }
    public int getProton(){
        return this.proton;
    }
    public void setNeutron(int e){
        this.neutron=e;
    }
    public int getNeutron(){
        return this.neutron;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return this.name;
    }


}
