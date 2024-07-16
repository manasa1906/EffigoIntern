import java.io.*;

class SerializationDemo {
    public static void main(String[] args) {
    	try {
            // Serialization
            MyClass object1 = new MyClass("Hello", -7, 2.110);
            FileOutputStream fos = new FileOutputStream("serializedObject.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object1);
            oos.flush();
            oos.close();
            System.out.println("Serialization successful.");
        } catch (Exception e) {
            System.out.println("Serialization Error: " + e);
            System.exit(0);
        }
        
        try {
            // Deserialization
            MyClass object2;
            FileInputStream fis = new FileInputStream("serializedObject.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            object2 = (MyClass) ois.readObject();
            ois.close();
            System.out.println("Deserialized object: " + object2);
        } catch (Exception e) {
            System.out.println("Deserialization Error: " + e);
            System.exit(0);
        }
}
}
class MyClass implements Serializable {
    String s;
    int i;
    double d;

    MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + ", i=" + i + ", d=" + d;
    }
}
