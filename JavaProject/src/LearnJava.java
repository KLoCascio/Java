public class LearnJava {

    public static void main(String[] args) {
        
        // // primitive types
        // int a = 5;
        // char b = 'i';
        // long c = 400;
        // double d = 3.2;

        // // objects
        // String name = "Kyndal";

        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());

        // addExclamationPoint("hot dogs");
        // String exclaim = addExclamationPoint("hot dogs");
        // System.out.println(exclaim);

        Animal a = new Animal();
        String dog = a.iAmDog();
        System.out.println(dog);

    }

    // public static String addExclamationPoint(String s) {
    //     // System.out.println(s + "!");
    //     return s + "!";
    // }


 
}

// // Option 1
// public class Option1 {
//     public static void main(String[] args) {
//         addExclamationPoint("hot dogs");
//     }
//     public static void addExclamationPoint(String s) {
//         System.out.println(s + "!");
//     }
// }

// // Option 2
// public class Option2 {
//     public static void main(String[] args) {
//         String exclaim = addExclamationPoint("hot dogs");
//         System.out.println(exclaim);
//     }
//     public static String addExclamationPoint(String s) {
//         return s + "!";
//     }
// }
