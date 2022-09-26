public class NameMain{
    public static void main(String[] args) {
        Name n = new Name("Sean","Michael","Morris");
        System.out.println(n.lastFirst());
        System.out.println(n.fullName());
        
        Name n1 = new Name("Sting");
        System.out.println(n1.lastFirst());
        System.out.println(n1.fullName());
        
        Name n2 = new Name("George", "Washington");
        System.out.println(n2.lastFirst());
        System.out.println(n2.fullName());        
    }
}
