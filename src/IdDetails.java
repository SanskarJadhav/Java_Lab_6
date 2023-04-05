abstract public class IdDetails {
    public void displayDetails(String name){
        int id=0;
        for(int i=0; i<name.length(); i++)
        {
            int asciiValue = name.charAt(i);
            id += asciiValue;
        }
        System.out.println("Id: " + id);
        System.out.println("Name: "+name);
    }
}