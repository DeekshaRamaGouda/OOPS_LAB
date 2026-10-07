abstract class Energysource{
int id;
String name;
double energy;
Energysource(int i,String n,double e){
id=i;
name=n;
energy=e;
}
abstract double calculateefficiency();
void display(){
System.out.println("ID:"+id);
System.out.println("NAME:"+name);
System.out.println("ENERGY:"+energy+"KWH");
System.out.println("EFFICIENCY:"+calculateefficiency()+"%");
}
}
class solarenergy extends Energysource{
solarenergy(int i,String n,double e)
{
super(i,n,e);
}
double calculateefficiency()
{
return(energy/5000)*100;
}
}
class windenergy extends Energysource{
windenergy(int i,String n,double e)
{
super(i,n,e);
}
 double calculateefficiency()
{
return(energy/8000)*100;
}
}
public class main{
public static void main(String[] args)
{
Energysource e;
e=new solarenergy(100,"power",4000);
e.display();
System.out.println();
e=new windenergy(101,"stack",9000);
e.display();
}
}





