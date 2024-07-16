package ExceptionHandling;




public class Exceptions {
    private String name;
    private String format;

    public Exceptions() {
        this.name = "";
        this.format = "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name should not be blank or null");
        }
        this.name = name;
    }

    public String getFormat() {

        return this.format;
    }

    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("The name should not be blank or null");
        }
        this.format = format;
    }

    public static void main(String[] args) {
        try {

            Exceptions example = new Exceptions();

            example.setName("Sample Name");
            example.setFormat("Sample Format");

            System.out.println("Name: " + example.getName());
            System.out.println("Format: " + example.getFormat());

            // Trying to set invalid values
            example.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

